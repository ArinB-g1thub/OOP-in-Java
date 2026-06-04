class Model{
    int modelNumber; //reference variable
    String modelName;
    Model(){
    }
    Model(int num, String name){ //constructor
        System.out.println("Model Number: "+num+" Name: " +name);
    }
    void insertRecord(int num, String name){ //method
        this.modelNumber = num;
        this.modelName = name;
    }
    void display(){
        System.out.println("Car Model Number: " + modelNumber);
        System.out.println("Car Model Name: " + modelName);

    }
}
public class Car{
    public static void main(String[] args) {
        Model m1 = new Model();
        m1.modelNumber = 10001111; //Object initialization by reference variable
        m1.modelName = "Audi";
        m1.display();

        Model m2 = new Model();
        m2.insertRecord(num: 100001111, name: "BMW"); // by method
        m2.display();

        Model m3 = new Model(num:10000 , name: "Mercedes")
    }
}