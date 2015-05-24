package com.heyanbo.photogallery;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by kaite on 2015/5/24.
 */
public class NotificationReceiver extends BroadcastReceiver {
    private static final String TAG="NotificationReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG,"NotificationReceiver is coming!");
        if (getResultCode()!= Activity.RESULT_OK){
            Log.i(TAG,"Notification now is cancel!");
            return;
        }

        int requestCode  = intent.getIntExtra("REQUEST_CODE",0);
        Notification notification =  (Notification)intent.getParcelableExtra("NOTIFICATION");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(requestCode,notification);

    }
}
