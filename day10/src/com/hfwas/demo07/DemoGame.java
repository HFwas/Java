package com.hfwas.demo07;

/**
 * @Author: HFwas
 * @Date: 2020/12/31
 * @Description: com.hfwas.demo07
 * @version: 1.0
 */
public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("蜘蛛侠");

        //使用单独定义的实现类
//        hero.setSkill(new SkillImpl());
//        hero.release();

        //还可改成使用匿名内部类
//        Skill skill = new Skill(){
//
//            @Override
//            public void use() {
//                System.out.println("Pia~pia");
//            }
//        };
//        hero.setSkill(skill);
//        hero.release();

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("piu~biu");
            }
        });
        hero.release();
    }

}
