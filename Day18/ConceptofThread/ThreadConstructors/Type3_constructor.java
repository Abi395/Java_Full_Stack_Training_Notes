package Day18.ConceptofThread.ThreadConstructors;

public class Type3_constructor implements Runnable {//Type 3 constructor-->Thread(Runnable)
    public void run(){
        System.out.println("Message");
    }
    public static void main(String[] args) {
        Type3_constructor r = new Type3_constructor();
        Thread t1 = new Thread(r);
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.setName("Vaasu");
        System.out.println(t1.getName());
    }
}
