import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        List<Lambda> list=new ArrayList<Lambda>();
        Lambda l1=new Lambda(1,"小米",3000.0,30);
        list.add(new Lambda(2,"小花",4000.0,22));
        list.add(new Lambda(3,"小刘",8000.0,40));
        list.add(new Lambda(4,"小李",6000.0,36));
        list.add(l1);

        list.forEach((lambda) -> {
            System.out.println(lambda.getSlary1());
        });
    }
}
