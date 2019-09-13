package xor.instadoc;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MedSearchAdapter extends RecyclerView.Adapter<MedSearchAdapter.MedSearchViewHolder> implements Filterable {

    private Context mctx;

    private List<single_medsearch> listitem;
    private List<single_medsearch> listitemFull;

    public MedSearchAdapter(Context mctx, List<single_medsearch> listitem) {
        this.mctx = mctx;
        this.listitem = listitem;
        listitemFull = new ArrayList<>(listitem);
    }
    @NonNull
    @Override

    public MedSearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mctx);
        View view = inflater.inflate(R.layout.single_medsearch_layout,null);
        return new MedSearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MedSearchViewHolder holder, int position) {

        single_medsearch sin = listitem.get(position);

        holder.medName.setText(sin.getMedName());
        holder.manufacturer.setText(sin.getManufacturer());
        holder.uses.setText(sin.getUses());
        holder.infoUses.setText(sin.getInfoUses());
        holder.sideEffects.setText(sin.getSideEffects());
        holder.infoSideEffects.setText(sin.getInfoSideEffects());
        holder.ageGroup.setText(sin.getAgeGroup());
        holder.infoAgeGroup.setText(sin.getInfoAgeGroup());
        holder.doses.setText(sin.getDoses());
        holder.infoDoses.setText(sin.getInfoDoses());
        holder.orderNow.setText(sin.getOrderNow());

    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    public class MedSearchViewHolder extends RecyclerView.ViewHolder {

        TextView medName, manufacturer, uses, infoUses, sideEffects, infoSideEffects, ageGroup, infoAgeGroup, doses, infoDoses, orderNow;


        public MedSearchViewHolder(@NonNull View itemView) {
            super(itemView);

            medName = itemView.findViewById(R.id.medName);
            manufacturer = itemView.findViewById(R.id.manufacturer);
            uses = itemView.findViewById(R.id.uses);
            infoUses = itemView.findViewById(R.id.infoUses);
            sideEffects = itemView.findViewById(R.id.sideEffects);
            ageGroup = itemView.findViewById(R.id.ageGroup);
            infoAgeGroup = itemView.findViewById(R.id.infoAgeGroup);
            infoSideEffects = itemView.findViewById(R.id.infoSideEffects);
            doses = itemView.findViewById(R.id.doses);
            infoDoses = itemView.findViewById(R.id.infoDoses);
            orderNow = itemView.findViewById(R.id.orderNow);
        }
    }

    @Override

    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {

            String charString = charSequence.toString();

            Log.d("j", "performFiltering: ");
            List<single_medsearch> filteredList = new ArrayList<>();

            if(charString.isEmpty())
            {
                filteredList.addAll(listitemFull);
            }
            else
            {
                String filterPattern = charSequence.toString().toLowerCase().trim();


                for(single_medsearch item: listitemFull)
                {
                    if(item.getMedName().toLowerCase().contains(filterPattern))
                    {
                        filteredList.add(item);
                    }
                }


            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {

            listitem.clear();
            listitem.addAll((List<single_medsearch>) filterResults.values);
            notifyDataSetChanged();
        }
    };


}
