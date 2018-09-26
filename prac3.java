package javaapplication1;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        /*
        float[] arr=new float[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=scanner.nextFloat();
        }
        float max=-99999,min=99999,sum=0,avg=0;
        
        for (int i = 0; i < 5; i++) {
            if (arr[i]>max)max=arr[i];
            else if(arr[i]<min)min=arr[i];
            sum+=arr[i];
        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
        System.out.println("Avg is "+sum/5.0);
        
        */
        
        //here another code
        
        /*
        
        char c=scanner.next().charAt(0);
        System.out.println(c);
        int asciiValue=(int)c;
        System.out.println(asciiValue);
        System.out.println((int)Math.pow(3, 3));
        */
        
        //here another code
        
        /*
        int num=scanner.nextInt();
        if(num%2==0)System.out.println("Even");
        else System.out.println("Odd");
        */
        
        //here another code
        
        /*
        int a,b,c,max;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        
        if(a>b&&a>c)max=a;
        else if(b>a&&b>c)max=a;
        else max=c;
        System.out.println("Max is "+max);
        */
        
        //here another code for
        /*
                 1
                12
               123
              1234
             12345
            123456
             12345
              1234
               123
                12
                 1
        
        
        for (int i = 1; i <= 6; i++) {
            
            for (int j = 1; j <=6-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 5; i>=1; i--) {
            for (int j = 1; j <=6-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        */
        
        //here code for
        
        /*      1
                12
                123
                1234
                12345
                123456
                12345
                1234
                123
                12
                1
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        */
        
        //here code for
        
        /*                  1
                           21
                          321
                         4321
                        54321
                       654321
                       123456
                        12345
                         1234
                          123
                           12
                            1
        
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=6-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <=6-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        */
        
        //here code for
        
        /*      1
               121
              12321
             1234321
            123454321
             1234321
              12321
               121
                1
        
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        */
        
        //here code for pascal triangle
        /*
        int row=10;
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < row-i-1; j++) {
                System.out.print(" "); 
            }
            
            int num=1;
            
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            
            System.out.println("");
        }
        */
        
        //here code for
        /* for max in one line
        int a=23,b=123,c=67,max;
        max=(a>b&&a>c)?a:((b>a&&b>c)?b:c);
        System.out.println(max);
        */
        
        //here another code
        /*
        float cel, fer;
        cel=scanner.nextFloat();
        fer=scanner.nextFloat();
        
        System.out.println(cel+" degree celcius = "+((cel*9.0)/5.0+32)+" degree ferenhite");
        System.out.println(fer+" degree ferenhite = "+(((fer-32)*5.0)/9.0)+" degree celcius");
        */
        
        //here another code
        
        /* Bubble sort
        int arr[]=new int[]{2,4,12,1,90,4,123,100,78};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                 temp=arr[j];
                 arr[j]=arr[i];
                 arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
                
        //here another code
        
        //System.out.println(numberOfBitR(12, 2));
        
    }
    static int factorialLoop(int n){
        int product=1;
        for (int i = 1; i <= n; i++) {
            product*=i;
        }
        return product;
    }
    
    static int factorialRecursion(int n){
        if (n==0||n==1)return 1;
        else return n*factorialRecursion(n-1);
    }
    
    static boolean leapYearAnother(int year){
        if((year%2==0 && year%100!=0)||(year%400==0))return true;
        else return false;
    }
    
    static boolean leapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)return true;
                else return false;
            }
            else return true;
        }
        else return false;
    }
    
    static int fibonacciRecursion(int n){
        if(n==1)return 0;
        else if(n==2)return 1;
        else return fibonacchi(n-1)+fibonacchi(n-2);
    }
    
    static int fibonacchi(int range){
        if(range==1)return 0;
        else if(range==2)return 1;
        int n1=0,n2=1,n3=0;
        //System.out.print("0 1 ");
        for (int i = 2; i < range; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            //System.out.print(n3+" ");
        }
        return n3;
    }
    
    static boolean palindromCheckS(String str){
        
        int i=0,j=str.length()-1;
        while (i<=j) {            
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;
            j--;
        }
        /*
        StringBuilder builder=new StringBuilder();
        builder.append(str);
        builder=builder.reverse();
        
        String revStr=builder.toString();
        if(str.compareTo(revStr)!=0)return false;
        */
        //return true;
    }
    
    static boolean palindromCheckN(int num){
        int revNum=0,original=num,remainder=0;
        
        while (num!=0) {            
            remainder=num%10;
            revNum=revNum*10+remainder;
            num=num/10;
        }
        if(original==revNum)return true;
        else return false;
    }
    
    static boolean sumOfTwoPrime(int n){
        for (int i = 0; i < n; i++) {
            if (checkPrime(i)==true&&checkPrime(n-i)==true) {
                System.out.print(i+" and "+(n-i));
                return true;
            }
        }
        return false;
    }
    
    static boolean checkPrime(int n){
        if (n==1 || n==0)return false;
        for (int i = 2; i < n/2; i++) {
            if(n%i==0)return false;
        }
        return true;
    }
    
    static int HCF(int a, int b){
        if(a==0 || b==0)return 0;
        else{
            int temp;
            while(b!=0){
                temp=a%b;
                a=b;
                b=temp;

            }
        }
        return a;
    }
    
    static int LCM(int a, int b){
        return (a*b)/HCF(a, b);
    }
    
    static int numberOfBitR(int a, int b){
        int sum=0;
        for (int i = a^b; i!=0; i=i>>1) {
            sum+=i&1;
        }
        return sum;
    }
    
    static int [] decimalToBinary(int n){
        int arr[]=new int[1000];
        int i=0,length=0;
        while(n!=0){
            arr[i]=n%2;
            n=n/2;
            i++;
        }
        length=i;
        int revArr[]=new int[length];
        
        for (int j = 0; j < length; j++) {
            revArr[length-1-j]=arr[j];
        }
        return revArr;
    }
}

















