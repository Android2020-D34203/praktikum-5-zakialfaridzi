package id.ac.id.telkomuniversity.tass.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText uname,pword;
    Button btnLogin,btnForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname  = findViewById(R.id.uname);
        pword = findViewById(R.id.password);

        btnLogin = findViewById(R.id.btnLogin);
        btnForgot = findViewById(R.id.btnForgot);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = uname.getText().toString();
                String password = pword.getText().toString();
                Intent i = new Intent(MainActivity.this,ActivityKedua.class);
                i.putExtra("username",username);
                i.putExtra("password",password);
                startActivity(i);
            }
        });

        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ActivityKetiga.class);
                startActivity(i);
            }
        });


    }
}