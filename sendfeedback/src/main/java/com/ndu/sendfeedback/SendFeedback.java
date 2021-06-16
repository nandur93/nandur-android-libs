package com.ndu.sendfeedback;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

import java.text.MessageFormat;

public class SendFeedback {
    /**
     * Email client intent to send support mail
     * Appends the necessary device information to email body
     * useful when providing support
     */
    public static void sendFeedback(Context context,
                                    String pattern_mail,
                                    String feed_body,
                                    String app_name,
                                    String email_client,
                                    String target_mail,
                                    String version_name,
                                    int version_code) {
        /*
        Put this in string.xml
        \n\n-----------------------------\nPlease do not delete this section\nDevice OS: Android\nDevice OS version: {0}\nApp Version: {1} build {5}\nDevice Brand: {2}\nDevice Model: {3}\nDevice Manufacturer: {4}
        */
        String body = MessageFormat.format(pattern_mail, Build.VERSION.RELEASE, version_name, Build.BRAND, Build.MODEL, Build.MANUFACTURER, version_code);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{target_mail});
        intent.putExtra(Intent.EXTRA_SUBJECT, MessageFormat.format("{0} {1} v{2} b{3}", feed_body, app_name, version_name, version_code));
        intent.putExtra(Intent.EXTRA_TEXT, body);
        context.startActivity(Intent.createChooser(intent, email_client));
    }
}
