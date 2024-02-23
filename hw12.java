// Задача 1:

import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Product> products;
    private String client;
    private String deliveryAddress;
    private boolean paymentStatus;

    public Order(String client, String deliveryAddress) {
        this.client = client;
        this.deliveryAddress = deliveryAddress;
        this.products = new ArrayList<>();
        this.paymentStatus = false;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void changePaymentStatus(boolean status) {
        this.paymentStatus = status;
    }

    // Додаткові методи для отримання інформації про замовлення
}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


}

// Задача 2:

abstract class GraphicObject {
    protected int x;
    protected int y;
    protected String color;

    public GraphicObject(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw();
    public abstract void resize(int width, int height);
}

class Rectangle extends GraphicObject {
    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {

    }

    @Override
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class Circle extends GraphicObject {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Логіка малювання кола
    }

    @Override
    public void resize(int width, int height) {
        this.radius = Math.min(width, height) / 2;
    }
}

class Line extends GraphicObject {
    private int endX;
    private int endY;

    public Line(int x, int y, String color, int endX, int endY) {
        super(x, y, color);
        this.endX = endX;
        this.endY = endY;
    }

    @Override
    public void draw() {
        // Логіка малювання лінії
    }

    @Override
    public void resize(int width, int height) {
        // Логіка зміни розмірів лінії
    }
}

public class hw12 {
    public static void main(String[] args) {
        // Приклад використання системи управління замовленнями
        Order order = new Order("John Doe", "123 Main St, City");
        Product product1 = new Product("Laptop", 999.99, 1);
        Product product2 = new Product("Mouse", 19.99, 2);
        order.addProduct(product1);
        order.addProduct(product2);
        order.changePaymentStatus(true);

        // Приклад використання графічного редактора
        List<GraphicObject> graphics = new ArrayList<>();
        graphics.add(new Rectangle(10, 20, "blue", 50, 30));
        graphics.add(new Circle(100, 150, "red", 25));
        graphics.add(new Line(30, 40, "green", 100, 200));

        for (GraphicObject graphic : graphics) {
            graphic.draw();
            graphic.resize(10, 10);
        }
    }
}

