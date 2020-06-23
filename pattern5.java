// pattern5
// * * * * *
//   * * * * 
//     * * *
//       * *
//         *
import java.util.*;
class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0;
        int st = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=st; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
            st--;
            sp++;
        }
    }
}