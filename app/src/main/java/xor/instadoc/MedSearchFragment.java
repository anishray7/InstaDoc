package xor.instadoc;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
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

public class MedSearchFragment extends Fragment {

    RecyclerView recyclerView;
    MedSearchAdapter adapter;
    List<single_medsearch> list;


    private MedSearchViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

       //setHasOptionsMenu(true);

        View rootView = inflater.inflate(R.layout.fragment_medsearch,container,false);

        recyclerView = rootView.findViewById(R.id.recyclerviewMedSearch);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        list = new ArrayList<>();

        list.add(new single_medsearch("Dolamide Tablet 10'S","Ranbaxy Laboratories Ltd.","Uses","Arthritis, Dysmenorrhoea, Migraine","Side Effects","Nausea, Diarrhoea, Dizziness, Vomiting, Constipation","Age Group","5 Yrs +","Doses","Prescribed by the doctor","Order Now"));
        list.add(new single_medsearch("Lupirtin Capsule 10'S","Lupin Ltd.","Uses","Dysmenorrhoea, Migraine","Side Effects","Dizziness, Vomiting, Constipation","Age Group","3 Yrs +","Doses","Prescribed by the doctor","Order Now"));
        list.add(new single_medsearch("Hilerin 25mg Tablet 10'S","East West Pharmaceuticals Pvt. Ltd.","Uses","Anxiety, Tension","Side Effects","Headache, Constipation, Dry mouth, Skin rash, Blurred vision","Age Group","5 Yrs +","Doses","Prescribed by the doctor","Order Now"));
        list.add(new single_medsearch("Isac 20mg Capsule 10'S","Systopic Laboratories Pvt. Ltd.","Uses","Acne","Side Effects","Headache, Dizziness, Vomiting, Constipation","Age Group","8 Yrs +","Doses","Prescribed by the doctor","Order Now"));
        list.add(new single_medsearch("Glimgold Trio 1 Tablet 10'S","Goldline Pharmaceutical Pvt. Ltd.","Uses","Type 2 (non-insulin dependent) Diabetes","Side Effects","Dizziness, Vomiting, Constipation","Age Group","15 Yrs +","Doses","Prescribed by the doctor","Order Now"));
        list.add(new single_medsearch("Pacific 0.5mg Tablet 10'S","Mankind Pharma Pvt Ltd.","Uses","Anxiety, Tension","Side Effects","Diarrhoea, Dizziness, Vomiting, Constipation","Age Group","5 Yrs +","Doses","Prescribed by the doctor","Order Now"));
        list.add(new single_medsearch("SHIGLIP M Tablet 10'S","Shine Pharmaceuticals Ltd.","Uses","Migraine","Side Effects","Nausea, Diarrhoea, Dizziness, Vomiting, Constipation","Age Group","5 Yrs +","Doses","Prescribed by the doctor","Order Now"));
        list.add(new single_medsearch("3D OHA Tablet 10'S","Eris Lifesciences Ltd.","Uses","Type 2 (non-insulin dependent) Diabetes","Side Effects","Headache, Constipation, Dry mouth","Age Group","13 Yrs +","Doses","Prescribed by the doctor","Order Now"));
        list.add(new single_medsearch("Pinoin 10mg Capsule 10'S","East West Pharmaceuticals Pvt. Ltd.","Uses","Acne","Side Effects","Dizziness, Vomiting, Constipation","Age Group","5 Yrs +","Doses","Prescribed by the doctor","Order Now"));
        list.add(new single_medsearch("Zolax SR 0.5mg Tablet 10'S","Intas Pharmaceuticals Ltd.","Uses","Anxiety, Tension","Side Effects","Nausea, Headache, Constipation, Dry mouth","Age Group","7 Yrs +","Doses","Prescribed by the doctor","Order Now"));



        adapter = new MedSearchAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);

        /*
        galleryViewModel =
                ViewModelProviders.of(this).get(MedSearchViewModel.class);
        View root = inflater.inflate(R.layout.fragment_medsearch, container, false);
        final TextView textView = root.findViewById(R.id.text_medsearch);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */
        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.home2,menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);

        SearchView searchView = (SearchView) searchItem.getActionView();
        Log.d("k", "onCreateOptionsMenu: ");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                adapter.getFilter().filter(s);
                return false;
            }
        });

        return;

    }
}