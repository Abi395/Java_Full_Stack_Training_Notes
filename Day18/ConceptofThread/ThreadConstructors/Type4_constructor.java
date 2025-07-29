package Day18.ConceptofThread.ThreadConstructors;

public class Type4_constructor implements Runnable {
    public void run(){
        System.out.println("Message");
    }
    public static void main(String[] args) {
        Type4_constructor sr = new Type4_constructor();
        Thread t1 = new Thread("Abitha");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.setName("Vaasu");
        System.out.println(t1.getName());
    }
    
}
