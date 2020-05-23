package com.hf.nio;

import java.nio.ByteBuffer;

import org.junit.Test;

/*
 * 一，缓冲区（Buffer）：在JavaNIO中负责数据的存取，缓冲区就是数组，用于存储不同数据类型的数据
 * 格局数据类型不同（*）,提供了不同类型的缓冲区
 * ByteBuffer
 * CharBuffer
 * ShortBuffer
 * IntBuffer
 * LongBuffer
 * FloatBuffer
 * DoubleBuffer
 * 
 *上传缓冲区的管理方式几乎一致，通过allocate()获取缓冲区
 *
 *二：缓冲区存取数据的两个核心方法
 *put()：存入数据到缓冲区
 *get():获取缓冲区中的数据
 *
 *四：
 *capacity：容量，表示缓冲区中最大存储数据的容量，一旦声明不能改变
 *limit：界限，表示缓冲区可以操作数据的大小，（limit 后数据不能进行读写）
 *position：位置，表示缓冲区中正在操作数据的位置
 */
public class TestBuffer {
	
	@Test
	public void test01(){
		//1。分配一个指定大小的缓冲区
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		System.out.println("=========");
		System.out.println(buffer.capacity());
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
	}
	
	
}	
