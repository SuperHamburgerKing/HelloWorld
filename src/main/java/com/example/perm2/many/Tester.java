package com.example.perm2.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        ArrayList();
//        set練習
//        set內不能有重複值，且無index
        HashSet<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        for( int sets:set){
            System.out.println(sets);
        }
//        map練習
//        map內無index值，若重複給相同key，會覆蓋原先的value值
        HashMap<String,String> stocks = new HashMap();
        stocks.put("2330","台積電");
        stocks.put("1234","郭有名");
        System.out.println(stocks);
//        stock.keyset()為stock的key集合，並用key得到對應的value
        for (String key:stocks.keySet()){
            System.out.println(stocks.get(key));
        }

    }

    private static void ArrayList() {
        //        陣列練習
        int nums[] = new int[5];
        nums[0] = 5;
        nums[1] = 3;
        int num[] = {12,3,4,5,6,7};
//        for each用法
        for ( int a:num ){
            System.out.println(a);
        }
        int n = num.length;
        System.out.println(n);
//        集合練習
        ArrayList<Integer> list= new ArrayList();
        list.add(1);
        list.add(2);
//        int n = list.get(0);
        System.out.println(list);
//        在宣告時直接給資料進list
        List list1 = Arrays.asList(12,"A",3);
        System.out.println(list1);
//        for each 練習
        for(Object m:list1){
            System.out.print(m);
}
    }
}
