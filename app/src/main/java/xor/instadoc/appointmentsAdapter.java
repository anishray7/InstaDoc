package xor.instadoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class appointmentsAdapter extends RecyclerView.Adapter<appointmentsAdapter.appointmentsViewHolder> {

    private Context mCtx;
    private List<single_appointments> listitem;

    public appointmentsAdapter(Context mCtx, List<single_appointments> listitem) {
        this.mCtx = mCtx;
        this.listitem = listitem;
    }

    @NonNull
    @Override
    public appointmentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.single_appointments_layout,null);
        return new appointmentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull appointmentsViewHolder holder, int position) {

        single_appointments sin = listitem.get(position);

        holder.date.setText(sin.getDate());
        holder.time.setText(sin.getTime());
        holder.name.setText(sin.getName());
        holder.field.setText(sin.getField());
        holder.hospital.setText(sin.getHospital());
        holder.address.setText(sin.getAddress());
        holder.contact.setText(sin.getContact());
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    class appointmentsViewHolder extends RecyclerView.ViewHolder
    {
        TextView date,time,name,field,hospital,address,contact;

        public appointmentsViewHolder(@NonNull View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.date);
            time = itemView.findViewById(R.id.time);
            name = itemView.findViewById(R.id.name);
            field = itemView.findViewById(R.id.field);
            hospital = itemView.findViewById(R.id.hospital);
            address = itemView.findViewById(R.id.address);
            contact = itemView.findViewById(R.id.contact);
        }
    }
}
