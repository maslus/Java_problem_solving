//Клавиатура
//        (Время: 1 сек. Память: 16 Мб Сложность: 11%)
//        Для данной буквы английского алфавита нужно вывести справа стоящую букву на стандартной клавиатуре. При этом клавиатура замкнута, т.е. справа от буквы «p» стоит буква «a», от буквы «l» стоит буква «z», а от буквы «m» — буква «q».
//
//        Входные данные
//        Первая строка входного файла INPUT.TXT содержит один символ — маленькую букву английского алфавита.
//
//        Выходные данные
//        В выходной файл OUTPUT.TXT следует вывести букву стоящую справа от заданной буквы, с учетом замкнутости клавиатуры.


import java.io.*;
import java.util.*;

public class KeyBoard{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String a = "qwertyuiopasdfghjklzxcvbnm";

        String b = in.nextLine();

        char[] c = a.toCharArray();

        for (int i = 0; i < c.length-1; i++) {
            if (b.equals(Character.toString(c[i]))) {
                out.println(c[i+1]);
            }
        }
        if (b.equals(Character.toString(c[c.length-1])))
            out.println(c[0]);
        out.flush();
    }
}