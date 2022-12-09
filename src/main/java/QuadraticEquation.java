public class QuadraticEquation {
    private double d;
    public double a;
    public  double b;
    public double c;
    private double x1;
    private double x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    private void countDiscrim(){
        d = Math.pow(b,2) - 4 * a * c;
    }
    public void countRadicals(){
        countDiscrim();
        if(d > 0){
            double x1 = (-b + Math.sqrt(d))/2*a;
            double x2 = (-b - Math.sqrt(d))/2*a;
            System.out.println(String.format("Первый корень равен %.3f", x1));
            System.out.println(String.format("Второй корень равен %.3f", x2));

        } else if (d == 0) {
            double x = (-b/(2*a));
            System.out.println("Единственный корень равен" + " " + x);

        } else if (d < 0) {
            throw new QuadraticException("Дискриминант меньше нуля");
        }
    }

}
