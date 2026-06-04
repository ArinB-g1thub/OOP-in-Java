class Student1 {
    int id;
    String name;
}
public class TestStudent {
    public static void main(String[] args) {
        Student1 std = new Student1();
        std.id = 100;
        std.name = "Arin";
        System.out.println(std.id);
        System.out.print(std.name);
    
    }
}
