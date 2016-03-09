package activities.suport.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import pk.nimgade.com.myapp.MainActivity;
import pk.nimgade.com.myapp.R;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_TIME = 1000;  /* 2 seconds */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                                /* Create an intent that will start the main activity. */
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);

                                /* Finish splash activity so user cant go back to it. */
                SplashActivity.this.finish();

                                /* Apply our splash exit (fade out) and main
                                   entry (fade in) animation transitions. */
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }, SPLASH_DISPLAY_TIME);
    }
}
