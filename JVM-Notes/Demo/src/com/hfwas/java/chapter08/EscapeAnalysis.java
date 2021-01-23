package com.hfwas.java.chapter08;

/**
 * @Author: HFwas
 * @Date: 2021/1/23
 * @Description: com.hfwas.java.chapter08
 * 逃逸分析
 *      如何快速的判断是否发生了逃逸分析，大家就看new的对象是否有可能在方法外被调用
 * @version: 1.0
 */
public class EscapeAnalysis {
    public EscapeAnalysis obj;

    /**
     * 方法返回EscapeAnalysis对象，发生逃逸
     * @return
     */
    public EscapeAnalysis getInstance(){
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /**
     * 为成员属性赋值，发生逃逸
     */
    public void setObj(){
        this.obj = new EscapeAnalysis();
    }

    /**
     * 对象的作用于仅在当前方法中有效，没有发生逃逸
     */
    public void useEscapeAnalysis(){
        EscapeAnalysis escapeAnalysis = new EscapeAnalysis();
    }

    /**
     * 引用成员遍历的值，发生逃逸
     */
    public void useEscapeAnalysis1(){
        EscapeAnalysis escapeAnalysis = getInstance();
        //getInstance().XXX  发生逃逸
    }
}
