package org.example;

public class Rectangle {
    private double width;
    private double height;

    // Безаргументный конструктор
    public Rectangle() {
        this.width = -1;
        this.height = -1;
    }

    // Конструктор с параметрами
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Метод для получения площади
    public double getArea() {
        return width * height;
    }

    // Метод для получения периметра
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Геттеры (дополнительно, для лучшей практики)
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}