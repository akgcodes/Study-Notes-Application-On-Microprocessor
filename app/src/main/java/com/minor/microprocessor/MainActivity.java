package com.minor.microprocessor;

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      /*  requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);*/

        setContentView(R.layout.activity_main);



        final Thread thread = new Thread() {
            public void run() {
                try {

                   /* ImageView imageView=findViewById(R.id.back);
                    imageView.animate().alpha(1);
                    Animation animSlide = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide);
                    imageView.startAnimation(animSlide);*/
                    sleep(2000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    // if (SharedPrefManager.getBooleanPreferences(getApplicationContext(), "IS_LOGIN")) {
                    startActivity(new Intent(MainActivity.this,Dashboard.class));


                }
            }
        };
        thread.start();
    }
}

