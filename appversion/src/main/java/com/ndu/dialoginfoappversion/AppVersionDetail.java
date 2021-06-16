package com.ndu.dialoginfoappversion;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import androidx.appcompat.app.AlertDialog;

public class AppVersionDetail {

    private static String versionName;
    private static int versionCode;

    public static String getVersionName(Activity activity) {
        //getVersionName
        try {
            PackageInfo pInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
            versionName = pInfo.versionName;
        } catch (
                PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            Log.d("MyApp", "PackageManager Catch : " + e.toString());
        }
        return versionName;
    }

    public static int getVersionCode(Activity activity) {
        //getVersionName
        try {
            PackageInfo pInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
            versionCode = pInfo.versionCode;
        } catch (
                PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            Log.d("MyApp", "PackageManager Catch : " + e.toString());
        }
        return versionCode;
    }

    public static void showDialogAppVersionDetail(Activity activity) {

        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(R.string.version_title);
        builder.setMessage("Version Name: " + getVersionName(activity) + "\n" + "Version Code: " + getVersionCode(activity));
        builder.setIcon(R.drawable.ic_baseline_info_24);
        AlertDialog dialog = builder.create();
        //Display the message!
        dialog.show();
    }

}
