package com.hfws.test;

import com.hfwas.drools.entity.Order;
import com.sun.xml.internal.ws.config.management.policy.ManagementPolicyValidator;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName DroolsTest
 * @Description TODO
 * @Author hfwas
 * @Date: 7:08 下午
 * @Version: 1.0
 **/
public class DroolsTest {
    @Test
    public void test3(){
        System.out.println(1.0f - 0.9f);
        System.out.println(0.9f - 0.8f);

    }

    @Test
    public void test1(){
        List<String> list = Arrays.asList("a", "b", "c");
        list.add("d");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("d");
        strings.stream().distinct();
        HashMap<String, String> map = new HashMap<>();
        map.put("dd", "");
    }

    @Test
    public void test(){
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        //会话对象，用于和规则引擎交互
        KieSession kieSession = kieClasspathContainer.newKieSession();

        //构造订单对象，设置原始价格，由规则引擎根据优惠规则计算优惠后的价格
        Order order = new Order();
        order.setOriginalPrice(210D);

        //将数据提供给规则引擎，规则引擎会根据提供的数据进行规则匹配
        kieSession.insert(order);

        //激活规则引擎，如果规则匹配成功则执行规则
        kieSession.fireAllRules();
        //关闭会话
        kieSession.dispose();

        System.out.println("优惠前原始价格：" + order.getOriginalPrice() +
                "，优惠后价格：" + order.getRealPrice());
    }

}
