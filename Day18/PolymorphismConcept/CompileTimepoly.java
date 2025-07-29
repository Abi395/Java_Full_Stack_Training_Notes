package Day18.PolymorphismConcept;

public class CompileTimepoly {
    public void add(int a,int b){//Method declaration
        System.out.println(a+b);
    }
    public void add(int a,int b ,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        CompileTimepoly cm = new CompileTimepoly();//cm --> Instance reference
        cm.add(2,4);//Method calling 
        cm.add(2,5,7);
    }
}
