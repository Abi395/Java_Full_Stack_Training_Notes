package Day18.ConceptofThread;

public class SingleThreadConcept extends Thread {
    public void run(){
        System.out.println("Hi - "+SingleThreadConcept.currentThread().getId());
        System.out.println("bye - "+SingleThreadConcept.currentThread().getId());
        System.out.println("tata - "+SingleThreadConcept.currentThread().getId());
    }
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            SingleThreadConcept th = new SingleThreadConcept();
            th.run();//For single thread we given as run
            th.start();//For multi thread we given as start, It prints in random way 
        }
    }
}
