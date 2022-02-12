package com.hfwas.demo04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: HFwas
 * @Date: 2021/1/7
 * @Description: com.hfwas.demo04
 * @version: 1.0
 */
public class Demo02Arrays {
    public static void main(String[] args) {
        Person[] per = {
                new Person("a", 15),
                new Person("b", 35),
                new Person("c", 28)
        };

        //按照年龄升序排序
        /*Arrays.sort(per, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        //使用lambda表达式
        Arrays.sort(per,(Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        for (Person person : per) {
            System.out.println(person);
        }
    }
}
