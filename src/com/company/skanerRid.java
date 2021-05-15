package com.company;

import java.util.Scanner;

public class skanerRid {
    public static String func1(){  //func1 - сюда передаеться командой - return что - riad;
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод: ");
        String riad = in.nextLine();
        return riad;
    }

}
