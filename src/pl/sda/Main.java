package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is you weight in kg?");
        double weight = sc.nextDouble();
        System.out.println("What is you height in m?");
        double height = sc.nextDouble();
        System.out.println("Your BMI is "+bmi(weight,height));
    }

    private static double bmi(double weight, double height) {
        return weight/(height*height);
    }
}
