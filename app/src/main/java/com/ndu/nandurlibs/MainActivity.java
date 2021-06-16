package com.ndu.nandurlibs;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ndu.dialoginfoappversion.DialogAppVersionName;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast();
    }

    private void showToast() {
        DialogAppVersionName.dialogInfoVersionName(this);
//        SimpleToaster.toaster(this,"Hallo",0);
    }
}