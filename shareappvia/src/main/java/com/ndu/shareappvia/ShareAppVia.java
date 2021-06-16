package com.ndu.shareappvia;

import android.content.Context;
import android.content.Intent;

public class ShareAppVia {
    public static void shareApp(Context context,
                                String share_via,
                                String app_name,
                                String version_title,
                                String version_name,
                                String build_title,
                                int version_code) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
//        String bitly = getResources().getString(R.string.bitly_share)+getResources().getString(R.string.bitly_dynamic);
//        String direct = getResources().getString(R.string.bitly_share)+getResources().getString(R.string.bitly_direct);
//        String hashtag = getResources().getString(R.string.hashtag);
//        String ofcWeb = getResources().getString(R.string.ofc_website);
//        String download = getResources().getString(R.string.direct_download);
//        String shareBody = tvResult.getText().toString()+"\n\n"+ofcWeb+bitly+"\n"+download+direct+"\n"+hashtag.trim();
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, app_name + " " + version_title + " " + version_name + " " + build_title + " " + version_code);
//        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        context.startActivity(Intent.createChooser(sharingIntent, share_via));
    }
}
