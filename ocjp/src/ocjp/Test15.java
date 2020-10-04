package ocjp;

	
	 
	enum ShapeType {
	    CIRCLE, SQUARE, RECTANGLE;
	}
	 
	abstract class Shape {
	    private ShapeType type = ShapeType.SQUARE; //default ShapeType
	 
	    Shape(ShapeType type) {
	        this.type = type;
	    }
	 
	    public ShapeType getType() {
	        return type;
	    }
	 
	    abstract void draw();
	}
	 
	public class Test15 {
	    public static void main(String[] args) {
	        Shape shape = new Shape(ShapeType.RECTANGLE) {
	            @Override
	            void draw() {
	                System.out.println("Drawing a " + getType());
	            }
	        };
	        shape.draw();
	    }
	}

/*
 * At the time of creating the instance of anonymous inner class, new Shape() is
 * used, which means it is looking for a no-argument constructor in anonymous
 * inner class code, which would invoke the no-argument constructor of super
 * class, Shape.
 * 
 * But as parameterized constructor is specified in Shape class, so no-argument
 * constructor is not provided by the compiler and hence compilation error.
 * 
 * 
 * 
 * To correct the compilation error pass the enum constant while instantiating
 * anonymous inner class.
 * 
 * Shape shape = new Shape(ShapeType.CIRCLE) {...}; or you can even pass null:
 * Shape shape = new Shape(null) {...}; OR provide the no-argument constructor
 * in the Shape class: Shape(){}
 * 
 */