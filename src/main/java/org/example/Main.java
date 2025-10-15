package org.example;
public class Main {
    public static void main(String[] args) {
        // Создание объектов Circle
        Circle circle1 = new Circle(5.0, "red", true);
        Circle circle2 = new Circle(3.5);

        // Создание объектов Rectangle
        Rectangle rect1 = new Rectangle(4.0, 40.0, "blue", false);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        // Вывод информации о кругах
        System.out.println("=== Circle Objects ===");
        printShapeInfo(circle1);
        printShapeInfo(circle2);

        // Вывод информации о прямоугольниках
        System.out.println("\n=== Rectangle Objects ===");
        printShapeInfo(rect1);
        printShapeInfo(rect2);
    }

    public static void printShapeInfo(GeometricObject shape) {
        System.out.println(shape.toString());

        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.printf("Area: %.2f, Perimeter: %.2f, Diameter: %.2f\n",
                    circle.getArea(), circle.getPerimeter(), circle.getDiameter());
        } else if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            System.out.printf("Area: %.2f, Perimeter: %.2f\n",
                    rect.getArea(), rect.getPerimeter());
        }
        System.out.println();
    }
}