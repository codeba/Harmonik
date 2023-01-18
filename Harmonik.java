package patika;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int number;
        double sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        number=sc.nextInt();
        for (double i = 1; i <=number ; i++) {
            sum+=(1/i);
        }
        System.out.println("Toplam:"+sum);
    }
}
