package org.androidtown.team_introduce;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Member2 extends AppCompatActivity {
    Button btn_mem2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member2);
        ImageView mem2;
        mem2 = findViewById(R.id.imageView_mem2);
        btn_mem2 = findViewById(R.id.btn_mem2);

        btn_mem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ybib"));
                startActivity(myIntent);
            }
        });

        mem2.setImageResource(R.drawable.ro);
    }
}
