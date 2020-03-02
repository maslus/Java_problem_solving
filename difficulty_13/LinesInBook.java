package difficulty_13;/*
В книге на одной странице помещается K строк. Таким образом, на 1-й странице печатаются строки с 1-й по K-ю,
на второй — с (K+1)-й по (2∙K)-ю и т.д. Напишите программу, которая по номеру строки в тексте определяет номер
страницы, на которой будет напечатана эта строка, и порядковый номер этой строки на странице.

Входные данные
Входной файл INPUT.TXT содержит число K – количество строк, которое печатается на странице, и число N – номер
строки (1 ≤ K ≤ 200, 1 ≤ N ≤ 20000).

Выходные данные
В выходной файл OUTPUT.TXT выведите два числа – номер страницы, на которой будет напечатана эта строка и
номер строки на странице.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	50 1	1 1
2	20 25	2 5
3	15 43	3 13
 */

import java.io.*;
import java.util.*;

public class LinesInBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        float K = in.nextFloat();
        float N = in.nextFloat();

        int page = (int)Math.ceil(N / K);
        int line = (int) (N-K*(page-1));

        out.println( page + " " +line);
        out.flush();
    }
}