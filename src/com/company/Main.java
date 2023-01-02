package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" " + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("We use our system we division YOU Deposit on 5 piece and play with low risk. You mast have more 30$" + " ");
        System.out.println(" "+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Scanner console = new Scanner(System.in);

        System.out.print("Your Valute:" + " ");
        String valute = console.nextLine();
        if (valute == "$"){
            System.out.println(" Not true valut");
            return;
        }

        System.out.print("Your Deposit:" + " " );
        int balance = console.nextInt();
        System.out.print("Procent with wicth you come:" + " ");

        int procent = console.nextInt();
        if (procent>100){
            return;
        }
        if (procent <=69){
            System.out.print("doesn't make sense ");
            return;
        }
        int stavka;
        int plus;
        int balanceend;
        int minBalance;
        int win=0;
            stavka=balance/5;
            balanceend=balance;
            minBalance=stavka*4;
            win=balance-balanceend;
                for ( int i=0; i<5; i++) {
                    System.out.println(" ");
                    System.out.println("print 1 if you win and two if you loss:" + " ");
                    System.out.println(" ");
                    int answer = console.nextInt();
                    if (answer == 1) {
                        plus=stavka*procent/100;
                        balanceend=balanceend+plus;
                        System.out.println(" ");
                        System.out.println("Coll you safe yor bet and add"+ " "+ plus +valute);
                        System.out.println("ballance =" + " " + balanceend+valute);
                    } else {
                        balanceend-=stavka;
                        System.out.println(" ");
                        System.out.println("Sad your deposit = " + " " + balanceend+valute);

                        }
                            if (balanceend<minBalance-1){
                                System.out.println(" ");
                                System.out.println(" Oh no You loss" + " " + win+valute);
                                break;
                            }




                }

        System.out.println(" ");
      System.out.println("Your Deposit was ="+ " " + balance+valute);
        System.out.println(" ");

        System.out.println("Your Deposit now ="+ " " + balanceend+valute);
        System.out.println(" ");

        if (win<0){
            win=win*(-1);
            System.out.print("Yor Winn:"+ " " + win + " " +valute);
        }else {
            System.out.print("Yor loss:" + " " + win + " " + valute);
            System.out.println(" ");
        }

    }

}
