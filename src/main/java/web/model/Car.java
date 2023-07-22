package web.model;

public class Car {
    private String model;
    private int year;
    private int kilometrage;

    public Car(String model, int year, int kilometrage) {
        this.model = model;
        this.year = year;
        this.kilometrage = kilometrage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    @Override
    public String toString() {
        return model + " " + year + ", пробег: " + kilometrage + " км";
    }
}
