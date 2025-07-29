package Day18.ConceptofThread.ThreadConstructors;

public class Type1_constructors extends Thread {
    public void run(){
        System.out.println("Message");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        System.out.println("\n"+t1.getId());
        System.out.println(t1.getName());
        t1.setName("Aishu");
        System.out.println(t1.getName());//Type 1 --> thread()
    }
}
