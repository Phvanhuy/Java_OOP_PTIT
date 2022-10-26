// package JAVA_OOP;

import java.util.Scanner;

public class Phan_Tich_Thua_So_Nguyen_To {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++){
            int n = sc.nextInt();
            System.out.print("Test "+ k +": ");
            for(int i=2;i<=Math.sqrt(n);i++){
                int dem=0;
                if(n%i==0){
                    while(n%i==0){
                        dem++;
                        n/=i;
                    }
                    System.out.print(i+"(" + dem +") ");
                }
            }
            if(n!=1) System.out.println(n+"(1)");
            else System.out.println();
        }
    }
}
