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
        int b=0;
        A a=new A();
        System.out.println(Integer.compare(2,4));
        b++;
        a.getA(() -> {
            System.out.println("asdasdas");

        });
        b+=10;
        System.out.println(b);
    }
}
@FunctionalInterface
interface  SSS{
     void test1();
}
