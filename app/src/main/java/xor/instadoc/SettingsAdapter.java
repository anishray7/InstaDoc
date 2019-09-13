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

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.SettingsViewHolder> {

    private Context mCtx;
    private List<single_settings> listitem;

    public SettingsAdapter(Context mCtx, List<single_settings> listitem) {
        this.mCtx = mCtx;
        this.listitem = listitem;
    }

    @NonNull
    @Override
    public  SettingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.single_settings_layout,null);
        return new  SettingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsViewHolder holder, int position) {

        single_settings sin = listitem.get(position);

        holder.settings.setText(sin.getSettings());
        holder.settingsInfo.setText(sin.getSettingsInfo());
        holder.divider.setText(sin.getDivider());
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    class SettingsViewHolder extends RecyclerView.ViewHolder
    {
        TextView settings,settingsInfo,divider;

        public SettingsViewHolder(@NonNull View itemView) {
            super(itemView);

            settings= itemView.findViewById(R.id.settings);
            settingsInfo = itemView.findViewById(R.id.settingsInfo);
            divider = itemView.findViewById(R.id.divider);

        }
    }
}
