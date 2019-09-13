package xor.instadoc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AppointmentsFragment extends Fragment {

    RecyclerView recyclerView;
    appointmentsAdapter adapter;

    private static final int REQUEST_CALL =1;


    List<single_appointments> list;

    private MyAccountViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_appointments,container, false);

        list = new ArrayList<>();
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewAppointments);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list.add(new single_appointments("11 Sept. 2019","11:00   A.M.","Dr. Alok Kumar","Dermatologist","Apollo Clinic","Opposite Jail, Dehradun Rd, Roorkee, Uttarakhand","9897406488"));

        list.add(new single_appointments("23 Sept. 2019","09:00   A.M.","Dr. Rohit Chawla","Physiotherapist","MAX Super Speciality Hospital","1 & 2, Press Enclave Marg Saket District Centre, Saket Institutional Area, Saket, Delhi","9228993849"));

        list.add(new single_appointments("04 Oct. 2019","08:00   P.M.","Dr. Alok Kumar","Dermatologist","Apollo Clinic","Opposite Jail, Dehradun Rd, Roorkee, Uttarakhand","9897406488"));

        adapter = new appointmentsAdapter(getActivity(),list);

        recyclerView.setAdapter(adapter);
/*
       galleryViewModel =
                ViewModelProviders.of(this).get(MyAccountViewModel.class);
        View root = inflater.inflate(R.layout.fragment_appointments, container, false);
        final TextView textView = root.findViewById(R.id.text_appointments);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        return rootView;
    }
}