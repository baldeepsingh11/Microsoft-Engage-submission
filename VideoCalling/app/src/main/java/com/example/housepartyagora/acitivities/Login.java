package com.example.housepartyagora.acitivities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.housepartyagora.R;


public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for changing status bar icon colors
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_login);
    }

    public void onLoginClick(View View){
        Log.i("TAG", "onLoginNextClick: hellew");
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }
    public void onLoginNextClick(View view) {
        Log.i("TAG", "onLoginNextClick: hellew");
        EditText userNameEditText = findViewById(R.id.editTextEmail);
        String userName = userNameEditText.getText().toString();

        if(userName == null || userName == "") {
            Toast.makeText(this, "user name cannot be empty", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(this, VideoCallActivity.class);
            intent.putExtra("userName", userName);
            startActivity(intent);
        }
    }
}
