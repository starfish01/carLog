package au.com.shifttech.carlog;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by patri on 24-May-17.
 */

public class CarInfo {



    public String getCarNickname() {
        return carNickname;
    }

    public void setCarNickname(String carNickname) {
        this.carNickname = carNickname;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public Bitmap getCarImage() {
        return carImage;
    }

    public void setCarImage(Resources resources, int placeholderimg) {
        carImage = BitmapFactory.decodeResource(resources, placeholderimg);
    }

    public String getCarRegoPlate() {
        return carRegoPlate;
    }

    public void setCarRegoPlate(String carLicencePlate) {
        this.carRegoPlate = carLicencePlate;
    }

    public int getCarKms() {
        return carKms;
    }

    public void setCarKms(int carKms) {
        this.carKms = carKms;
    }

    private String carRegoPlate, carNickname, carMake, carYear;
    private Bitmap carImage;
    private int carKms;


}
