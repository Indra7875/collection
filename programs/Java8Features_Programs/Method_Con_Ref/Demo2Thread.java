package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo2Thread {
    public static void childThread(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread-1");
        }
    }

    public static void main(String[] args) {
        Runnable r = Demo2Thread::childThread; // static method
        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread-1");
        }

    }
}
