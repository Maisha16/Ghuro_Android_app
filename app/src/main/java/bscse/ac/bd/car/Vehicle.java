package bscse.ac.bd.car;

public class Vehicle {

    private String model;
    private String car_num;
    private String numtrips;
    private String lasttrips;


    public Vehicle(String model,String car_num,String numtrips,String lasttrips) {
        this.model = model;
        this.car_num=car_num;
        this.numtrips=numtrips;
        this.lasttrips=lasttrips;
    }


    public void setModel(String model) {
        this.model = model;
    }
    public void setCar_num(String car_num) {
        this.car_num = car_num;
    }
    public void setNumtrips(String numtrips) {
        this.numtrips = numtrips;
    }
    public void setLasttrips(String lasttrips) {
        this.lasttrips = lasttrips;
    }

    public String getModel() {
        return model;
    }
    public String getCar_num() {
        return car_num;
    }
    public String getNumtrips() {
        return numtrips;
    }
    public String getLasttrips() {
        return lasttrips;
    }
}
