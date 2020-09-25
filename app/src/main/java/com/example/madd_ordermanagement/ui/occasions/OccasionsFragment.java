package com.example.madd_ordermanagement.ui.occasions;

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
import com.example.madd_ordermanagement.R;

public class OccasionsFragment extends Fragment {

    private OccasionsViewModel occasionsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        occasionsViewModel =
                ViewModelProviders.of(this).get(OccasionsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_occasions, container, false);
        final TextView textView = root.findViewById(R.id.text_occasions);
        occasionsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }
}