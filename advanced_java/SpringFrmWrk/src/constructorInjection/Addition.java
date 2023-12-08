package constructorInjection;
public class Addition {
    private int x;
    private int y;

    public Addition() {
    }

    public Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Addition(double x, double y) {
        System.out.println("double-double");
        this.x = (int)x;
        this.y = (int)y;
    }
    
    public Addition(String x, String y) {
        System.out.println("String-String");
        this.x = Integer.parseInt(x);
        this.y = Integer.parseInt(y);
    }

    @Override
    public String toString() {
        return "Addition{" + "x=" + x + ", y=" + y + '}';
    }
}
