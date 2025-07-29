package Day18.PolymorphismConcept;

class Vaasu{
    void Abinaya(){
        System.out.println("Best friend");
    }
}

class Selva{
    void Abinaya(){
        System.out.println("Sister");
    }
}

class Aishu{
    void Abinaya(){
        System.out.println("Friend");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Vaasu v = new Vaasu();
        Selva s = new Selva();
        Aishu a = new Aishu();
        v.Abinaya();
        s.Abinaya();
        a.Abinaya();
    }
}
