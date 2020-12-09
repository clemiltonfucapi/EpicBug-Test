package com.anderson.epicbug;

import androidx.appcompat.app.AppCompatActivity;
import androix.widgets.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeTest(getApplicationContext(),"Oriel MSG",Toast.LENGHT_SHORT).show();
    }
}
