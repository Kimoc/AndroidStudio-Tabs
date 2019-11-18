package com.aarongutierrez.perfildeusuario;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class PlaceholderFragment extends Fragment {
    private TextView prueba;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout=inflater.inflate(R.layout.fragment_personal_layout,container,false);
        prueba=layout.findViewById(R.id.tvNombre);
        return layout;

    }
}
