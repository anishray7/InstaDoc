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

public class SettingsFragment extends Fragment {


    RecyclerView recyclerView;
    SettingsAdapter adapter;

    List<single_settings> list;

    private SettingsViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,

                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_settings,container, false);

        list = new ArrayList<>();

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewSettings);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list.add(new single_settings("Language" ,"English",""));
        list.add(new single_settings("Font Size" ,"Medium",""));
        list.add(new single_settings("Reminder" ,"Volume, Duration",""));
        list.add(new single_settings("Help" ,"Contact Us",""));
        list.add(new single_settings("Version" ,"v1.0",""));

        adapter = new SettingsAdapter(getActivity(),list);

        recyclerView.setAdapter(adapter);

        /*
        galleryViewModel =
                ViewModelProviders.of(this).get(SettingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        final TextView textView = root.findViewById(R.id.text_settings);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return rootView;
    }
}