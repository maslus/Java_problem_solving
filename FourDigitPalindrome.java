//Четырехзначный палиндром
//        (Время: 1 сек. Память: 16 Мб Сложность: 10%)
//        Требуется написать программу, определяющую, является ли четырехзначное натуральное число N палиндромом, т.е. числом, которое одинаково читается слева направо и справа налево.
//
//        Входные данные
//        Входной файл INPUT.TXT содержит натуральное число N (1000 ≤ N ≤ 9999).
//
//        Выходные данные
//        В выходной файл OUTPUT.TXT следует вывести слово «YES», если число N является палиндромом, или «NO» – если нет.

import java.io.*;
import java.util.*;

public class FourDigitPalindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        int r4 = a/1000;
        int r3 = (a-r4*1000)/100;
        int r2 = (a-r4*1000-r3*100)/10;
        int r1 = a-r4*1000-r3*100-r2*10;

        if (r1==r4&&r2==r3) out.println("YES");
        else out.println("NO");

        out.flush();
    }
}