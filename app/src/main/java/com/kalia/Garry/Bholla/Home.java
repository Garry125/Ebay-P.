package com.kalia.Garry.Bholla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kalia.Garry.R;

public class Home extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout layDeal, layout1, layout;
    private Button register;

    TextView tvCategory, tvDeals, tvFollowing, tvMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        register = (Button) findViewById(R.id.register);
        layDeal = (LinearLayout) findViewById(R.id.layDeal);
        layout1 = (LinearLayout) findViewById(R.id.layout1);
        layout = (LinearLayout) findViewById(R.id.layout);
        tvCategory = (TextView) findViewById(R.id.tvCategory);
        tvMore = (TextView) findViewById(R.id.tvMore);
        tvFollowing = (TextView) findViewById(R.id.tvFollowing);
        tvDeals = (TextView) findViewById(R.id.tvDeals);
        layout1.setOnClickListener(this);
        layout.setOnClickListener(this);
        tvMore.setOnClickListener(this);
        layDeal.setOnClickListener(this);
        register.setOnClickListener(this);
        tvDeals.setOnClickListener(this);
        tvFollowing.setOnClickListener(this);
        tvCategory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.layout:
                startActivity(new Intent(Home.this, Detail.class));
                break;
            case R.id.layout1:
                startActivity(new Intent(Home.this, Dysons.class));
                break;
            case R.id.layDeal:
                startActivity(new Intent(Home.this, DetailsS.class));
                break;
            case R.id.tvCategory:
                startActivity(new Intent(Home.this, Categories.class));
                break;
            case R.id.register:
                startActivity(new Intent(Home.this, Register.class));
                break;
            case R.id.tvFollowing:
                startActivity(new Intent(Home.this, BookMark.class));
                break;
            case R.id.tvDeals:
                startActivity(new Intent(Home.this, FeatureDetail.class));
                break;
        }
    }
}
