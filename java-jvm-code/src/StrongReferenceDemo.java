public class StrongReferenceDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        o1=null;
        System.gc();
        System.out.println(o2);
    }
}
