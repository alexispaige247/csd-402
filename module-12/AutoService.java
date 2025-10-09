// Alexis Mitchell
// October 9, 2025
// This program has four methods for calculating the cost of yearly auto service visit. 

public class AutoService {
    
    // Method to calculate standard service charge
    public static final double serviceCharge = 80;
    public static double calculateStandardServiceCharge() {
        return serviceCharge;
    }

    // Method to calculate standard service charge with added oil change cost
    public static double calculateServiceWithOilChange(double oilChangeCost) {
        return serviceCharge + oilChangeCost;
    }

    // Method to calculate standard service charge with 
    // added oil change cost and added tire rotation cost
    public static double calculateServiceWithOilChangeAndTireRotation(double oilChangeCost, double tireRotationCost) {
        return serviceCharge + oilChangeCost + tireRotationCost;
    }

    // Method to calculate total service charge with 
    // added oil change cost, tire rotation cost, and coupon discount
    public static double calculateTotalServiceCharge(double oilChangeCost, double tireRotationCost, double couponDiscount) {
        return (serviceCharge + oilChangeCost + tireRotationCost) - couponDiscount;
    }

    // Overloaded yearlyService methods
    public static double yearlyService() {
        return calculateStandardServiceCharge();
    }

    public static double yearlyService(double oilChangeCost) {
        return calculateServiceWithOilChange(oilChangeCost);
    }

    public static double yearlyService(double oilChangeCost, double tireRotationCost) {
        return calculateServiceWithOilChangeAndTireRotation(oilChangeCost, tireRotationCost);
    }

    public static double yearlyService(double oilChangeCost, double tireRotationCost, double couponDiscount) {
        return calculateTotalServiceCharge(oilChangeCost, tireRotationCost, couponDiscount);
    }

    public static void main(String[] args) {
        // First round of tests
        System.out.println("Test 1 - Standard Service: $" + yearlyService());
        System.out.println("Test 1 - Service with Oil Change ($30): $" + yearlyService(30));
        System.out.println("Test 1 - Service with Oil Change ($30) and Tire Rotation ($20): $" + yearlyService(30, 20));
        System.out.println("Test 1 - Service with Oil Change ($30), Tire Rotation ($20), and Coupon ($15): $" + yearlyService(30, 20, 15));

        System.out.println(); 

        // Second round of tests
        System.out.println("Test 2 - Standard Service: $" + yearlyService());
        System.out.println("Test 2 - Service with Oil Change ($40): $" + yearlyService(40));
        System.out.println("Test 2 - Service with Oil Change ($40) and Tire Rotation ($25): $" + yearlyService(40, 25));
        System.out.println("Test 2 - Service with Oil Change ($40), Tire Rotation ($25), and Coupon ($10): $" + yearlyService(40, 25, 10));
    }
}