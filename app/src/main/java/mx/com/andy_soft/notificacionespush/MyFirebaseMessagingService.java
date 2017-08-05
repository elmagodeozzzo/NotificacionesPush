package mx.com.andy_soft.notificacionespush;

import android.util.Log;
//import android.util.*;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Montemayor on 05/08/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        //Validamos si el mensaje tiene una notificación
        if( remoteMessage.getNotification() != null) {
            String remitente = remoteMessage.getFrom();
            //Log.d(MyFirebaseInstanceIdService.TAG, "FROM: " + remitente);
        }


    }
}
