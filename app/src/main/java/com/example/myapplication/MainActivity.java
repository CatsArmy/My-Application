package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout._main_activity_);

        super.getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container_view, MainFragment.class,null).commit();

    }

    @Override
    protected void onResume() {
        super.getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_view, SignUpFragment.class,null).commit();
        super.onResume();
    }

    //    // /*
//    @Override
//    protected void onResume() {
//        ModalBottomSheet modalBottomSheet = new ModalBottomSheet();
//        modalBottomSheet.show(super.getSupportFragmentManager(), ModalBottomSheet.TAG);
//        super.onResume();
//    }
//// */
}

