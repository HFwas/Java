import java.io.Serializable;

public class AtGuiguDemo implements Serializable,Comparable<AtGuiguDemo> {
	private static final long serialVersionUID = 1L;
	private int id;
	private String info;
	private int num;
	public AtGuiguDemo(int id, String info, int num) {
		super();
		this.id = id;
		this.info = info;
		this.num = num;
	}
	
	public AtGuiguDemo() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "AtGuiguDemo [id=" + id + ", info=" + info + ", num=" + num + "]";
	}
	@Override
	public int compareTo(AtGuiguDemo o) {
		
		return 0;
	}
	//编译没有及时更新，为了兼容老版本的代码
/*	@Override
	public int compareTo(Object o) {
		
		return 0;
	}*/
	
	public static void test(int a){
		System.out.println("a = " + a);
	}
}
