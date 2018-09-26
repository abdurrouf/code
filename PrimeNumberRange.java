package javaapplication1;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(i+"  "+primeChecker(i));
        }
    }
    static int primeChecker(int n){
        if(n==1)return 0;
        int isPrime=1;
        for (int i = 2; i < n/2; i++) {
            if (n%i==0) {
                isPrime=0;
                return isPrime;
            }
        }
        return isPrime;
    }
}
