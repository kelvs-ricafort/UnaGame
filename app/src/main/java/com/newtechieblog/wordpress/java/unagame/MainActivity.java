package com.newtechieblog.wordpress.java.unagame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    ProgressBar progressBar;
    boolean isProgressVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.imageBtnLogo);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    imageButton.setClickable(false);
                    progressBar.setVisibility(View.VISIBLE);
                    Uri uri = Uri.parse("https://una26.com/?e=2954443&c=una7&fbclid=IwAR0RfekPoN_mG8WWyzNqGskFHG-bni6JLAGXpU_MjYqGi1u5a5cDy_EnhuU");
                    startActivity(new Intent(Intent.ACTION_VIEW, uri));
                    progressBar.setVisibility(View.INVISIBLE);
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}