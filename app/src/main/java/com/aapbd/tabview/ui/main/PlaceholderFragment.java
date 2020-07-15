package com.aapbd.tabview.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.aapbd.tabview.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    static  TextView textView;

    public static PlaceholderFragment newInstance() {
        PlaceholderFragment fragment = new PlaceholderFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        textView= root.findViewById(R.id.section_label);
        return root;
    }

    public static void setTextFromMainActivity(String searchText){
        textView.setText(searchText); //todo here you can call any api for get search query data
    }
}