import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number between 0.00 and 1,000,000.00: ");
        double money = scan.nextDouble();
        while (money < 0 || money > 1000000) {
            System.out.print("please enter a valid number: ");
            money = scan.nextDouble();
        }
        return -1.0;
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        int qcount = 0;
        while (money > .25) {
            money = money -.25;
            qcount = qcount + 1;
        }
        return qcount;
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        int dcount = 0;
        while (money > .10) {
            money = money - .10;
            dcount = dcount + 1;
        }
        return dcount;
    }

    // Takes a double money as input and returns the number of nickels that we
    // can return in change
    // You should use a while loop!
    public static int numNickels(double money) {
        int ncount = 0;
        while (money > .05) {
            money = money - .05;
            ncount = ncount + 1;
        }
        return ncount;
    }

    // Takes a double money as input and returns the number of pennies that we
    // can return in change
    // You should use a while loop!
    public static int numPennies(double money) {
        int pcount = 0;
        while (money > .01) {
            money = money - .01;
            pcount = pcount + 1;
        }
        return pcount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // You should test inputDouble yourself!
        double d = inputDouble();
        numQuarters(d);


//        // Some code to test numQuarters
//        System.out.println("\nnumQuarters tests:");
//        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
//        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
//        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000
//
//        // Some code to test numDimes
//        System.out.println("\nnumDimes tests:");
//        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
//        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
//        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502

        scan.close();
    }
}