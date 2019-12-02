package chapter5;

import java.util.Scanner;

public class phone_bill_calc {
    static double perminute = 0.25;
    static double Taxmentioned = 0.15;
    static Scanner scanner = new Scanner(System.in);



    public static void main(String args[]){
        double plan = getplaninfo();
        //int minutes = getoverageminutes();
        double Overage = getoverageminutes();

        System.out.println("Overage"+ (Overage));
        System.out.println("Plan"+ (plan));
        double totalplantax = calculate(plan + Overage);
        System.out.println("Tax"+ calculate(plan + Overage));

        double Total = overall( plan, Overage, totalplantax);
        System.out.println("Total amount" + overall( plan, Overage, totalplantax));

    }

    public static double getplaninfo(){
        System.out.println("Enter base cost of the plan:");
        double plan = scanner.nextDouble();
        return plan;

    }
    public  static double getoverageminutes(){
        System.out.println("Enter Total number of minutes:");
        int minutes = scanner.nextInt();
        double Overage = (perminute) *  minutes;
        return Overage;

    }
    public static double calculate(double excludtax){
        double tax = (Taxmentioned * excludtax );
        return tax;
    }
    public  static  double overall ( double plan, double Overage, double totalplantax ){
        double total = plan + Overage + totalplantax;
        return total;

    }


}
