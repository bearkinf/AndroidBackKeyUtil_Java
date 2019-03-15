package kr.bearkinf.yena.android_backkey_java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import kr.bearkinf.yena.backkey_library_java.BackKeyFinishHandler;


public class MainActivity extends AppCompatActivity {


    BackKeyFinishHandler backKeyFinishHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backKeyFinishHandler = new BackKeyFinishHandler(this);


        Log.d("bear","start");

    }


    @Override
    public void onBackPressed() {
        // super.onBackPressed();
        backKeyFinishHandler.onBackPressed();


    }
}
