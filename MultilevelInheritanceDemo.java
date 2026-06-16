// Parent class
class Animal{
    void eat(){
        System.out.println("Animal is eating. ");
    }
}
// Child class
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking. ");
    }
}
// Grandchild class
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping. ");
    }
}

// Main class
public class MultilevelInheritanceDemo{
    public static void main(String[] args){
        Puppy p = new Puppy();
        p.eat();    // inherited from Animal
        p.bark();   // Inherited from Dog
        p.weep();   // Defined in Puppy
    
    }
}