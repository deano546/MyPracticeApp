package is4447.bis.mypracticeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("Passing")){
            TextView tvPass = (TextView) findViewById(R.id.tvPassed);
            String text = getIntent().getExtras().getString("Passing");
            tvPass.setText(text);
    }
}}