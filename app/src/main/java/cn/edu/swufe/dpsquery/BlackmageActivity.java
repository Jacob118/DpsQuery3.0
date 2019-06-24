package cn.edu.swufe.dpsquery;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlackmageActivity extends Activity implements AdapterView.OnItemClickListener {

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

        Intent Black1=new Intent(this,DpsOfBlack1Activity.class);
        startActivity(Black1);
        }
        else if(position==1){
            Intent Black2=new Intent(this,DpsOfBlack2Activity.class);
            startActivity(Black2);
        }
        else if(position==2){
            Intent Black3=new Intent(this,DpsOfBlack3Activity.class);
            startActivity(Black3);
        }
        else if(position==3){
            Intent Black4=new Intent(this,DpsOfBlack4Activity.class);
            startActivity(Black4);
        }
    }
}
