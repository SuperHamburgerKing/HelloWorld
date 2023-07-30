package com.example.perm2.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class tester {
    public static void main(String[] args) throws ParseException {
//        計算停車費率
        LocalDateTime enter = LocalDateTime.of(2023,7,30,
                13,40,00);
        LocalDateTime leave = LocalDateTime.of(2023,7,30,
                15,45,00);
        Car car = new Car("ABC",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long m = (long)(Math.ceil(car.getDuration()/60.0));
        System.out.println(m);

//        java();
//        java8為java時間的新類別
//        為格林威治時間
//        java8();
    }







    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
//        為本地時間
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
//        新類別轉換格式
        DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyy/MM/dd HH/mm/ss");
        System.out.println(a.format(now));
//        若要加減時間，使用新類別的方法不會改變原本now值，屬於immutation
        System.out.println(now.plus(Duration.ofHours(3)));
//        設定其他時間
        LocalDateTime other = LocalDateTime.of(2018,5,
                3,5,24,5);
        System.out.println(other);
//        再把other轉換格式
        System.out.println(a.format(other));
    }

    private static void java() throws ParseException {
//        java時間的舊類別
        Date date = new Date();
        System.out.println(date.toString());
        Date other = null;
        Calendar calendar = Calendar.getInstance();
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH/mm/ss");
        System.out.println(sdf.format(date));
        String s = "2018/03/24 22/01/54";
        other = sdf.parse(s);
        calendar.set(Calendar.MONTH,9);
        calendar.add(Calendar.DAY_OF_YEAR,7);
        System.out.println(calendar.getTime());
    }

}
