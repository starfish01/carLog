package au.com.shifttech.carlog;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class fragment_car_listView_test extends Fragment {

    CarInfo car1 = new CarInfo();



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v;

        v = inflater.inflate(R.layout.fragment_car_listview_item, container, false);

        testData();
        setTestData(v);


        return v;
    }

    public void testData(){

        car1.setCarImage(getResources(),R.drawable.placeholderimg);
        car1.setCarKms(1000);
        car1.setCarMake("falcon");
        car1.setCarNickname("percy");
        car1.setCarRegoPlate("142 fake");
        car1.setCarYear("2006");

    }
    public void setTestData(View v){

        ImageView i1 = (ImageView)v.findViewById(R.id.imageView);
        i1.setImageBitmap(car1.getCarImage());

        TextView v1 = (TextView)v.findViewById(R.id.carNicknameTextview);
        v1.setText(car1.getCarNickname());

        TextView v2 = (TextView)v.findViewById(R.id.carRegoPlateTextview);
        v2.setText(car1.getCarRegoPlate());

        TextView v3 = (TextView)v.findViewById(R.id.carMakeTextview);
        v3.setText(car1.getCarMake());

        TextView v4 = (TextView)v.findViewById(R.id.carYearTextview);
        v4.setText(car1.getCarYear());

        TextView v5 = (TextView)v.findViewById(R.id.kmsTextview);
        v5.setText(String.valueOf(car1.getCarKms()));




    }

}