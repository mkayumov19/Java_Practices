package JavaBasics.day_46_encapsulation;

public class Car {
    private String model;
    private int year;
    private int mileage;

    public void setModel(String carModel) {
        model = carModel;
    }
    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public void setMileage(int carMileage) {
        mileage = carMileage;
    }
    public int getMileage() {
        return mileage;
    }

    public String mileageToString() {
        String mile = String.valueOf(mileage);
        return mile;
    }

    @Override
    public String toString() {
        return "Car{" + "year=" + year + '}';
    }
}
