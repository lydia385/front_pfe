package com.example.front_pfe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp2 extends AppCompatActivity {
    private Button inscrit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup2);
        inscrit =(Button) findViewById(R.id.inscrit);
        inscrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });

    }
    public void openMenu(){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}


