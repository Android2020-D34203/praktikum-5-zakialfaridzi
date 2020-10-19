package id.ac.id.telkomuniversity.tass.praktikum5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    String username,password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent i = getIntent();
        username= i.getStringExtra("username");
        password = i.getStringExtra("password");

        TextView displayUsername = findViewById(R.id.displayUsername);
        TextView displayPassword = findViewById(R.id.displayPassword);

        displayUsername.setText("Username anda adalah: "+username.toString());
        displayPassword.setText("Password anda adalah: "+password.toString());
    }
}
