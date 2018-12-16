public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runn = new MyRunnable();
        Thread thread=new Thread(runn);
        thread.start();

    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<10;i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(300);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}
