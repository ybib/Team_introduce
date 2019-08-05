package org.androidtown.team_introduce;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Member3 extends AppCompatActivity {
    Button btn_mem3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member3);

        ImageView mem3;
        mem3 = findViewById(R.id.imageView_mem3);
        btn_mem3 = findViewById(R.id.btn_mem3);
        mem3.setImageResource(R.drawable.jang);

        btn_mem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/JeongJaeDeok"));
                startActivity(myIntent);
            }
        });
    }
}
