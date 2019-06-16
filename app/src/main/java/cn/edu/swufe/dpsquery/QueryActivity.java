package cn.edu.swufe.dpsquery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class QueryActivity extends AppCompatActivity {

    EditText dps;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        dps=findViewById(R.id.query);
        result=findViewById(R.id.showout);
    }

    public void onClick(View btn){

    }
}
