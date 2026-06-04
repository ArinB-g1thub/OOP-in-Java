class Geeks{
    String name;
    int id;

    Geeks (String name, int id){
        this.name = name;
        this.id = id;
    }
    // Copy constructor
    Geeks (Geeks obj) {
        this.name = obj.name;
        this.id = obj.id;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Geeks geek1 = new Geeks("GeeksforGeeks",1); // Copy constructor
        System.out.println("Name: " + geek1.name + ", ID: " + geek1.id);

        Geeks geek2 = new Geeks(geek1);
        System.out.println("2nd Name: " + geek2.name + " , 2nd ID: " + geek2.id);
    }
}