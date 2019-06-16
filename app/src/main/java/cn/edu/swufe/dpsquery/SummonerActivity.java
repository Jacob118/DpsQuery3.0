package cn.edu.swufe.dpsquery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SummonerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summoner);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fuben,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.O9s){
            Intent list1=new Intent(this,DpsOfSummoner1Activity.class);
            startActivity(list1);
        }else if(item.getItemId()==R.id.O10s){
            Intent list2=new Intent(this,DpsOfSummoner2Activity.class);
            startActivity(list2);
        }else if(item.getItemId()==R.id.O11s){
            Intent list3=new Intent(this,DpsOfSummoner3Activity.class);
            startActivity(list3);
        }if(item.getItemId()==R.id.O12s){
            Intent list4=new Intent(this,DpsOfSummoner4Activity.class);
            startActivity(list4);
        }
        return super.onOptionsItemSelected(item);
    }
}
