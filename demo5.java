class P{
    P(){
        System.out.println("P class");
    }
}

class C extends P{
    C(){
        System.out.println("C class");
    }
}



public class demo5 {
    public static void main(String[] args) {
        //P p = new P();
        C c = new C();
    }
}
