public class ArithmeticExceptionDemo{
    public static void main(String[] args){
        try{
            int totalScore = 500;
            int totalPlayers = 0;
            System.out.println("Calculating average score per player...");
            int averageScore = totalScore / totalPlayers;
            System.out.println("Average score: " + averageScore);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }finally{
            System.out.println("Execution completed.");
        }
    }
}