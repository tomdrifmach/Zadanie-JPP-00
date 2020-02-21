package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is you weight in kg?");
        double weight = sc.nextDouble();
        System.out.println("What is you height in m?");
        double height = sc.nextFloat();
        double bmi = BMI(weight,height);

        System.out.println("Your BMI is "+bmi+ ", which is considered "+getDescriptiveBMI(bmi));
    }

    private static String getDescriptiveBMI(double bmi) {
        if(bmi<15.0) return "Very severely underweight";
        else if(bmi<16) return "Severely underweight";
        else if(bmi<18.5) return "Underweight";
        else if(bmi<25) return "Normal (healthy weight)";
        else if(bmi<30) return "Overweight";
        else return "Obese";
    }

    private static double BMI(double weight, double height) {
        return weight/(height*height);
    }
}
