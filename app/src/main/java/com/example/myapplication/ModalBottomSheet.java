package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ModalBottomSheet extends BottomSheetDialogFragment {

    public static final String TAG = "ModalBottomSheet";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        BottomSheetBehavior modalBottomSheetBehavior = ((BottomSheetDialog)this.getDialog()).getBehavior();
        modalBottomSheetBehavior.setHideable(false);
        return inflater.inflate(R.layout.select_device_dialog, container, false);
    }
}
