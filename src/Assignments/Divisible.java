package Assignments;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
//        int i;
//        for(i=1;i<=100;i++){
//            if(i%5==0 && i%3 == 0){
//                System.out.println("Consultadd JAVA Training");
//            }
//            else if(i%3==0){
//                System.out.println("Consultadd");
//            }
//            else if (i%5==0){
//                System.out.println("JAVA Training");
        System.out.println("Enter a number:");
            Scanner scanner = new Scanner(System.in);
        while (true) {
            int userValue = scanner.nextInt();
            if(userValue==0){
                System.exit(0);
            }
            if (userValue % 5 == 0 && userValue % 3 == 0) {

                System.out.println("Consultadd JAVA Training");
            } else if (userValue % 3 == 0) {
                System.out.println("Consultadd");
            } else if (userValue % 5 == 0) {
                System.out.println("JAVA Training");
            }else{
                System.out.println("This no is not divisible by 5 and 3");
            }
        }
    }








//
//
//        int integer1;
//        integer1 = 0;
//        boolean divisibleby3 = (integer1 % 3) == 0;
//        boolean divisibleby5 = (integer1 % 5) == 0;
//
//        for( integer1=0; integer1<1000; integer1++){
//            if(divisibleby3 = true);{
//                System.out.println(integer1 + " can be divided by 3");}
//            if(divisibleby3 = false);{
//                System.out.println(integer1 + " cannot be divided by 3");}
//            if(divisibleby5 = true);{
//                System.out.println(integer1 + " can be divided by 5");}
//            if(divisibleby5 = false);{
//                System.out.println(integer1 + " cannot be divided by 5");


            }


