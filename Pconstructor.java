class Parameterized{
    int id;
    String name;

    Parameterized (int id, String name){
    this.id = id;
    this.name = name;
    }
    void display(){
        System.out.println("ID: " + id +"Name: " + name);
    }
}
public class Pconstructor{

    public static void main(String[] args){
        Parameterized p1 = new Parameterized(100,"Arin");
        p1.display();
    }
}