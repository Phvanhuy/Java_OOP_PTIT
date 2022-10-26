import java.util.Scanner;

public class Sap_Xep_Chon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[100];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int cmin=i; // chon mot chi so 
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[j])
            {
                int tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
            }
            }
            
            System.out.print("Buoc "+(i+1)+": ");
            for(int k=0;k<n;k++)
            {
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}