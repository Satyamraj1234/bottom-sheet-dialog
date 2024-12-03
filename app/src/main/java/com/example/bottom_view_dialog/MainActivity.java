package com.example.bottom_view_dialog;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button to open Bottom Sheet
        findViewById(R.id.open_bottom_sheet).setOnClickListener(view -> showBottomSheet());
    }

    private void showBottomSheet() {
        // Inflate the Bottom Sheet layout
        View view = getLayoutInflater().inflate(R.layout.bottom_sheet_layout, null);

        // Create a BottomSheetDialog
        BottomSheetDialog dialog = new BottomSheetDialog(this);
        dialog.setContentView(view);

        // Handle button actions
        view.findViewById(R.id.action_button).setOnClickListener(v -> {
            // Perform action on button click
            dialog.dismiss();
        });

        view.findViewById(R.id.cancel_button).setOnClickListener(v -> dialog.dismiss());

        // Show the dialog
        dialog.show();
    }
}
