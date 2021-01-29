package com.hfwas.java1.chapter01;

/**
 * @Author: HFwas
 * @Date: 2021/1/29
 * @Description: com.hfwas.java1.chapter01
 * @version: 1.0
 */
public class JavapTets {
    private int num;
    boolean flag;
    protected char gender;
    public String info;

    public static final int COUNTS = 1;

    static {
        String url = "hello hfwas";
    }

    {
        info = "java";
    }

    public JavapTets() {
    }

    public JavapTets(boolean flag) {
        this.flag = flag;
    }

    private void mehodPrivate(){

    }

    int getNum(int i){
        return num + i;
    }

    protected char showGender(){
        return gender;
    }

    public void showInfo(){
        int i = 10;
        System.out.println(info + i);
    }
}
