import java.util.Scanner;

public class Ch02 {
    public static void main(String[] args) throws Exception {
        
        for(int i=1; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i + "x" + j + "=" + i*j);
                System.out.print("\t");
            }
            System.out.println();


        }
    }
}
