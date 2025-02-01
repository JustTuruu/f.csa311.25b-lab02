package edu.cmu.cs.cs214.lab02;
import edu.cmu.cs.cs214.lab02.shapes.*;


public class Main {
    public static void main(final String[] args) {
        
        Shape shape = new Rectangle(7, 3);  
        Renderer renderer = new Renderer(shape);
        renderer.draw(); 
    }
}
