
package assignmenttt;

import java.util.Scanner;


public class Assignmenttt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      

        System.out.println("Let's Calculate your BMI\nEnter your weight in kgs");
        double kgs = input.nextDouble();

        if (kgs <= 0) {
            System.out.println("INVALID");
            
        }

        System.out.println("Enter your height in meters");
        double matr = input.nextDouble();

        
        if (matr <= 0) {
            System.out.println("INVALID!");
           
        }

        double bmi = kgs / (matr * matr);
        System.out.println("Your BMI is " + bmi);

        
        
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } 
        else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You are in a normal range");
        } 
        else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight");
        } 
        else {
            System.out.println("You are obese");
        }
    }
}

    


