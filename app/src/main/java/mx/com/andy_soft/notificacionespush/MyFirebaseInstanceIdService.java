package mx.com.andy_soft.notificacionespush;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Montemayor on 05/08/17.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    //Para ver en consola las notificaciones solo de Firebase
    public static final String TAG = "Aviso Firebase Lorenzo Montemayor";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String tokenTelefono = FirebaseInstanceId.getInstance().getToken();


        //Log para ver el Token del telefono
        //Log.d(TAG, "Token Asignado: " + tokenTelefono );
        //Log.d(TAG,"Token");
    }
}
