//abstract class Shape {
//    public abstract double area();
//}
//
//class Circle extends Shape {
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double area() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class Rectangle extends Shape {
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double area() {
//        return width * height;
//    }
//}
//
//class Triangle extends Shape {
//    private double base;
//    private double height;
//
//    public Triangle(double base, double height) {
//        this.base = base;
//        this.height = height;
//    }
//
//    @Override
//    public double area() {
//        return 0.5 * base * height;
//    }
//}
//
//public class hw14 {
//    public static void main(String[] args) {
//        Circle circle = new Circle(5);
//        System.out.println("Площа кола: " + circle.area());
//
//        Rectangle rectangle = new Rectangle(4, 6);
//        System.out.println("Площа прямокутника: " + rectangle.area());
//
//        Triangle triangle = new Triangle(3, 4);
//        System.out.println("Площа трикутника: " + triangle.area());
//    }
//}
interface Animal {
    String makeSound();
    String eat();
}

class Dog implements Animal {
    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String eat() {
        return "Dog food";
    }
}

class Cat implements Animal {
    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String eat() {
        return "Cat food";
    }
}

class Bird implements Animal {
    @Override
    public String makeSound() {
        return "Chirp!";
    }

    @Override
    public String eat() {
        return "Bird seed";
    }
}

public class hw14 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Звук собаки: " + dog.makeSound());
        System.out.println("Тип їжі собаки: " + dog.eat());

        Cat cat = new Cat();
        System.out.println("Звук кота: " + cat.makeSound());
        System.out.println("Тип їжі кота: " + cat.eat());

        Bird bird = new Bird();
        System.out.println("Звук птаха: " + bird.makeSound());
        System.out.println("Тип їжі птаха: " + bird.eat());
    }
}
