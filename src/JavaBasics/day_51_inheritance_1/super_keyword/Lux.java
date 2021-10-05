package JavaBasics.day_51_inheritance_1.super_keyword;

public class Lux extends Lyft{

    @Override
    public double calculateRate(double miles) {

        return super.calculateRate(miles) * 1.2;

    }
}
