import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declarar escaner
        Scanner scanner = new Scanner(System.in);


        // Interfaz en consola
        while (true) {
            int valido = 0;
            Shape shape = null;
            String opcionOperacion = "";
            String operacion = "";
            int opcionOperacionNum = 0;
            while (valido==0) {
                // Pedir operacion
                System.out.println("> Seleccione una operacion");
                System.out.println("1 = Calcular area");
                System.out.println("2 = Calcular perimetro");
                System.out.println("3 = Salir");
                opcionOperacion = scanner.nextLine();

                switch (opcionOperacion) {
                    case "1":
                        operacion = "area";
                        valido = 1;
                        opcionOperacionNum = 1;
                        break;
                    case "2":
                        operacion = "perimetro";
                        valido = 1;
                        opcionOperacionNum = 2;
                        break;
                    case "3":
                        valido = 1;
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Favor de seleccionar una opcion valida!");
                }
            }

            valido = 0;

            // Pedir figura
            while (valido==0) {
                System.out.println("> Seleccione una figura");
                System.out.println("1 = Circulo");
                System.out.println("2 = Triangulo");
                System.out.println("3 = Cuadrado");
                System.out.println("4 = Salir");
                String opcionFigura = scanner.nextLine();

                switch (opcionFigura) {
                    case "1":
                        System.out.println("> Ingresa el radio del circulo: ");
                        double radio = scanner.nextDouble();
                        shape = new Circle(radio);
                        valido = 1;
                        break;
                    case "2":
                        System.out.println("> Ingresa el lado 1 del triangulo: ");
                        double lado1 = scanner.nextDouble();
                        System.out.println("> Ingresa el lado 2 del triangulo: ");
                        double lado2 = scanner.nextDouble();
                        System.out.println("> Ingresa el lado 3 del triangulo: ");
                        double lado3 = scanner.nextDouble();
                        shape = new Triangle(lado1, lado2, lado3);
                        valido = 1;
                        break;
                    case "3":
                        System.out.println("> Ingresa el lado del cuadrado: ");
                        double lado = scanner.nextDouble();
                        shape = new Square(lado);
                        valido = 1;
                        break;
                    case "4":
                        valido = 1;
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Favor de seleccionar una opcion valida!");
                }
            }

            // Determinar operacion
            double resultado;
            if (opcionOperacionNum == 1) {
                resultado = shape.getArea();
            } else {
                resultado = shape.getPerimeter();
            }

            System.out.println("Resultado -> "+operacion+" = "+resultado);
            System.out.println("_______________________________________");
            scanner.nextLine();
        }
    }
}