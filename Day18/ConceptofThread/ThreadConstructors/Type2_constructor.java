package Day18.ConceptofThread.ThreadConstructors;

public class Type2_constructor extends Thread {//Constructor 2 thread(string)
    public void run(){
        System.out.println("Message");
    }
    public static void main(String[] args){
        Thread t1 = new Thread("Abi");
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        t1.setName("Aishu");
        System.out.println(t1.getName());
    }
}
