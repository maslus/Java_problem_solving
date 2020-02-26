/*
Отрезок задан координатами своих концевых точек. Требуется вычислить длину этого отрезка.

Входные данные
Входной файл INPUT.TXT содержит координаты концов отрезка в формате X1 Y1 X2 Y2 .
Все координаты – целые числа, не превышающие 1000 по абсолютной величине.

Выходные данные
В выходной файл OUTPUT.TXT выведите длину отрезка с точностью 10-5.

Пример
№	INPUT.TXT	OUTPUT.TXT
1	3 4 8 4	5
 */
import java.io.*;
import java.util.*;

public class SegmentLength{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int X1 = in.nextInt();
        int Y1 = in.nextInt();
        int X2 = in.nextInt();
        int Y2 = in.nextInt();
        out.println(Math.sqrt(Math.pow((X2-X1), 2)+Math.pow((Y2-Y1),2)));

        out.flush();
    }
}