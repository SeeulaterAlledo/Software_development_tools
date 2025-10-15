package org.example;

public class Circle extends GeometricObject {
    private double radius;

    // Конструктор по умолчанию
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Конструктор с радиусом
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Конструктор с полными параметрами
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Геттеры и сеттеры
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод для получения площади
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Метод для получения периметра
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Метод для получения диаметра
    public double getDiameter() {
        return 2 * radius;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Круг{" +
                "радиус=" + radius +
                ", цвет='" + getColor() + '\'' +
                ", заливка=" + isFilled() +
                ", датаСоздания=" + getDateCreated() +
                '}';
    }
}