package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("kaç adet fibonacci sayısı istiyorsunuz : ");
        int number= input.nextInt();
        int total=1;
        int counter=0;
        for (int i=0;i<=number;i++) {

            System.out.println(i+"+"+total+"="+(i+total));
            total=total+i;




        }

    }
}
