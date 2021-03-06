package com.example.vegetablesshop2.ui.MyOrders;

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

import com.example.vegetablesshop2.R;

public class MyOrdersFragment extends Fragment {

    private MyOrdersViewModel myOrdersViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myOrdersViewModel =
                ViewModelProviders.of(this).get(MyOrdersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_orders, container, false);
//        final TextView textView = root.findViewById(R.id.text_my_orders);
        myOrdersViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });
        return root;
    }
}
