package main;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Scanners {
    private static Scanner in = new Scanner(new InputStreamReader(System.in));
    
    public static ArrayList<String> getStrings(){
        System.out.println("띄어쓰기로 구분해서 문자열을 입력해주세요 :)");
        String str = in.next();
        ArrayList<String> tmp = new ArrayList<String>();
        String[] str2 = str.split(" ");
        int i = 0;
        while(str2[i] != null)
        {
            tmp.add(str2[i]);
            i++;
        }
        return tmp;
    }

    public static String getString(){
        String str = in.next();
        return str;
    }

    public static ArrayList<Integer> getInteger(){
        System.out.println("띄어쓰기로 구분해서 숫자를 입력해주세요 :)");
        String str = in.next();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        String[] str2 = str.split(" ");
        int i = 0;
        while(str2[i] != null)
        {
            tmp.add(Integer.parseInt(str2[i]));
            i++;
        }
        return tmp;
    }

    public static double getIntegerOne(){
        double tmp = in.nextDouble();
        return tmp;
    }
}
