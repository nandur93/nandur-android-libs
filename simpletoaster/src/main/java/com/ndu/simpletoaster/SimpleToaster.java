package com.ndu.simpletoaster;

import android.content.Context;
import android.widget.Toast;

public class SimpleToaster {
    /*
     * Like you mentioned Toast.LENGTH_SHORT and Toast.LENGTH_LONG are not in ms but 0 or 1.
     *
     * The actual durations are:
     *
     * private static final int LONG_DELAY = 3500; // 3.5 seconds
     * private static final int SHORT_DELAY = 2000; // 2 seconds
     * */
    public static void toaster(Context context, String strMsg, int intLength) {
        Toast.makeText(context,
                strMsg,
                intLength).show();
    }
}
