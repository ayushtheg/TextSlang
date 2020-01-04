import java.util.Scanner;
public class TextSlang {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("TextSlang - Ayush Gaur\n");
       //Output
       System.out.print("Enter a text slang term, TTFN to stop: ");
       String slang = sc.nextLine();
       //Converts to uppercase
       String upperSlang = slang.toUpperCase();
       //loops the switch-case
       while (!upperSlang.equals("TTFN")) {
           //cases
           switch (upperSlang) {
               case "BRB":
                System.out.println(upperSlang + " means Be Right Back");
                break;
               case "FOMO":
                System.out.println(upperSlang + " means Fear Of Missing Out");
                break;
               case "IDK":
                System.out.println(upperSlang + " means I Don't Know");
                break;
               case "IRL":
                System.out.println(upperSlang + " means In Real Life");
                break;
               case "JK":
                System.out.println(upperSlang + " means Just Kidding");
                break;
               case "J/K":
                System.out.println(upperSlang + " means Just Kidding");
                break;
               case "LOL":
                System.out.println(upperSlang + " means Laughing Out Loud");
                break;
               case "TTFN":
                System.out.println(upperSlang + " means Ta-Ta For Now");
                break;
               case "TTYL":
                System.out.println(upperSlang + " means Talk To You Later");
                break;
               case "YOLO":
                System.out.println(upperSlang + " means You Only Live Once");
                break;
                //default is i dont know
               default:
                System.out.println(upperSlang + " means aomething I don't know"); 
            }
            //repeats the output
            System.out.print("Enter a text slang term, TTFN to stop: ");
           slang = sc.nextLine();
           upperSlang = slang.toUpperCase();
       }
       //Goodbye phrase
       System.out.println(upperSlang + " means Ta-Ta For Now");
    }
}