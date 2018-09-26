package javaapplication1;

public class UpperBound {

    public static void main(String[] args) {
        int arr[] = new int[]{1,3,4,4,4,4,5,6,7,8};
        System.out.println("Lower bound : "+lowerBound(arr, 4)+"th element");
        System.out.println("Upper bound : "+upperBound(arr, 4)+"th element");
    }

    static int lowerBound(int arr[], int n) {
        int start = 0, end = arr.length, mid=0, lower = -1, upper = -1;
        
        
        while (start<end) {            
            mid=start+(end-start)/2;
            if(arr[mid]<n){
                start=mid+1;
            }
            else if(arr[mid]>=n){
                end=mid-1;
            }
            
        }
        
        return start+1;
    }

    static int upperBound(int arr[], int n) {
        int start = 0, end = arr.length, mid=0, lower = -1, upper = -1;
        
        
        while (start<=end) {            
            mid=start+(end-start)/2;
            if(arr[mid]>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        
        return start+1;
    }    
}
