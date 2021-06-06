/*
 *  UCF COP3330 Summer 2021 Assignment 15 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;
import java.util.Scanner;

public class Problem15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String password = "abc$123";

        System.out.println("What is the password?");
        String userPassword = input.next().toLowerCase();

        if(userPassword.equals(password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
