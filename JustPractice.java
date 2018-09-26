package javaapplication1;

import java.util.Scanner;

public class JustPractice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int sum=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoeff(i, j)+" ");
            }
            System.out.println("");
        }
        
    }
    
    static int binomialCoeff(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        }
        return binomialCoeff(n - 1, k) + binomialCoeff(n - 1, k - 1);
    }
    
    static int coinC(int arr[],int sum,int index){
        if(sum==0)return 1;
        if(sum<0)return 0;
        if(index==arr.length && sum>0)return 0;
        else return coinC(arr, sum-arr[index], index)+coinC(arr, sum, index+1);
    }
    
    static int bSearch(int arr[],int n){
        int low=0,mid,high=arr.length-1;
        while (low<=high) {            
            mid=low+(high-1)/2;
            if(arr[mid]<n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            if(arr[mid]==n){
                return mid+1;
            }
        }
        return 0;
    }
    
    
}
