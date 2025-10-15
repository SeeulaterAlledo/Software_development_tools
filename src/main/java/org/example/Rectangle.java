package org.example;
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    // Конструктор по умолчанию
    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    // Конструктор с шириной и высотой
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    // Конструктор с полными параметрами
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Геттеры и сеттеры
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
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

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Прямоугольник{" +
                "ширина=" + width +
                ", высота=" + height +
                ", цвет='" + getColor() + '\'' +
                ", заливка=" + isFilled() +
                ", датаСоздания=" + getDateCreated() +
                '}';
    }
}