abstract class Shape {

    public abstract double surface_area();
    
    public abstract double volume();

    public static void main (String[] args) {

        //Creating an instance of the ShapeArray class and calling the printShapes method to print the surface area and volume of each shape in the array
        ShapeArray shapes = new ShapeArray();
        shapes.printShapes();

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

//Part III creating a class for Cone that extends the shape class
class Cone extends Shape {
    double radius;
    double height;
    //Constructors
    public Cone() {
        this.radius = 2.0;
        this.height = 3.0;
    }
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    //Overriding the surface area and volume methods
    @Override
    public double surface_area() {
        double area;
        area = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2.0) + Math.pow(radius, 2.0)));
        return area;
    }
    @Override
    public double volume() {
        double volume;
        volume = Math.PI * Math.pow(radius, 2.0) * height / 3.0;
        return volume;
    }

    //Printing the surface area and volume of the cone
    public String toString() { 
        return "The Cone surface area is: " + surface_area() + " and the volume is: " + volume();       
    }
}

//Part IV creating a class ShapeArray that contains an array of shape objects and a method to print the surface area and volume of each shape in the array
class ShapeArray {
    //Array of shape objects
    Shape[] shapeArray = new Shape[3];
    //Instatiate the array with 3 objects of each class
    Sphere ball = new Sphere(5.0);
    Cylinder can = new Cylinder(2.0, 3.0);
    Cone funnel = new Cone(2.0, 3.0);

    //Constructor
    public ShapeArray() {
        this.shapeArray = new Shape[3];
        this.shapeArray[0] = this.ball;
        this.shapeArray[1] = this.can;
        this.shapeArray[2] = this.funnel;
    }


    //Method to print the surface area and volume of each shape in the array
    public void printShapes() {
        for (Shape shape : shapeArray) {        //For each shape in the array, print the surface area and volume using the toString method
            System.out.println(shape.toString());
        }
    }
}