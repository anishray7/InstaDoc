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

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private Context mCtx;
    private List<single_home> listitem;

    public HomeAdapter(Context mCtx, List<single_home> listitem) {
        this.mCtx = mCtx;
        this.listitem = listitem;
    }

    @NonNull
    @Override
    public  HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.single_home_layout,null);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {

        single_home sin = listitem.get(position);

        holder.heading.setText(sin.getHeading());
        holder.headingInfo.setText(sin.getHeadingInfo());
        holder.headingImage.setImageResource(sin.getHeadingImage());
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    class HomeViewHolder extends RecyclerView.ViewHolder
    {
        TextView heading,headingInfo;
        ImageView headingImage;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);

            heading = itemView.findViewById(R.id.connectName);
            headingInfo = itemView.findViewById(R.id.connectInfo);
            headingImage = itemView.findViewById(R.id.headingImage);
        }
    }
}
