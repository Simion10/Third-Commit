package com.Greeting.greeting;
public class Greeting{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in); 

        //prompt a user to enter a name
        System.out.print("Enter a name: ");
        String name=input.nextLine();

        //display a message using a user input
        System.out.println("Hello, "+ name + "! Welcome to GitHub Classroom!");   
    }
}