package Day18.ConceptofThread;

public class Thread_timing extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Thread_timing tt = new Thread_timing();
        tt.run();
    }
}
