class Shape {
    String color;
    public Shape(String color) {
        this.color = color;
    }
}

// simple inheritance
class Triangle extends Shape {
    int height;
    int base;

    public Triangle(int height, int base, String color) { 
        super(color);
        this.height = height;
        this.base = base;
    }

    public float Area() {
        return  (float)1 / 2 * this.height * this.base;
    }
}

// multi level inheritance
class Equilateral extends Triangle {
    int side;
    
    public Equilateral(int side, int height, int base, String color) {
        super(height, base, color);
        this.side = side;
    }
}

// heirarchical inheritance and hybrid inheritance
class Square extends Shape {
    int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public int Area() {
        return (int)Math.pow(side, 2);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4 , 2, "red");
        float t1Area = t1.Area();
        System.out.println("Area: " + t1Area);
        Equilateral e1 = new Equilateral(3, 4, 2, "pink");
        float e1Area = e1.Area();
        System.out.println("Area: " + e1Area);
        Square s1 = new Square(5, "black");
        int s1Area = s1.Area();
        System.out.println("Area: " + s1Area);
    }
}
