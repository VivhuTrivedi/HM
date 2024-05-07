class Draw{
    Draw()
    {
        System.out.println("Draw");
    }
    Draw(int a){
        System.out.println("Draw(int a)");
    }
    Draw(int a, int b){
        System.out.println("Draw(int a, int b)");
    }

}


public class demo7 {
    public static void main(String[] args) {
        Draw d = new Draw();
    Draw a1 = new Draw(100);
    }
    
}
