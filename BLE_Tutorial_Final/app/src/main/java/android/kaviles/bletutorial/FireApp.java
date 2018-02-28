package android.kaviles.bletutorial;

import android.app.Application;
import com.firebase.client.Firebase;
/**
 * Created by dhimaskautsar on 2/26/2018.
 */

public class FireApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
