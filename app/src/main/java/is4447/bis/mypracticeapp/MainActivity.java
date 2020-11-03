package is4447.bis.mypracticeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    String strValue = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnView = (Button) findViewById(R.id.btnView);
        final EditText etAdd = (EditText) findViewById(R.id.etAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String strValidation = etAdd.getText().toString();
            if(TextUtils.isEmpty(strValidation)) {
                Toast.makeText(MainActivity.this, "enter something eejit", Toast.LENGTH_SHORT).show();
            }
            else {
                strValue = etAdd.getText().toString();
                Toast.makeText(MainActivity.this, strValue, Toast.LENGTH_SHORT).show();
            }

            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("Passing", strValue);
                startActivity(startIntent);
            }
        });



    }
}