package au.com.shifttech.carlog;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CarInfo car1 = new CarInfo();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        testData();

        ArrayList<CarInfo> mike = new ArrayList<>();
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);
        mike.add(car1);




        ListAdapter adapter = new CarListActivityAdaptor(this, R.layout.fragment_car_listview_item, mike);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView)findViewById(R.id.list_of_cars_listview);
        lv.setAdapter(adapter);


       // fragmentTest();








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void fragmentTest(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragment_car_listView_test fragment = new fragment_car_listView_test();
        fragmentTransaction.replace(R.id.first_layout, fragment);
        fragmentTransaction.commit();
    }

    public void testData(){

        car1.setCarImage(getResources(),R.drawable.placeholderimg);
        car1.setCarKms(1000);
        car1.setCarMake("falcon");
        car1.setCarNickname("percy");
        car1.setCarRegoPlate("142 fake");
        car1.setCarYear("2006");

    }





}
