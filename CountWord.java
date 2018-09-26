package javaapplication1;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] word=str.split("\\s+");
        System.out.println(word.length);
    }
}
