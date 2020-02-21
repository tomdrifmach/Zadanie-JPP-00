package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is you weight in kg?");
        float weight = sc.nextFloat();
        System.out.println("What is you height in m?");
        float height = sc.nextFloat();
        float bmi = BMI(weight,height);

        System.out.println("Your BMI is "+bmi+ ", which is considered "+getDescriptiveBMI(bmi));
    }

    private static String getDescriptiveBMI(float bmi) {
        if(bmi<15.0) return "Very severely underweight";
        else if(bmi<16) return "Severely underweight";
        else if(bmi<18.5) return "Underweight";
        else if(bmi<25) return "Normal (healthy weight)";
        else if(bmi<30) return "Overweight";
        else return "Obese";
    }

    private static float BMI(float weight, float height) {
        return weight/(height*height);
    }
}
