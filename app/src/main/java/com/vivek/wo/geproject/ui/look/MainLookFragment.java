package com.vivek.wo.geproject.ui.look;

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

public class MainLookFragment extends Fragment {

    private MainLookViewModel mainLookViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mainLookViewModel =
                ViewModelProviders.of(this).get(MainLookViewModel.class);
        View root = inflater.inflate(R.layout.fragment_main_tab_look, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        mainLookViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
