package javaapplication1;

public class Series {
    public static void main(String[] args) {
        int n=3;
        int sum=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                sum+=j;
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
