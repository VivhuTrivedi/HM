abstract class Bank{
    abstract void ATM();
    abstract void KYC();
}

/**
 *  SBI 
 */
class  SBI extends Bank {
    void ATM(){
        System.out.println("500000");
    }
    void KYC(){
        System.out.println("KYC");
    }
    
}
class  Axis extends Bank {
    void ATM(){
        System.out.println("500000");
    }
    void KYC(){
        System.out.println("KYC");
    }
    
}



public class demo11 {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.ATM();
        Axis a = new Axis();
        a.KYC(); 
    }
}
