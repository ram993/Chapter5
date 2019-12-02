package chapter5;

import java.util.Scanner;

public class Greetings {
    public  static  void main(String args[]){
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetuser(name);

    }

    public static  void greetuser(String name){
        System.out.println("Hi There, "+ name);
    }
}
