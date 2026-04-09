abstract class Shape {

    public abstract double surface_area();
    
    public abstract double volume();

    public static void main (String[] args) {
        Sphere sphere1 = new Sphere();
        System.out.println("Surface Area of Sphere with radius 5.0: " + sphere1.surface_area());
        System.out.println("Volume of Sphere with radius 5.0: " + sphere1.volume());

        Sphere sphere2 = new Sphere(3.0);
        System.out.println("Surface Area of Sphere with radius 3.0: " + sphere2.surface_area());
        System.out.println("Volume of Sphere with radius 3.0: " + sphere2.volume());
    }

}

//Part I creating a class Sphere that extends the shape class
class Sphere extends Shape {
    double radius;

    //Constructors
    public Sphere() {
        this.radius = 5.0;
    }
    public Sphere(double radius) {
        this.radius = radius;
    }

    public double surface_area() {
        double area;
        area = 4 * Math.PI * Math.pow(radius, 2.0);
        return area;
    }

    public double volume() {
        double volume;
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3.0);
        return volume;
    }
}
