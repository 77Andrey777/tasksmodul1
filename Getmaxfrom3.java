package com.company;
import java.util.Scanner;
class Getmaxfrom3{
    public static int getMax(int a, int b, int c){
        if(a > b){
            return a > c ? a : c;
        } else {
            return b > c ? b : c;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result= getMax(a, b, c);
        System.out.print(result);
    }
    

}
