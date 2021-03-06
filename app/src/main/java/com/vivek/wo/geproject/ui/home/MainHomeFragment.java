package com.vivek.wo.geproject.ui.home;

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

import com.vivek.wo.geproject.R;

public class MainHomeFragment extends Fragment {

    private MainHomeViewModel mainHomeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mainHomeViewModel =
                ViewModelProviders.of(this).get(MainHomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_main_tab_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        mainHomeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
