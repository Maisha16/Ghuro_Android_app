package bscse.ac.bd.car;

import android.os.Parcel;
import android.os.Parcelable;

public class SearchVehicle implements Parcelable {
    private String carName;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    private String carId;
    private String carModel;
    private String price;
    private String trips;
    private String year;

    public SearchVehicle(String carName, String carModel, String price, String trips, String year) {
        this.carName = carName;
        this.carModel = carModel;
        this.trips = trips;
        this.price = price;
        this.year = year;
    }

    protected SearchVehicle(Parcel in) {
        carName = in.readString();
        carModel = in.readString();
        price = in.readString();
        trips = in.readString();
        year = in.readString();
    }

    public static final Creator<SearchVehicle> CREATOR = new Creator<SearchVehicle>() {
        @Override
        public SearchVehicle createFromParcel(Parcel in) {
            return new SearchVehicle(in);
        }

        @Override
        public SearchVehicle[] newArray(int size) {
            return new SearchVehicle[size];
        }
    };

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setNumtrips(String numtrips) {
        this.price = price;
    }

    public void setLasttrips(String lasttrips) {
        this.trips = trips;
    }

    public void setModel(String model) {
        this.year = year;
    }

    public String getCarName() {
        return carName;
    }

    public String getTrips() {
        return trips;
    }

    public String getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        out.writeString(carId);
        out.writeString(carName);
        out.writeString(carModel);
        out.writeString(year);
        out.writeString(trips);
    }
}
