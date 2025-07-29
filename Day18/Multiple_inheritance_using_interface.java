package Day18;

interface parent1{
    void car();
}

interface parent2{
    void bike();
}

public class Multiple_inheritance_using_interface implements parent1,parent2 {
    public void car(){
        System.out.println("BMW");
    }
    public void bike(){
        System.out.println("KTM");
    }
    public static void main(String[] args) {
         Multiple_inheritance_using_interface mi = new Multiple_inheritance_using_interface();
         mi.car();
         mi.bike();
    }
}
