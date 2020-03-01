/*
Иван Васильевич пришел на рынок и решил купить два арбуза: один для себя, а другой для тещи. Понятно, что для себя
нужно выбрать арбуз потяжелей, а для тещи полегче. Но вот незадача: арбузов слишком много и он не знает как же выбрать
самый легкий и самый тяжелый арбуз? Помогите ему!

Входные данные
В первой строке входного файла INPUT.TXT задано одно число N – количество арбузов. Вторая строка содержит N чисел,
записанных через пробел. Здесь каждое число – это масса соответствующего арбуза. Все числа натуральные и
не превышают 30000.

Выходные данные
В выходной файл OUTPUT.TXT нужно вывести два числа через пробел: массу арбуза, который Иван Васильевич купит теще и
массу арбуза, который он купит себе.

Пример
INPUT.TXT	OUTPUT.TXT
5
5 1 6 5 9	1 9
 */
import java.io.*;
import java.util.*;

public class Watermelons {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        short N = in.nextShort();
        short[]arr=new short[N];

        for (int i = 0; i <N ; i++) {

            arr[i] = in.nextShort();
        }
           short min=arr[0];
           short max=arr[0];
        for (int i = 0; i < N; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

        out.println(min);
        out.println(max);
        out.flush();
    }
}