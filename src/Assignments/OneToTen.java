package Assignments;

import java.util.Scanner;

public class OneToTen {
    public static void main(String[] arg10s) {
//        int b[]={1,2,3,4,5,6,7,8,9,10};


        System.out.println("Enter a number between 1-10 : ");
        Scanner in = new Scanner(System.in);
       int a = in.nextInt();
        System.out.println("Enter second number 1-10 : ");
       int  b = in. nextInt();
        if(a<=10 || b<=10){
            int z = a+b;
            System.out.println("Your sum without adding 30: "+z);
            int k = z+30;
            System.out.println("Your sum after adding 30: "+k);
        }else{
            System.out.println("You entered more value");

        }

    }
}
