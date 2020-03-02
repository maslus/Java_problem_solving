package difficulty_15;/*
По целочисленным координатам вершин треугольника (x1,y1), (x2,y2) и (x3,y3) требуется вычислить его площадь.

Входные данные
Входной файл INPUT.TXT содержит 6 целых чисел x1,y1,x2,y2,x3,y3 – координаты вершин треугольника.
Все числа не превышают 106 по абсолютной величине.

Выходные данные
В выходной файл OUTPUT.TXT выведите точное значение площади заданного треугольника.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	2 1 2 4 6 1	6
2	0 0 0 3 3 0	4.5
 */

import java.io.*;
import java.util.*;

public class TriangleArea {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        double x1 = in.nextInt();
        double y1 = in.nextInt();
        double x2 = in.nextInt();
        double y2 = in.nextInt();
        double x3 = in.nextInt();
        double y3 = in.nextInt();

        double area = Math.abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2;
        out.println(area);
        out.flush();
    }
}