package contracts;

public interface IDeduction {
    double computeTax(double grossPay);
    double computeSSS(double salary);
    double computePhilHealth(double salary);
    double computePagIBIG(double salary);
}