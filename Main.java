package com.company;

import java.util.Scanner;

public class Main {
    public static int  getMax(int a, int b){
        int flag=0;
        if(a > b)
        {
            flag=a;

        }
        if(a < b)
        {
            flag=b;
        }
        if (a == b)
        {
            flag=-1;
        }
        return flag;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result= getMax(a, b);
        System.out.print(result);
    }
}
