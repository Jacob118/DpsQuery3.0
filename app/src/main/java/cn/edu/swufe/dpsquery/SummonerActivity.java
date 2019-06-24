package cn.edu.swufe.dpsquery;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummonerActivity extends ListActivity implements AdapterView.OnItemClickListener {

    private ArrayList<HashMap<String,Object>> listItems;
    private SimpleAdapter listItemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initListView();
        this.setListAdapter(listItemAdapter);
        //setContentView(R.layout.activity_blackmage);

        getListView().setOnItemClickListener(this);


        }
        private void initListView(){
        listItems =new ArrayList<HashMap<String, Object>>();
        HashMap<String,Object> map1=new HashMap<String, Object>();
        map1.put("pic",R.drawable.ninesss);
        map1.put("text","欧米茄零式时空狭缝 阿尔法篇一层");

            HashMap<String,Object> map2=new HashMap<String, Object>();
            map2.put("pic",R.drawable.tensss);
            map2.put("text","欧米茄零式时空狭缝 阿尔法篇二层");

            HashMap<String,Object> map3=new HashMap<String, Object>();
            map3.put("pic",R.drawable.elevensss);
            map3.put("text","欧米茄零式时空狭缝 阿尔法篇三层");

            HashMap<String,Object> map4=new HashMap<String, Object>();
            map4.put("pic",R.drawable.twelvesss);
            map4.put("text","欧米茄零式时空狭缝 阿尔法篇四层");


            listItems.add(map1);
            listItems.add(map2);
            listItems.add(map3);
            listItems.add(map4);

            listItemAdapter = new SimpleAdapter(this, listItems, R.layout.list_items,
                    new String[]{"pic", "text"}, new int[]{R.id.items_imageView1, R.id.items_textView1});











    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:Intent Summ1=new Intent(this,DpsOfSummoner1Activity.class);
                startActivity(Summ1);
                break;
            case 1:Intent Summ2=new Intent(this,DpsOfSummoner2Activity.class);
                startActivity(Summ2);
                break;
            case 2: Intent Summ3=new Intent(this,DpsOfSummoner3Activity.class);
                startActivity(Summ3);
                break;
            case 3: Intent Summ4=new Intent(this,DpsOfSummoner4Activity.class);
                startActivity(Summ4);
                break;

        }
    }



}

