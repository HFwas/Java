package com.hfwas.demo04;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author: HFwas
 * @Date: 2021/1/9
 * @Description: com.hfwas.demo04
 * 练习：序列化集合
 *         当我们想在文件中保存多个对象的时候
 *         可以把多个对象存储到一个集合中
 *         对集合进序列化和反序列化
 *     分析:
 *         1.定义一个存储Person对象的ArrayList集合
 *         2.往ArrayList集合中存储Person对象
 *         3.创建一个序列化流ObjectOutputStream对象
 *         4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
 *         5.创建一个反序列化ObjectInputStream对象
 *         6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
 *         7.把Object类型的集合转换为ArrayList类型
 *         8.遍历ArrayList集合
 *         9.释放资源
 * @version: 1.0
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.定义一个存储Person对象的ArrayList集合
        ArrayList<Person> list = new ArrayList<>();
        //2.往ArrayList集合中存储Person对象
        list.add(new Person("张三",18));
        list.add(new Person("李四",60));
        list.add(new Person("王五",25));
        list.add(new Person("赵六",36));

        //3.创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\GitRep\\JavaSE\\day20\\persons.txt"));
        //4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
        oos.writeObject(list);
        //5.创建一个反序列化ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Java\\GitRep\\JavaSE\\day20\\persons.txt"));
        //6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        Object object = ois.readObject();
        //7.把Object类型的集合转换为ArrayList类型
        ArrayList<Person> people = (ArrayList<Person>)object;
        for (Person person : people) {
            //8.遍历ArrayList集合
            System.out.println(person.toString());
        }

        //9.释放资源
        ois.close();
        oos.close();
    }
}
