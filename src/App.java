abstract class Animal {
    //instance variables
    String name, color;
    double weight;
    //constructor
    Animal(){

    }

    Animal(String name, String color){
       this(name,color,0.0);   
    }

    Animal(String name, String color, double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    //concrete method
    public void eat(){
        System.out.println(name + " is eating");
    }

    //abstract method
    public abstract void makeSound();
}

class Bird extends Animal {
    //constructor
    Bird(){
       name= "Bird";
    }

    //implementing abstract method
    public void makeSound(){
        System.out.println("Chirp Chirp");
    }
}

class Tiger extends Animal {
    //constructor
    Tiger(){
       name= "Tiger";
    }

    //implementing abstract method
    public void makeSound(){
        System.out.println(name+ ": Roar Roar");
    }
}




public class App {
    public static void main(String[] args) throws Exception {
        
        Animal myBird = new Bird();
        Animal myTiger = new Tiger();
        myBird.eat();
        myBird.makeSound();
        myTiger.eat();
        myTiger.makeSound();
    }
}
