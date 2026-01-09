abstract class Animal {
    //instance variables
    String name, color;
    double weight;
    //constructor
    Animal(){

    }

    Animal(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    //concrete method
    public void eat(){
        System.out.println("Animal is eating");
    }
}




public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
