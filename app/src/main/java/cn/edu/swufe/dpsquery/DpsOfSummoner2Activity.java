package cn.edu.swufe.dpsquery;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class DpsOfSummoner2Activity extends ListActivity {

    private ArrayList<HashMap<String, String>> listItems;
    private SimpleAdapter listItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initListView();
        this.setListAdapter(listItemAdapter);

        //setContentView(R.layout.activity_dps_list);


    }

    private void initListView() {
        listItems = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map1= new HashMap<String, String>();
        map1.put("parse", "99th Percentile");
        map1.put("dps", "7909.50");

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("parse", "95th Percentile");
        map2.put("dps", "7664.08");

        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("parse", "75th Percentile");
        map3.put("dps", "7303.77");

        HashMap<String, String> map4 = new HashMap<String, String>();
        map4.put("parse", "50th Percentile");
        map4.put("dps", "6969.55");

        HashMap<String, String> map5 = new HashMap<String, String>();
        map5.put("parse", "25th Percentile");
        map5.put("dps", "6560.67");

        HashMap<String, String> map6= new HashMap<String, String>();
        map6.put("parse", "10th Percentile");
        map6.put("dps", "6101.63");






        listItems.add(map1);
        listItems.add(map2);
        listItems.add(map3);
        listItems.add(map4);
        listItems.add(map5);
        listItems.add(map6);


        listItemAdapter = new SimpleAdapter(this, listItems, R.layout.activity_list,
                new String[]{"parse", "dps"}, new int[]{R.id.textView8, R.id.textView9});
    }
}
