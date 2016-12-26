package com.mb.imagescalling;


import android.app.Activity;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by MB on 16-12-2016.
 */

public class NewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Uri newUri = Uri.parse(getIntent().getStringExtra("imageUri"));

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageURI(newUri);
    }
}
