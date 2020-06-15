package com.example.weatherfragment.ui.changeCity;

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

import com.example.weatherfragment.R;

public class ChangeCityFragment extends Fragment {

    private ChangeCityViewModel changeCityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        changeCityViewModel =
                ViewModelProviders.of(this).get(ChangeCityViewModel.class);
        View root = inflater.inflate(R.layout.fragment_change_city, container, false);
        final TextView textView = root.findViewById(R.id.text_change_city);
        changeCityViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}