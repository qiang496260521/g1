public class B extends  A {
    static {
        System.out.println("B ++");
    }
    {
        System.out.println("B+");
    }
    public B(){
        System.out.println("B");
    }
}
