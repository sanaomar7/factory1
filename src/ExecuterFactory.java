import java.util.Map;
import java.util.Scanner;

public class ExecuterFactory {
    public static void main(String[] args) {
        int i=0;

        int x = 0 ;
        do{
            Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter number- 1-2-3-4 ");
            int a = sc.nextInt();

            Connection connection = new Connection();


            x = connection.Counterpro()  ;

            System.out.println(x);
            if( x  < 3) {
                connection = ConnectionFactory.per(a);
                connection.pre();
            }
            else {
                System.out.println("Cannot create new protocol ");
                break;
            }
            i++;
        }while(i<=3);





    }
}
