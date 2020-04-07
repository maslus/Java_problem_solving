/*
Даны длины трех отрезков. Требуется проверить: могут ли они являться сторонами невырожденного треугольника.

Входные данные
Входной файл INPUT.TXT содержит 3 натуральных числа X Y Z – длины заданных отрезков.
Длины отрезков записаны в одной строке через пробел и не превышают 1000.

Выходные данные
В выходной файл OUTPUT.TXT выведите YES, если отрезки могут быть сторонами треугольника и NO в противном случае.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	3 4 5	YES
2	1 1 5	NO
 */

import java.io.*;
import java.util.*;

public class TriangleThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        short X = in.nextShort();
        short Y = in.nextShort();
        short Z = in.nextShort();

        if (X < Y + Z && Y < X + Z && Z < X + Y){
            out.println("YES");
            out.flush();
        } else {
            out.println("NO");
            out.flush();
        }


    }
}
