package javaapplication1;

import java.util.Scanner;

public class prac5 {

    public static void main(String[] args) {
        
        
        
        System.out.println(toBin(4));
        
        
        
        
        
        
        
        
        
    }
    static char toUpperCaseOrLower(char c){
        int n=(int)c;
        if(c<='z'&&c>='a')c=(char)(n-32);
        else c=(char)(n+32);
        return c;
    }

    static int changeTheCoinU(int arr[], int value, int index) {
        if (value < 0) {
            return 0;
        }
        if (value == 0) {
            return 1;
        }
        if (index == arr.length && value > 0) {
            return 0;
        }
        return changeTheCoinU(arr, value - arr[index], index) + changeTheCoinU(arr, value, index + 1);
    }
    static int changeTheCoinF(int arr[], int value, int index) {
        if (value < 0) {
            return 0;
        }
        if (value == 0) {
            return 1;
        }
        if (index == arr.length && value > 0) {
            return 0;
        }
        return changeTheCoinF(arr, value - arr[index], index+1) + changeTheCoinF(arr, value, index + 1);
    }

    static int binomialCoeff(int n, int k) {
        if (n == k || k == 0) {
            return 1;
        }
        return binomialCoeff(n - 1, k) + binomialCoeff(n - 1, k - 1);
    }

    static long toBin(int dno) {
        long bno = 0, remainder, f = 1;
        while (dno != 0) {
            remainder = dno % 2;
            bno = bno + remainder * f;
            f = f * 10;
            dno = dno / 2;
        }
        return bno;
    }

    static boolean checkPerfectNum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    static boolean checkArmstrong(int n) {
        int num, sum = 0, ld = 0;
        num = n;
        while (num != 0) {
            ld = num % 10;
            sum += ld * ld * ld;
            num = num / 10;
        }
        if (n == sum) {
            return true;
        } else {
            return false;
        }
    }

    static int[] selectionsort(int arr[]) {
        int minIndex, temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    static int[] insertionSort(int arr[]) {

        int i, key, j;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    static int numberOfDigits(int n) {
        return (int) Math.log10(n) + 1;
    }

    static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int str1Save[] = new int[256], str2Save[] = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            int pos = (int) str1.charAt(i);
            str1Save[pos]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            int pos = (int) str2.charAt(i);
            str2Save[pos]++;
        }
        for (int i = (int) 'a'; i < (int) 'z'; i++) {
            System.out.println(i + " " + str1Save[i] + "  " + str2Save[i]);
            if (str1Save[i] != str2Save[i]) {
                return false;
            }
        }

        return true;
    }

    static int[] listOfDigits(int n) {
        int arr[] = new int[(int) Math.log10(n) + 1];
        int i = 0, j = (int) Math.log10(n), temp;
        while (n != 0) {
            arr[i] = n % 10;
            n = n / 10;
            i++;
        }
        i = 0;

        while (i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    static int[] rotateList(int arr[], int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            int j;
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
        return arr;
    }

    static int[] sortTwoList(int arr1[], int arr2[]) {
        int retArr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                retArr[k] = arr1[i];
                i++;
            } else {
                retArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        if (i < arr1.length) {
            retArr[k] = arr1[i];
        } else if (j < arr2.length) {
            retArr[k] = arr2[j];
        }

        return retArr;
    }

    static int[] mergeListA(int arr1[], int arr2[]) {

        int retArr[] = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            retArr[i] = arr1[j];
            i++;
            retArr[i] = arr2[j];
            j++;
        }
        return retArr;
    }

    static int[] mergeList(int arr1[], int arr2[]) {

        int retArr[] = new int[arr1.length + arr2.length];
        int i = 0;
        for (i = 0; i < arr1.length; i++) {
            retArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            retArr[i] = arr2[j];
            i++;
        }
        return retArr;
    }

    static boolean pCheck(String str) {

        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    static int sumOfList(int arr[], int pos) {
        if (pos == arr.length) {
            return 0;
        } else {
            return arr[pos] + sumOfList(arr, pos + 1);
        }
    }

    static void printOddPostion(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static int valueInList(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return 1;
            }
        }
        return 0;
    }

    static int[] revList(int arr[]) {
        int revArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            revArr[arr.length - i - 1] = arr[i];
        }

        return revArr;
    }

    static int mx(int ar[]) {
        int max = -99999;
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        return max;
    }
}
