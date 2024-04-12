class Calc {
    int n = 100;
    static int m = 200;

    public static int abs(int a) { return (a>0)?a:-a; }
    public static int max(int a, int b) { return (a>b)?a:b; }
    public static int min(int a, int b) { return (a>b)?b:a; }
}

public class CalcEx {
public static void main(String[] args) {
    Calc a = new Calc(); 

    int ff = a.n;
    System.out.println(ff);
    int f = Calc.m;
    System.out.println(f);
    a.n = 1;
    a.m = 2;

    System.out.println(a.n);
    System.out.println(Calc.m);

    System.out.println(Calc.abs(-5));
    System.out.println(Calc.max(10, 8));
    System.out.println(Calc.min(-3, -8));
}
    
}