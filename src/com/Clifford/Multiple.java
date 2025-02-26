package com.Clifford;

public class Multiple {
    public static void generator() {
        int x=1,sum=0;
        do{


            sum+=x;
            x++;


        }while(x<=8);

        System.out.println("Sum of the first 8 integers is " +sum);

    }
}
