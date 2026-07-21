public class ErrorExample{
    public static void crashMe(){
        crashMe();
    }
    public static void main(String[] args){
     try{
        crashMe();
     } catch(Exception e){
        System.out.println("This will not catch the error.");
     }
    }
}