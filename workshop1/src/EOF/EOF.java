package EOF;
import java.util.Scanner;
/**
 *
 * @author 2152805
 */
public class EOF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linea=0;
        while (scan.hasNext()){
            linea++;
            String line=scan.nextLine();
            System.out.println(String.valueOf(linea)+" "+line);
            
        }
        scan.close();
        return;
    }
}
