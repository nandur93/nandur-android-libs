package com.ndu.nandurlibs;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import static com.ndu.dialoginfoappversion.AppVersionDetail.getVersionCode;
import static com.ndu.dialoginfoappversion.AppVersionDetail.getVersionName;
import static com.ndu.dialoginfoappversion.AppVersionDetail.showDialogAppVersionDetail;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast();
    }

    private void showToast() {
        showDialogAppVersionDetail(this);
        Log.d("TAG", "showToast: " + getVersionName(this));
        Log.d("TAG", "showToast: " + getVersionCode(this));

//        SimpleToaster.toaster(this,"Hallo",0);
    }
}