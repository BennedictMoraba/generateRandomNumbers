

package com.mycompany.generaterandomnumbers;
//import java random util
import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers 
{

    public static void main(String[] args) 
    {
        //Initialize random
        Random random = new Random();
        
        //Initialize Scanner for user input
        Scanner sc = new Scanner(System.in);
        
        //Declare variable for minimum range and maximum range
        int minRange, maxRange;
        
        //Prompt the user to enter minimum range and the maximum range
        System.out.print("Enter the minimum range: ");
        minRange = sc.nextInt();
        
        System.out.print("Enter the maximum range: ");
        maxRange = sc.nextInt();
        
        //Specify the number of iterations required
       for(int i = 1; i <= 5; i++)
       {
           System.out.println(random.nextInt(maxRange - minRange) + minRange); //Ensure it returns values within the specified minimum and maximum range
       }
       
        
    }
}
