// Write a program to calculate percentage of a given student in icse board exam. His
// marks from 5 subjects  must be taken as an input for the calculation

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Maths marks of the Student: ");
            int maths = sc.nextInt();
            System.out.println("Enter the English Language marks of the Student: ");
            int Language = sc.nextInt();
            System.out.println("Enter the English Literature marks of the Student: ");
            int Literature = sc.nextInt();
            System.out.println("Enter the History marks of the Student: ");
            int History = sc.nextInt();
            System.out.println("Enter the Geography marks of the Student: ");
            int Geography = sc.nextInt();
            System.out.println("Enter the Hindi marks of the Student: ");
            int Hindi = sc.nextInt();
            System.out.println("Enter the Chemistry marks of the Student: ");
            int Chemistry = sc.nextInt();
            System.out.println("Enter the Physics marks of the Student: ");
            int Physics = sc.nextInt();
            System.out.println("Enter the Biology marks of the Student: ");
            int Biology = sc.nextInt();

            int result = (maths+Language+Literature+History+Geography+Hindi+Chemistry+Physics+Biology)/9;
            System.out.println(result);
        }
        }
    }   
