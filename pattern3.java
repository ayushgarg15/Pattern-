// pattern3
// * * * * * 
// * * * *
// * * *
// * *
// *
import java.util.*; 
public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=st; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
            st--;
        }
    }
}