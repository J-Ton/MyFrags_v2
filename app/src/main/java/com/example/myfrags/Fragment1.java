package com.example.myfrags;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment {

    public interface OnButtonClickListener {
        public void onButtonClickShuffle();
        public void onButtonClickClockwise();
        public void onButtonClickHide();
        public void onButtonClickRestore();
    }

    private OnButtonClickListener callback = null;

    public void setOnButtonClickListener(OnButtonClickListener callback) {
        this.callback = callback;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        Button btnShuffle = (Button) view.findViewById(R.id.button_shuffle);
        Button btnClockwise = (Button) view.findViewById(R.id.button_clockwise);
        Button btnHide = (Button) view.findViewById(R.id.button_hide);
        Button btnRestore = (Button) view.findViewById(R.id.button_restore);


        btnShuffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callback != null) callback.onButtonClickShuffle();
            }
        });

        btnClockwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callback != null) callback.onButtonClickClockwise();
            }
        });

        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callback != null) callback.onButtonClickHide();
            }
        });

        btnRestore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callback != null) callback.onButtonClickRestore();
            }
        });
        return view;
    }
}