

public class Test1 {
    public static void main(String[] args) {
      //  System.out.println(test2(2));
        //test2(2);
        test4();
    }

    public static void test2(int i){
        int a=0;
        switch (i){
            case 1:
                a=a+i;
            case 2:
                a=a+i*2;
            case 3:
                a=a+i*3;
        }
        System.out.println(a);
    }
    public static void test3(){
        String tets="a1b2c3";
        String[] t=tets.split("\\d");
        for(String s:t){
            System.out.println(s+"   ");
        }
    }
    public static void test4(){
        String str="**java***java*****java**";
        String str1="java";
        int index=0;

        while((index=str.indexOf(str1,index))!=-1){
            System.out.println(index+"     ");
            index+=str1.length();
        }
    }
}
