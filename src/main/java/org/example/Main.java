package org.example;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("#.##");
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public static void main(String[] args) {
        // Создание объектов Circle
        Circle circle1 = new Circle(5.0, "красный", true);
        Circle circle2 = new Circle(3.5);

        // Создание объектов Rectangle
        Rectangle rect1 = new Rectangle(4.0, 40.0, "синий", false);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        // Вывод информации о кругах
        System.out.println("=== Объекты Круг ===");
        printShapeInfo(circle1);
        printShapeInfo(circle2);

        // Вывод информации о прямоугольниках
        System.out.println("\n=== Объекты Прямоугольник ===");
        printShapeInfo(rect1);
        printShapeInfo(rect2);
    }

    public static void printShapeInfo(GeometricObject shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.println("Круг {");
            System.out.println("  Радиус: " + circle.getRadius());
            System.out.println("  Цвет: " + circle.getColor());
            System.out.println("  Заливка: " + (circle.isFilled() ? "да" : "нет"));
            System.out.println("  Дата создания: " + dateFormat.format(circle.getDateCreated()));
            System.out.println("  Площадь: " + df.format(circle.getArea()));
            System.out.println("  Периметр: " + df.format(circle.getPerimeter()));
            System.out.println("  Диаметр: " + df.format(circle.getDiameter()));
            System.out.println("}");
        } else if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            System.out.println("Прямоугольник {");
            System.out.println("  Ширина: " + rect.getWidth());
            System.out.println("  Высота: " + rect.getHeight());
            System.out.println("  Цвет: " + rect.getColor());
            System.out.println("  Заливка: " + (rect.isFilled() ? "да" : "нет"));
            System.out.println("  Дата создания: " + dateFormat.format(rect.getDateCreated()));
            System.out.println("  Площадь: " + df.format(rect.getArea()));
            System.out.println("  Периметр: " + df.format(rect.getPerimeter()));
            System.out.println("}");
        }
        System.out.println();
    }
}