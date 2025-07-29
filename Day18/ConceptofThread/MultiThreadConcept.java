package Day18.ConceptofThread;

public class MultiThreadConcept extends Thread {
    public void run(){
        System.out.println("Hi - "+MultiThreadConcept.currentThread().getId());
        System.out.println("Abi - "+MultiThreadConcept.currentThread().getId());
        System.out.println("Welcome - "+MultiThreadConcept.currentThread().getId());
    }
    public static void main(String[] args) {
        MultiThreadConcept m1 = new MultiThreadConcept();
        m1.start();
        try{
            m1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        MultiThreadConcept m2 = new MultiThreadConcept();
        m2.start();
        try{
            m2.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        MultiThreadConcept m3 = new MultiThreadConcept();
        m3.start();
        try{
            m3.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
