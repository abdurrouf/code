package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class FileIO {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new FileReader(new File("C:\\Users\\Md. Abdur Rouf\\Desktop\\input.txt")));
        FileWriter writer=new FileWriter("C:\\Users\\Md. Abdur Rouf\\Desktop\\output.txt");
        String str;
        while ((str=reader.readLine())!=null) {            
            String mStr="";
            int length=str.length(),sum=0;
            for (int i = 0; i < length; i++) {
                if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                    char c=Character.toUpperCase(str.charAt(i));
                    mStr+=c;
                }
                else if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                    char c=Character.toLowerCase(str.charAt(i));
                    mStr+=c;
                }
                else if(str.charAt(i)>='0'&& str.charAt(i)<='9'){
                    sum+=str.charAt(i)-48;
                }
            }
            writer.write(mStr+"    "+sum+"\r");
            System.out.println(mStr);
        }
        reader.close();
        writer.flush();
        writer.close();
        
    }
}
