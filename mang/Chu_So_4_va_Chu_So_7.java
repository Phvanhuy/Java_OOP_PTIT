// package JAVA_OOP;

import java.util.Scanner;

public class Chu_So_4_va_Chu_So_7 {
    public static long solve(long n){
        long dem4=0,dem7=0,a;
        while(n>0){
            a = n % 10;
            if(a==4) dem4++;
            else if(a==7) dem7++;
            n/=10;
        }
        return dem4+dem7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        if(solve(N)==4 || solve(N)==7) System.out.println("YES");
        else System.out.println("NO");
    }
}
