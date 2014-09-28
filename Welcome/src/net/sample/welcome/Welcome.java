package net.sample.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Welcome extends Activity {
    /** Called when the branch1.2 activity is first created. */
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new WelcomeShow(this));
    }
}