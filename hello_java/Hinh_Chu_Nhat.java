// package JAVA_OOP;

import java.util.Scanner;

public class Hinh_Chu_Nhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int chieudai = sc.nextInt();
        int chieurong = sc.nextInt();
        solve(chieudai, chieurong);
        sc.close();
    }

    private static void solve(int chieudai, int chieurong) {
        if(chieudai<=0 || chieurong<=0) System.out.println("0");
        else System.out.println(2*(chieudai+chieurong)+" "+ chieudai*chieurong);
    }
}
