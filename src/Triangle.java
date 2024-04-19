public class Triangle implements Shape{
    private double lado1,lado2,lado3;

    public Triangle(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double getArea() {
        double s = (lado1+lado2+lado3)/2;
        return Math.sqrt(s * (s-lado1) * (s-lado2)*(s-lado3));
    }

    @Override
    public double getPerimeter() {
        return lado1 + lado2 + lado3;
    }
}
