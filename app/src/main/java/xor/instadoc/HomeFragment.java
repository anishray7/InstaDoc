package xor.instadoc;

import android.content.Intent;
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

public class HomeFragment extends Fragment implements View.OnClickListener {

        RecyclerView recyclerView;
        HomeAdapter adapter;

        TextView textView;
        List<single_home> list;

    private MyAccountViewModel galleryViewModel;

public View onCreateView(@NonNull LayoutInflater inflater,
        ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home,container, false);

        textView = (TextView) rootView.findViewById(R.id.emergencyInfo);



        list = new ArrayList<>();

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerviewHome);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list.add(new single_home("Just 2 glasses of soft drinks daily tied to higher death risk"," A study of nearly 452,000 people ties higher soft drinks consumption — including of those artificially and sugar sweetened — to raised risk of early death.",R.drawable.home1));

        list.add(new single_home("Differences in gut bacteria may predispose to heart attacks","A small study has found that people with acute coronary syndrome have distinct populations of gut bacteria, suggesting these may influence heart attacks.",R.drawable.home2));

        list.add(new single_home("Type 2 diabetes, obesity: Weight loss surgery may lower death risk" ,"A large study finds that weight loss surgery lowers the risk of death and cardiovascular events among people with obesity and type 2 diabetes.",R.drawable.home3));

        adapter = new HomeAdapter(getActivity(),list);

        recyclerView.setAdapter(adapter);

        textView.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View view) {

                        Intent intent = new Intent(getContext(),SOS.class);
                        startActivity(intent);
                }
        });



      /*  galleryViewModel =
        ViewModelProviders.of(this).get(MyAccountViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
final TextView textView = root.findViewById(R.id.text_home);
        galleryViewModel.getText().observe(this, new Observer<String>() {
@Override
public void onChanged(@Nullable String s) {
        textView.setText(s);
        }
        });*/
        return rootView;
        }


        @Override
        public void onClick(View view) {

        }
}