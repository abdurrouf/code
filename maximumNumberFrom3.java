package javaapplication1;

import java.util.Scanner;

public class maximumNumberFrom3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c,max;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        
        if(a>b&&a>c)max=a;
        else if(b>a&&b>c)max=b;
        else max=c;
        System.out.println(max);
        
    }
}
