package cn.edu.swufe.dpsquery;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class DragoonActivity extends ListActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private String[] name={"欧米茄零式时空狭缝 阿尔法篇一层","欧米茄零式时空狭缝 阿尔法篇二层","欧米茄零式时空狭缝 阿尔法篇三层","欧米茄零式时空狭缝 阿尔法篇四层"};
    private int[] images={R.drawable.ninesss,R.drawable.tensss,R.drawable.elevensss,R.drawable.twelvesss};

    private List<Map<String,Object>> list_map=new ArrayList<Map<String,Object>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackmage);

        listView = (ListView) findViewById(R.id.listView);

        for (int i = 0; i < 5; i++) {
            HashMap<String, Object> items = new HashMap<String, Object>();

            items.put("pic", images[i]);
            items.put("name", name[i]);
            list_map.add(items);
        }


        SimpleAdapter simpleAdapter=new SimpleAdapter(this,list_map,R.layout.list_items,new String[]{"pic","name"},new int[]{R.id.items_imageView1,R.id.items_textView1});
        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if(position==0){

            Intent Dragoon1=new Intent(this,DpsOfDragoon1Activity.class);
            startActivity(Dragoon1);
        }
        else if(position==1){
            Intent Dragoon2=new Intent(this,DpsOfDragoon2Activity.class);
            startActivity(Dragoon2);
        }
        else if(position==2){
            Intent Dragoon3=new Intent(this,DpsOfDragoon3Activity.class);
            startActivity(Dragoon3);
        }
        else if(position==3){
            Intent Dragoon4=new Intent(this,DpsOfDragoon4Activity.class);
            startActivity(Dragoon4);
        }
    }
}
