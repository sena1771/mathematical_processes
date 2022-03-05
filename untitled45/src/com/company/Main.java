package com.company;
import java.util.Scanner;
public class Main {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you need  :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you need :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You can not take divisor as zero");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Base number :");
        int base = scan.nextInt();
        System.out.print("Exponent number :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("The number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }
    static void mod(){
        int k;
        Scanner inp=new Scanner(System.in);
        System.out.print("The number: ");
        int number= inp.nextInt();
        System.out.print("Second number: ");
        int n= inp.nextInt();
        if(number<n){
            System.out.print("First number must be bigger or equal than second one!");
        }
        k= number%n;
        System.out.println("The mod: "+k);
    }
  static void rectangle(){
        int area,perimeter;
        Scanner inp=new Scanner(System.in);
        System.out.print(" Vertical Edge: ");
        int edge= inp.nextInt();
        System.out.print("Horizontal Edge: ");
        int edge_1= inp.nextInt();
        area= edge*edge_1;
        System.out.println("The area of the rectangle: "+area);
        perimeter=(2*edge)+(2*edge_1);
        System.out.println("The perimeter of a rectangle: "+perimeter);

  }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Sum\n"
                + "2- Subtracting\n"
                + "3- Multiplication\n"
                + "4- Dividing\n"
                + "5- Exponent\n"
                + "6- Factorial\n"
                + "7- Mod\n"
                + "8- area and perimeter of Rectangle\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please choose a process :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You choosed a wrong number. Try again.");
            }
        } while (select != 0);


    } }


