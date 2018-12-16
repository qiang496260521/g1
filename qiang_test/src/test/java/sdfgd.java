import org.junit.Test;

import java.sql.SQLOutput;

public class sdfgd {
    public static String a;
    public String b;

    @Test
    public void test1(){
      int[] a=new int[20];
      a[0]=0;
      a[1]=1;
      for (int b=2;b<20;b++){
          a[b]=a[b-1]+a[b-2];
      }
        for(int c=0;c<a.length;c++){
            System.out.print(a[c]);
            if((c+1)%5==0){
                System.out.println("\n");
            }


        }
    }
}
