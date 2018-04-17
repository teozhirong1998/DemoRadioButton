package com.example.a16022635.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOk;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the RadioGroup object
                rg = (RadioGroup) findViewById(R.id.radioGroup);
                //Get the ID of the selected radio button in the RadioGroup
                int selectedButtonId = rg.getCheckedRadioButtonId();
                //Get the radio button object from the ID we had gotten above
                rb = (RadioButton) findViewById(selectedButtonId);
                //Show a Toast that display the text on the text on the selected radio button
                Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_LONG).show();
            }
        });
    };
}

