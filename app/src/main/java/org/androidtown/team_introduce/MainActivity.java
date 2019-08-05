package org.androidtown.team_introduce;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_ro;
    ImageView imageView_han;
    ImageView imageView_jang;
    Button btn_git,btn_quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Drawable alpha = ((ImageView)findViewById(R.id.imageView_han)).getBackground();
//        alpha.setAlpha(50);


        imageView_ro = findViewById(R.id.imageView_ro);
        imageView_jang = findViewById(R.id.imageView_jang);
        imageView_han = findViewById(R.id.imageView_han);
        btn_git = findViewById(R.id.btn_git);
        btn_quit = findViewById(R.id.btn_quit);

        imageView_han.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Member1.class);
                MainActivity.this.startActivity(intent);

            }
        });

        imageView_ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Member2.class);
                MainActivity.this.startActivity(intent);

            }
        });

        imageView_jang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Member3.class);
                MainActivity.this.startActivity(intent);

            }
        });

        btn_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        imageView_han.setImageResource(R.drawable.han);
        imageView_jang.setImageResource(R.drawable.jang);
        imageView_ro.setImageResource(R.drawable.ro);

    }
}
