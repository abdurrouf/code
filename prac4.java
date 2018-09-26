package javaapplication1;

import java.util.Scanner;

public class prac4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        stack st=new stack();
        int choice,value;
        while (true) {            
            choice=scanner.nextInt();
            if(choice==1){
                value=scanner.nextInt();
                st.push(value);
                st.display();
            }
            else if(choice==2){
                st.pop();
                st.display();
            }
            else{
                st.display();
            }
        }
        */
        System.out.println(combination(10, 3));
        
    }
    static int binarySearch(int arr[], int value){
        int low=0,high=arr.length-1,mid=0;
        
        while (low<=high) {            
            mid=low+(high-1)/2;
            if(value==arr[mid])return mid+1;
            else if(value<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        return -1;
    }
    static int combination(int n, int k){
        if(n==k||k==0)return 1;
        else return combination(n-1, k)+combination(n-1, k-1);
    }
}
class stack{
    int size=5,top=-1;
    int arr[]=new int[size];
    void push(int value){
        if(top==size-1)System.out.println("Stack is full");
        else{
            top++;
            arr[top]=value;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return top--;
        }
    }
    void display(){
        if(top==-1)System.out.println("Stack is empty");
        else{
            for (int i = top; i >=0; i--) {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }
    }
}
