package bscse.ac.bd.car;

public class SearchVehicle {
    private String carName;
    private String carModel;
    private String price;
    private String trips;
    private String year;

    public SearchVehicle(String carName, String carModel, String price, String trips, String year) {
        this.carName = carName;
        this.carModel = carModel;
        this.trips=trips;
        this.price=price;
        this.year=year;
    }



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
}
