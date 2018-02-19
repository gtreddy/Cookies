package com.example.anroid.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatCookie(View view){
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView img =(ImageView)findViewById(R.id.android_cookie_image_view);
        img.setImageResource(R.drawable.after_cookie);



        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView txt=(TextView)findViewById(R.id.status_text_view);
        txt.setText("I'am so full");

    }

    public void onButtonClicked(View view) {
        eatCookie(view);
    }
}
