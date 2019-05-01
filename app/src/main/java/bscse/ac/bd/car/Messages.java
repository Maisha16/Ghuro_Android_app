package bscse.ac.bd.car;

public class Messages {
    private String name;
    private String message;


    public Messages(String name,String message){
        this.message=message;
        this.name=name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
