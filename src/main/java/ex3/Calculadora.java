package ex3;

public class Calculadora {
    public double calculatePrice(double basePrice, double discount) {
        return basePrice * (1 - discount);
    }

    private double calculateDiscount(int customerType, boolean holiday) {
        double discount = 0;
        if (customerType == 1) { discount = 0.1; }
        if (customerType == 2) { discount = 0.15; }
        if (holiday) { discount += 0.05; }
        return discount;
    }
}
