/*
Name: Amarren Hopkins
Date: 4/1/26
Assingment SDC230 2.5 Smallest Number 
this program will take an specified amount of values from the user and determine 
the smallest number from those entered values*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Amarren Hopkins - Week 2 PA Smallest Number");
        System.out.println();
        int count;
        int smallest = 0;// What will be the smallest value
        int counter = 0;//the loop variable
        //Scanner creation and user input
        Scanner input = new Scanner(System.in);
        System.out.println("How many integers will you be entering?");
        count = input.nextInt();

        //loop creation
        while(counter < count){
            System.out.println("Enter an integer");
            int num = input.nextInt();
            //for the first loop 
            if(counter == 0){
                smallest = num;
            } else{
                if(num < smallest){
                    smallest = num;
                }
            }
            counter ++; //loop increase
        }
        System.out.println("The smallest value entered is : "+ smallest);
    }
}

