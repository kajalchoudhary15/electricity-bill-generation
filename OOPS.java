package OOPS;

import java.util.Scanner;


class Electricity {

    int customerId;
    String customerName;
    int previousReading;
    int currentReading;
    int units;
    double bill;
    Scanner SC=new Scanner (System.in);

    // Constructor
    Electricity(int id, String name, int previous, int current) {
        customerId = id;
        customerName = name;
        previousReading = previous;
        currentReading = current;
    }

    // Method to calculate bill
    void calculateBill() {

        units = currentReading - previousReading;

        if (units < 0) {
            System.out.println("Invalid meter readings!");
            return;
        }

        if (units <= 100) {
            bill = units * 3;
        } else if (units <= 200) {
            bill = (100 * 3) + (units - 100) * 5;
        } else {
            bill = (100 * 3) + (100 * 5) + (units - 200) * 7;
        }
    }

    // Method to display bill
    void displayBill() {

        if (units < 0) {
            return;
        }

        System.out.println("\n========== ELECTRICITY BILL ==========");
        System.out.println("Customer ID      : " + customerId);
        System.out.println("Customer Name    : " + customerName);
        System.out.println("Previous Reading : " + previousReading);
        System.out.println("Current Reading  : " + currentReading);
        System.out.println("Units Consumed   : " + units);
        System.out.println("Total Bill       : Rs. " + bill);
        System.out.println("======================================");
    }
}

public class ElectricityBill {
     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.print("Enter Customer ID: ");
          int id = sc.nextInt();
          sc.nextLine();

          System.out.print("Enter Customer Name: ");
          String name = sc.nextLine();

          System.out.print("Enter Previous Meter Reading: ");
          int previous = sc.nextInt();

          System.out.print("Enter Current Meter Reading: ");
          int current = sc.nextInt();

          Electricity customer = new Electricity(id, name, previous, current);

          customer.calculateBill();
          customer.displayBill();

          sc.close();
      }
      
    }