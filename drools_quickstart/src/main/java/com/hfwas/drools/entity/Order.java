package com.hfwas.drools.entity;

/**
 * @ClassName Order
 * @Description TODO
 * @Author hfwas
 * @Date: 7:06 下午
 * @Version: 1.0
 **/
public class Order {
    //订单原始价格，即优惠前价格
    private Double originalPrice;
    //订单真实价格，即优惠后价格
    private Double realPrice;

    public String toString() {
        return "Order{" +
                "originalPrice=" + originalPrice +
                ", realPrice=" + realPrice +
                '}';
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }
}
