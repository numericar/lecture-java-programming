package L12_inheritance;

class Circle {
    public double radius;
    
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double circumference() {
        return this.perimeter();
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return this.area() * this.height;
    }
}
