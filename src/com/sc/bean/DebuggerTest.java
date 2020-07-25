package com.sc.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * desc
 *
 * @author sc135
 * @date 2020-07-25 12:43  星期六
 */
public class DebuggerTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(8);
        list.add(2);
        list.add(5);
        list.add(6);



        for (Integer i : list) {
            System.out.println(i);
            if(i == 3){
                System.out.println(11);
                System.out.println(33);

            }
        }
    }
}
