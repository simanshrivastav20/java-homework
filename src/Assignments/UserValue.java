package Assignments;

import java.util.Scanner;

public class UserValue {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the integer: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.println("Entered integer is: "
                + num);
    }
}
