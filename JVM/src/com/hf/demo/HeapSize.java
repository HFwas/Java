package com.hf.demo;

public class HeapSize {
	public static void main(String[] args) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("TOTAL_MEMORY：" + totalMemory + "字节");
        System.out.println("MAX_MEMORY：" + maxMemory + "字节");
    }
}
