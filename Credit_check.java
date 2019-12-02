package chapter5;

import java.util.Scanner;

public class Credit_check {
    static int requiredsalary = 25000;
    static int scorerequired = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        double Salary = getsalary();
        int creditscore = getcreditscore();


        boolean qualified = isUserQualified( creditscore, Salary);

        notifyUser(qualified);
        scanner.close();

    }

    public static double getsalary(){
        System.out.print("Please enter the salary");
        double salary = scanner.nextDouble();
        return  salary;
    }

    public static int getcreditscore(){
        System.out.print("Please enter the creditscore");
        int creditscore = scanner.nextInt();
        return creditscore;
    }

    public static boolean isUserQualified(int creditscore, double Salry){
        if ( creditscore >= scorerequired && getsalary() >=requiredsalary){
            return (true);
        }
        else{
            return false;
        }
    }

    public static void  notifyUser( boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! Ypu've been approved");
                    }
        else{
            System.out.println("Sorry. you've been disqualified");
        }
    }

}
