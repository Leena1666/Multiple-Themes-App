package com.example.multiplethemes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_IslamicTheme, btn_generalTheme;
    private static String sTheme = "IslamicTheme";
    TextView tv_heading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onActivityCreateSetTheme(this);

        setContentView(R.layout.activity_main);

        btn_IslamicTheme = findViewById(R.id.btn_IslamicTheme);
        btn_generalTheme = findViewById(R.id.btn_generalTheme);
        tv_heading = findViewById(R.id.tv_heading);

        btn_IslamicTheme.setOnClickListener(this);
        btn_generalTheme.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_IslamicTheme:
                changeToTheme(this, "IslamicTheme");
                break;
            case R.id.btn_generalTheme:
                changeToTheme(this, "GeneralTheme");
                break;
        }

    }


    public static void changeToTheme(Activity activity, String theme) {
        sTheme = theme;
        activity.finish();
        Intent intent = new Intent(activity, activity.getClass());
        activity.overridePendingTransition(0, 0);
        activity.startActivity(intent);
    }

    public void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            default:
            case "IslamicTheme":
                activity.setTheme(R.style.IslamicTheme);
//                tv_heading.setText("Islamic");
                break;
            case "GeneralTheme":
                activity.setTheme(R.style.GeneralTheme);
//                tv_heading.setText("General");
                break;
        }
    }


}