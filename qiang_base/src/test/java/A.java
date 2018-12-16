import org.springframework.context.annotation.EnableAspectJAutoProxy;
import java.util.Arrays;
import java.util.List;


@EnableAspectJAutoProxy
public class A {

    public void  getA(SSS s){
        System.out.println(1);
        s.test1();
        System.out.println(2);

    }
    public static void main(String[] args) {
        A a=new A();
        a.getA(() -> {
            System.out.println("hhhhhhh");
        });
    }
}
@FunctionalInterface
interface  SSS{
     void test1();
}
