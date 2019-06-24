package cn.edu.swufe.dpsquery;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class JobActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);
    }

    public void openSummoner(View btn){
        Intent Summ=new Intent(this,SummonerActivity.class);
        startActivity(Summ);
    }
    public void openBlackmage(View btn){
        Intent Black=new Intent(this,BlackmageActivity.class);
        startActivity(Black);
    }
    public void openDragoon(View btn){
        Intent Drag=new Intent(this,DragoonActivity.class);
        startActivity(Drag);
    }
    public void openBard(View btn){
        Intent Bard=new Intent(this,BardActivity.class);
        startActivity(Bard);
    }
    public void openRedmage(View btn){
        Intent Red=new Intent(this,RedmageActivity.class);
        startActivity(Red);
    }
    public void openSamurai(View btn){
        Intent Samu=new Intent(this,SamuraiActivity.class);
        startActivity(Samu);
    }
    public void openMonk(View btn){
        Intent Monk=new Intent(this,MonkActivity.class);
        startActivity(Monk);
    }
    public void openMachinist(View btn){
        Intent Machi=new Intent(this,MachinistActivity.class);
        startActivity(Machi);
    }
    public void openNinja(View btn){
        Intent Ninja=new Intent(this,NinjaActivity.class);
        startActivity(Ninja);
    }




}