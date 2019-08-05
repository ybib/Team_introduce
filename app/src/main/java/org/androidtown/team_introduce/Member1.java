package org.androidtown.team_introduce;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Member1 extends AppCompatActivity {
    Button btn_mem1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member1);
        ImageView mem1;
        mem1 = findViewById(R.id.imageView_mem1);
        btn_mem1 = findViewById(R.id.btn_mem1);

        btn_mem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ChanYoungHan"));
                startActivity(myIntent);
            }
        });

        mem1.setImageResource(R.drawable.han);
    }
}
