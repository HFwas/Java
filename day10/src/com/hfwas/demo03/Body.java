package com.hfwas.demo03;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: com.hfwas.demo03
 * @version: 1.0
 */
public class Body {//外部类

    public class Heart{//成员内部类
        public void beat(){//内部类方法
            System.out.println("心脏跳动");
            System.out.println("我叫：" + name);
        }
    }

    /**
     * 外部类的方法
     */
    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }

    //外部类的成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
