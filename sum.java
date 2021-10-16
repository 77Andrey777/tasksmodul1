package com.company;
import java.util.Scanner;


public class sum {
    public static int sumof1(int parametr, int kolvo )
    {
        int flag=0;
        flag=parametr+10*kolvo;
        return flag;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int parametr1 = in.nextInt();
        int kolvo1 = in.nextInt();
        int parametr2 = in.nextInt();
        int kolvo2 = in.nextInt();
        int parametr3 = in.nextInt();
        int kolvo3 = in.nextInt();

        System.out.print((sumof1(parametr1, kolvo1)+sumof1(parametr2, kolvo2)+sumof1(parametr3, kolvo3)));
    }

}
