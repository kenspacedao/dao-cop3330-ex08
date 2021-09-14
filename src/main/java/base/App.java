package base;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("How many people? ");
        Scanner peep = new Scanner(System.in);
        int people = peep.nextInt();

        System.out.print("How many pizzas do you have? ");
        Scanner peez = new Scanner(System.in);
        int pizza = peez.nextInt();

        System.out.print("How many slices per pizza? ");
        Scanner slee = new Scanner(System.in);
        int slices = slee.nextInt();

        int total = slices * pizza;
        System.out.println(people + " people with " + pizza +" pizzas (" + total + " slices)");
        System.out.println("Each person gets " + total / people + " pieces of pizza.");
        System.out.println("There are " + (total % people) + " leftover pieces.");
        
    }
}