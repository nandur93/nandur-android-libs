package com.ndu.dialoginfoappversion;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import androidx.appcompat.app.AlertDialog;

public class DialogAppVersionName {

    private static String versionName;
    private static int versionCode;

    public static void dialogInfoVersionName(Activity activity) {

        //getVersionName
        try {
            PackageInfo pInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
            versionName = pInfo.versionName;
            versionCode = pInfo.versionCode;
            Log.d("MyApp", "Version Name : " + versionName + "\n Version Code : " + versionCode);
        } catch (
                PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            Log.d("MyApp", "PackageManager Catch : " + e.toString());
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(R.string.version_title);
        builder.setMessage("Version Name: " + versionName + "\n" + "Version Code: " + versionCode);
        builder.setIcon(R.drawable.ic_baseline_info_24);
        AlertDialog dialog = builder.create();
        //Display the message!
        dialog.show();
    }

}
