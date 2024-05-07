class Bank{
    public int roi(){
        return 10;
    }
}
class SBI extends Bank{

}
class Axis extends Bank{
    public int roi(){
        return 12;
    }
}

public class demo8 {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.roi();
        Axis a = new Axis();
        a.roi();
    }
}
