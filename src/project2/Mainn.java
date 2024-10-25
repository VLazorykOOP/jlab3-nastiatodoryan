package project2;

class mypoint {
    public double x, y, z;

    public mypoint (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
abstract class Body {
    public abstract double calculateSurfaceArea();
    public abstract double calculateVolume();
}

class Parallelepiped extends Body {
    double width, height, depth;

    Parallelepiped(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * (width * height + height * depth + depth * width);
    }

    @Override
    public double calculateVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Паралелепiпед: Ширина=" + width + ", Висота=" + height + ", Глибина=" + depth;
    }
}

class Ball extends Body {
    double radius;

    Ball(double r) {
        radius = r;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Куля: Радiус=" + radius;
    }
}

public class Mainn {
    public static void main(String[] args) {
        Parallelepiped p = new Parallelepiped(3, 4, 5);
        Ball b = new Ball(2.5);

        System.out.println(p);
        System.out.println("Площа поверхнi: " + p.calculateSurfaceArea());
        System.out.println("Об'єм: " + p.calculateVolume());

        System.out.println(b);
        System.out.println("Площа поверхнi: " + b.calculateSurfaceArea());
        System.out.println("Об'єм: " + b.calculateVolume());
    }

}


