package com.vivek.wo.geproject.ui.mine;

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

public class MainMineFragment extends Fragment {

    private MainMineViewModel mainMineViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mainMineViewModel =
                ViewModelProviders.of(this).get(MainMineViewModel.class);
        View root = inflater.inflate(R.layout.fragment_main_tab_mine, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        mainMineViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
