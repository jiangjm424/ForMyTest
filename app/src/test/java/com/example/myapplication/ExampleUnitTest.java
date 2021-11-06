package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>




true
true
false
true

false
false
false
false
false
false
true



 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b);  //true
        int c = 10;
        System.out.println(b == c);  //true


        Integer aa = 210;
        Integer bb = 210;
        System.out.println(aa == bb);  //false
        int cc = 210;
        System.out.println(bb == cc);  //true

        Object o1 = "s1";
        Object o2 = "s11";
        System.out.println(o1 == o2);  //false
        System.out.println(o1.equals(o2));  //false

        Object o3 = new Object();
        Object o4 = new Object();
        System.out.println(o3 == o4);   //false
        Boolean b1 = o3.equals(o4);
        System.out.println(o2.equals(o4));  //false
        System.out.println(o3.equals(o4));  //false

        String s1 = new String("s1");
        String s2 = new String("s1");
        System.out.println(s1 == s2 );  //false
        System.out.println(s1.equals(s2));  //true

    }
}