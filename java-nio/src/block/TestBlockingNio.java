package block;

/**
 * 一，使用NIO完成网络通信的三个核心
 * 1.通道（Channel）：负责连接
 *		java.nio.channels.Channel 接口：
 *			|--SelectableChannel
 *				|--SocketChannel
 *				|--ServerSocketChannel
 *				|--DatagramChannel
 *
 *				|--Pipe.SinkChannel
 *				|--Pipe.SourceChannel
 *2.缓冲区(Buffer)：负责树的存取
 *
 *3.选择器(Selecto)：是SelectableChannel的多路复用器。用于监控SelectableChannel的IO状况
 */
public class TestBlockingNio {
	
	
	
}
