package com.example.testdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingBuildInfo;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.testdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    }

    public void xuly(View v){
        binding.txtName.setText(binding.editText.getText().toString());
    }
}
