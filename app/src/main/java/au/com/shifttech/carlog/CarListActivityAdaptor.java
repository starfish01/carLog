package au.com.shifttech.carlog;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by patrick on 2/06/2017.
 */

public class CarListActivityAdaptor extends ArrayAdapter<CarInfo> {
    private Activity activity;
    private ArrayList<CarInfo> carInfo;
    private static LayoutInflater inflater = null;


    public CarListActivityAdaptor(Activity activity, int textViewResourceID, ArrayList<CarInfo> _carInfo){
        super(activity,textViewResourceID, _carInfo);

        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    private static class ViewHolder{
        ImageView i1;
        TextView v1,v2,v3,v4,v5;

    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        try{
            View v =convertView;
            CarInfo item = getItem(position);
            final ViewHolder holder;



            if(convertView == null)
            {
                v = inflater.inflate(R.layout.fragment_car_listview_item,null);

                holder = new ViewHolder();

                holder.i1 = (ImageView)v.findViewById(R.id.imageView);

                holder.v1 = (TextView)v.findViewById(R.id.carNicknameTextview);

                holder.v2 = (TextView)v.findViewById(R.id.carRegoPlateTextview);

                holder.v3 = (TextView)v.findViewById(R.id.carMakeTextview);

                holder.v4 = (TextView)v.findViewById(R.id.carYearTextview);

                holder.v5 = (TextView)v.findViewById(R.id.kmsTextview);
                v.setTag(holder);

            }else {
                holder = (ViewHolder) v.getTag();
            }

            holder.v1.setText(item.getCarNickname());

            holder.v2.setText(item.getCarRegoPlate());

            holder.v3.setText(item.getCarMake());

            holder.v4.setText(item.getCarYear());

            holder.v5.setText(String.valueOf(item.getCarKms()));


            return v;

        }catch (Exception e){
            return null;

        }

    }


}
