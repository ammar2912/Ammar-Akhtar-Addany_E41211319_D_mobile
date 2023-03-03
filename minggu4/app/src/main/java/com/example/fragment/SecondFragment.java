package com.example.fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.app.Fragment;
import androidx.annotation.Nullable;
public class SecondFragment extends Fragment{
    View view;
    Button SecondButton;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle SavedInstanceState) {
        view = inflater.inflate(R.layout.fragment_second, container, false);

        SecondButton = view.findViewById(R.id.secondButton);

        SecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}

