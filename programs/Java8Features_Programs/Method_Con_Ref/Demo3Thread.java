package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo3Thread {
    public void childThread(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread-1");
        }
    }

    public static void main(String[] args) {
        Demo3Thread d3 = new Demo3Thread();

        Runnable r = d3::childThread; // instance method
        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread-1");
        }

    }
}
