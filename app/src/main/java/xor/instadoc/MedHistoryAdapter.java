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

public class MedHistoryAdapter extends RecyclerView.Adapter<MedHistoryAdapter.MedHistoryViewHolder> {

    private Context mCtx;
    private List<single_medhistory> listitem;

    public MedHistoryAdapter(Context mCtx, List<single_medhistory> listitem) {
        this.mCtx = mCtx;
        this.listitem = listitem;
    }

    @NonNull
    @Override
    public  MedHistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.single_medhistory_layout,null);
        return new  MedHistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MedHistoryViewHolder holder, int position) {

        single_medhistory sin = listitem.get(position);

        holder.hospitall.setText(sin.getHospitall());
        holder.doctor.setText(sin.getDoctor());
        holder.history.setText(sin.getHistory());
        holder.medicines.setText(sin.getMedicines());
        holder.medicinesInfo.setText(sin.getMedicinesInfo());
        holder.tests.setText(sin.getTests());
        holder.testsInfo.setText(sin.getTestsInfo());
        holder.date.setText(sin.getDate());
        holder.time.setText(sin.getTime());
        holder.booking.setText(sin.getBooking());
        holder.bookingInfo.setText(sin.getBookingInfo());
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    class MedHistoryViewHolder extends RecyclerView.ViewHolder
    {
        TextView hospitall, doctor, history, medicines, medicinesInfo, tests, testsInfo, date, time, booking, bookingInfo;

        public MedHistoryViewHolder(@NonNull View itemView) {
            super(itemView);

            hospitall= itemView.findViewById(R.id.hospitall);
            doctor = itemView.findViewById(R.id.doctor);
            history = itemView.findViewById(R.id.history);
            medicines= itemView.findViewById(R.id.medicines);
            medicinesInfo = itemView.findViewById(R.id.medicinesInfo);
            tests = itemView.findViewById(R.id.tests);
            testsInfo= itemView.findViewById(R.id.testsInfo);
            date = itemView.findViewById(R.id.date);
            time = itemView.findViewById(R.id.time);
            booking= itemView.findViewById(R.id.booking);
            bookingInfo = itemView.findViewById(R.id.bookingInfo);

        }
    }
}
