package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is you weight in kg?");
        float weight = sc.nextFloat();
        System.out.println("What is you height in m?");
        float height = sc.nextFloat();
        System.out.println("Your BMI is "+bmi(weight,height));
    }

    private static float bmi(float weight, float height) {
        return weight/(height*height);
    }
}
