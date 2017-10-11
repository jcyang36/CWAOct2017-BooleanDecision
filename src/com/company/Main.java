package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your test score: ");
      Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        String grade = "F";//I'm not hopeful


        if (score > 96){
            grade = "A+";}
        else if (score > 92){
            grade = "A";}
        else if (score > 89){
            grade = "A-";}
        else if (score > 86)
            grade = "B+";
        else if (score > 82)
            grade = "B";
        else if (score > 79)
            grade = "B-";
        else if (score > 76)
            grade = "C+";
        else if (score > 72)
            grade = "C";
        else if (score > 69)
            grade = "C-";
        else if (score > 66)
            grade = "D+";
        else if (score >62)
            grade ="D";
        else if (score >59)
        {grade ="D-";}
            else{
            grade = "F";}

        System.out.println("Grade: "+grade);
        if (score > 69)
            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");

    }
}
