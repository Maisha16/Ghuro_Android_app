package bscse.ac.bd.car;

public class SearchVehicle {
    private String car_num;
    private String price;
    private String trips;
    private String year;

    public SearchVehicle(String car_num, String price, String trips, String year) {
        this.car_num=car_num;
        this.trips=trips;
        this.price=price;
        this.year=year;
    }



    public void setCar_num(String car_num) {
        this.car_num = car_num;
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

    public String getCar_num() {
        return car_num;
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

}
