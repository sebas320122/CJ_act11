
public class Circle implements Shape {

    //atributos
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 3.14 * (radio*radio);
    }

    @Override
    public double getPerimeter() {
        return (2*3.14)*radio;
    }
}
