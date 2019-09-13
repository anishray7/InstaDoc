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

public class MedHistoryFragment extends Fragment {

    RecyclerView recyclerView;
    MedHistoryAdapter adapter;

    List<single_medhistory> list;

    private MedHistoryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_medhistory,container, false);

        list = new ArrayList<>();

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerviewMedHistory);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

       list.add(new single_medhistory("Apollo Hospital","Dr. Ayesha Shahnaz","Chest Pain","Medicines","Pinoin 10mg Capsule 10'S","Tests","Blood Test, X-Ray","12/08/2019","01:12 P.M.","Med Booking","Offline"));
        list.add(new single_medhistory("Apollo Hospital","Dr. Sujoy Khan","Mild Fever","Medicines","3D OHA Tablet 10'S","Tests","Blood Test","01/09/2019","09:12 A.M.","Med Booking","Apollo Pharmaceuticals"));

        adapter = new MedHistoryAdapter(getActivity(),list);

        recyclerView.setAdapter(adapter);

        /*galleryViewModel =
                ViewModelProviders.of(this).get(MedHistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_medhistory, container, false);
        final TextView textView = root.findViewById(R.id.text_medhistory);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return rootView;
    }
}