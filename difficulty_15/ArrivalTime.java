package difficulty_15;/*
Задано время отправления поезда и время в пути до конечной станции.
Требуется написать программу, которая найдет время прибытия этого поезда (возможно, в другие сутки).

        Входные данные
        Входной файл INPUT.TXT содержит две строки. В первой строке задано время отправления,
        а во второй строке – время в пути. Время отправления задается в формате «HH:MM», где HH время в часах,
        которое принимает значение от 00 до 23, ММ – время в минутах, которое принимает значение от 00 до 59.
        Время в пути задается двумя неотрицательными целыми числами – количество часов и количество минут.
        Числа разделяются одним пробелом. Количество часов не превышает 120, минут – 59.

        Выходные данные
        Выходной файл OUTPUT.TXT должен содержать одну строку – время прибытия поезда на конечную станцию.
        Формат вывода этого времени совпадает с форматом ввода времени отправления.

        Примеры
        INPUT.TXT	OUTPUT.TXT
        00:00
        10 10	    10:10
        01:02
        4 6	        05:08
        11:00
        22 0	    09:00
        */

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class ArrivalTime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String departure = in.nextLine();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
        LocalTime dep = LocalTime.parse(departure, myFormatter);

        long hh = in.nextLong();
        long mm = in.nextLong();

        out.println(dep.plusHours(hh).plusMinutes(mm));
        out.flush();
    }
}
