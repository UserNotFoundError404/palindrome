package com.company;
import java.io.InputStream;
import java.util.Scanner;
class palindrome{
    public palindrome(InputStream in){
        String str = "";
        Scanner userText = new Scanner(System.in);
        str = userText.nextLine();
        String rts = "";
        char ch;
        for(int i = 0; i<str.length();i++){
            ch = str.charAt(i);
            rts = ch + rts;
        }
        new println(rts);
        if (str.equals(rts)){
            System.out.println("Un-not-palindrome");
        }
        else{
            System.out.println("Un-palindrome");
        }
    }
}
public class palindrome_function {
    public static void main(String[] args){
        new palindrome(System.in);
    }
}
