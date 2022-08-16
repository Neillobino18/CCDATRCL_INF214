import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       
       Queue<String> nikereservation = new LinkedList<>();
       nikereservation.add("John");
       nikereservation.add("David");
       nikereservation.add("Gab");
       nikereservation.add("Bugoy");
       nikereservation.add("kevin");

       System.out.println("The queue is: " + nikereservation);
       nikereservation.remove();

       System.out.println("The queue is: " + nikereservation);
       
    }
}



        
    
