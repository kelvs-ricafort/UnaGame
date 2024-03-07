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
                    Uri uri = Uri.parse("https://l.facebook.com/l.php?u=http%3A%2F%2Funa26.com%2F%3Fe%3D2954443%26c%3Duna7%26fbclid%3DIwAR3vre_s6Etu1DG8ciIKXlZJFl0a7u7vkHRQWP6g0dJ2nzn_KsToV6svBnY&h=AT3N3RJrCK96oM7ZQw-srC8HmSFO_tU6kRVSrLAaKQtumHBa2ZbGk2N6ztujrrLKztZuZ9UuZV9tXgaMAUy573nS_2AixBMJoXACopNvvXhOFDlIT73TFjpBS9MBbcw5mRw");
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