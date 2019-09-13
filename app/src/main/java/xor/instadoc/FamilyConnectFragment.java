package xor.instadoc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FamilyConnectFragment extends Fragment {


    RecyclerView recyclerView;
    FamilyConnectAdapter adapter;

    List<single_familyconnect> list;

    private MyAccountViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_familyconnect,container, false);

        list = new ArrayList<>();

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewFamilyConnect);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

       list.add(new single_familyconnect("Vikrant Kumar" ,"Skin Condition",R.drawable.chat_fab,R.drawable.call));
        list.add(new single_familyconnect("Naman Sharma" ,"General",R.drawable.chat_fab,R.drawable.call));
        list.add(new single_familyconnect("Priya Verma" ,"Hairfall",R.drawable.chat_fab,R.drawable.call));

        adapter = new FamilyConnectAdapter(getActivity(),list);

        recyclerView.setAdapter(adapter);




       /* galleryViewModel =
                ViewModelProviders.of(this).get(MyAccountViewModel.class);
        View root = inflater.inflate(R.layout.fragment_familyconnect, container, false);
        final TextView textView = root.findViewById(R.id.text_familyconnect);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        return rootView;
    }
}