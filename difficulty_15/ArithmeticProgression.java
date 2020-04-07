package difficulty_15;/*
Заданы первый и второй элементы арифметической прогрессии. Требуется написать программу,
которая вычислит элемент прогрессии по ее номеру.

Входные данные
Входной файл INPUT.TXT содержит три целых числа, разделенных пробелами – первый элемент прогрессии A1 (1 ≤ A1 ≤ 1000),
второй элемент прогрессии A2 (1 ≤ A2 ≤ 1000), и номер требуемого элемента N (1 ≤ N ≤ 1000).

Выходные данные
Выходной файл OUTPUT.TXT должен содержать одно целое число - N-й элемент арифметической прогрессии.

Пример
INPUT.TXT	OUTPUT.TXT
1 5 3	    9
 */

import java.io.*;
import java.util.*;

public class ArithmeticProgression {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A1 = in.nextInt();
        int A2 = in.nextInt();
        int N = in.nextInt();
        int d = A2-A1;

        int[]arr = new int[N];
        arr[0]=A1;
        for (int i = 0; i < N-1; i++) {
            arr[i+1]=arr[i]+d;
        }

        out.println(arr[N-1]);
        out.flush();
    }
}
