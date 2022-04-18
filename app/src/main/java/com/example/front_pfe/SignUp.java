package com.example.front_pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {
    private Button suivant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup1);
        suivant =(Button) findViewById(R.id.suivant);
        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUp2();
            }
        });

    }
    public void openSignUp2(){
        Intent intent = new Intent(this, SignUp2.class);
        startActivity(intent);
    }
}


