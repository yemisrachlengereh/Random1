package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        int x = 1 + r.nextInt(10);
        Scanner keyboard=new Scanner(System.in);

           System.out.println("enter your number:");
        int y=keyboard.nextInt();


        if(y<x)
            System.out.print("its too small");
        if(y>x)
            System.out.print("its too high");

        if(y==x)
            System.out.print("you got it");


    }
    }

