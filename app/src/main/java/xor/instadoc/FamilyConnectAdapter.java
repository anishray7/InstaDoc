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

public class FamilyConnectAdapter extends RecyclerView.Adapter<FamilyConnectAdapter.FamilyConnectViewHolder> {

    private Context mCtx;
    private List<single_familyconnect> listitem;

    public FamilyConnectAdapter(Context mCtx, List<single_familyconnect> listitem) {
        this.mCtx = mCtx;
        this.listitem = listitem;
    }

    @NonNull
    @Override
    public  FamilyConnectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.single_familyconnect_layout,null);
        return new  FamilyConnectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FamilyConnectViewHolder holder, int position) {

        single_familyconnect sin = listitem.get(position);

        holder.connectName.setText(sin.getConnectName());
        holder.connectInfo.setText(sin.getConnectInfo());
        holder.msg.setImageResource(sin.getMsg());
        holder.call.setImageResource(sin.getCall());
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    class FamilyConnectViewHolder extends RecyclerView.ViewHolder
    {
        TextView connectName,connectInfo;
        ImageView msg,call;

        public FamilyConnectViewHolder(@NonNull View itemView) {
            super(itemView);

            connectName= itemView.findViewById(R.id.connectName);
            connectInfo = itemView.findViewById(R.id.connectInfo);
            msg = itemView.findViewById(R.id.msg);
            call = itemView.findViewById(R.id.call);

        }
    }
}
