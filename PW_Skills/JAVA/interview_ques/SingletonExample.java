package interview_ques;

class Singleton {
    public static Singleton obj = null;

    private Singleton() {
        System.out.println("Constructor is executed and obj is created");
    }

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
