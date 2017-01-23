package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char char1, char2, char3, char4, char5, char6;
        String hex1, hex2, hex3, hex4, hex5, hex6;
        boolean s = true;
        while(s){
            System.out.println("Do you want to convert " + "\n" + "1: Hex to Triplets" + "\n" + "2: Triplets to Hex");
            String test = input.nextLine();
            if(test.equalsIgnoreCase("1")){
            s = false;
                System.out.println("What is the first character");
                hex1 = input.next();
                char1 = hex1.charAt(0);
                System.out.println("What is the second character");
                hex2 = input.next();
                char2 = hex1.charAt(0);
                System.out.println("What is the third character");
                hex3 = input.next();
                char3 = hex1.charAt(0);
                System.out.println("What is the fourth character");
                hex4 = input.next();
                char4 = hex1.charAt(0);
                System.out.println("What is the fifth character");
                hex5 = input.next();
                char5 = hex1.charAt(0);
                System.out.println("What is the last character");
                hex6 = input.next();
                char6 = hex1.charAt(0);
                System.out.println(char1+char2+char3+char4+char5+char6);
            }else if(test.equalsIgnoreCase("2")){
            s = false;

            }else{
                System.out.println("Enter 1 or 2");
            }
        }
    }
}
