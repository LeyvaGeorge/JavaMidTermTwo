abstract class Shape {

    public abstract double surface_area();
    
    public abstract double volume();

    public static void main (String[] args) {

        //Creating a sphere object and printing the surface area and volume
        Sphere sphere1 = new Sphere();
        System.out.println(sphere1.toString());

        //Creating a cylinder object and printing the surface area and volume
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1.toString());

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

    //Overriding the surface area and volume methods
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

    //Printing the surface area and volume of the sphere
    public String toString() { 
        return "The Sphere surface area is: " + surface_area() + " and the volume is: " + volume();       
    }
}

//Part II creating a class for Cylinder that extends the shape class
class Cylinder extends Shape {
    double radius;
    double height;
    //Constructors
    public Cylinder() {
        this.radius = 2.0;
        this.height = 3.0;
    }
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    //Overriding the surface area and volume methods
    @Override
    public double surface_area() {
        double area;
        area = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2.0);
        return area;
    }
    @Override
    public double volume() {
        double volume;
        volume = Math.PI * Math.pow(radius, 2.0) * height;
        return volume;
    }

    //Printing the surface area and volume of the cylinder
    public String toString() { 
        return "The Cylinder surface area is: " + surface_area() + " and the volume is: " + volume();       
    }
}