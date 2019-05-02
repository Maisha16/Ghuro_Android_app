package bscse.ac.bd.car;

import android.os.Parcel;
import android.os.Parcelable;

public class SearchVehicle implements Parcelable {
    private String carName;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    private int carId;
    private String carModel;
    private String price;
    private int trips;
    private String year;
    private String carImage;

    public SearchVehicle(int carId, int userId, String carName, String carModel, String price, int trips, String year, String carImage) {
        this.carId = carId;
        this.carName = carName;
        this.carModel = carModel;
        this.trips = trips;
        this.price = price;
        this.year = year;
        this.carImage = carImage;
    }

    protected SearchVehicle(Parcel in) {
        carId = in.readInt();
        carName = in.readString();
        carModel = in.readString();
        year = in.readString();
        price = in.readString();
        trips = in.readInt();
        carImage = in.readString();
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

    public int getTrips() {
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
        out.writeInt(carId);
        out.writeString(carName);
        out.writeString(carModel);
        out.writeString(year);
        out.writeString(price);
        out.writeInt(trips);
        out.writeString(carImage);
    }

    public String getCarImage() {
        return carImage;
    }

    public void setCarImage(String carImage) {
        this.carImage = carImage;
    }
}
