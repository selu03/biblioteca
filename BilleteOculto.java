import java.util.Arrays;
import java.util.Random;


public class BilleteOculto {
    public static void main(String[] args) {
      String tabla[][]=new String[8][4];
      Random n= new Random();
      for(int i=0;i<8;i++) {
          for(int j=0;j<4;j++) {
             tabla[i][j]="-";
          }
      }
        tabla[n.nextInt(7)][n.nextInt(3)]="€";
        System.out.println(Arrays.toString(tabla[0]));        
        System.out.println(Arrays.toString(tabla[1]));
        System.out.println(Arrays.toString(tabla[2]));
        System.out.println(Arrays.toString(tabla[3]));
        System.out.println(Arrays.toString(tabla[4]));
        System.out.println(Arrays.toString(tabla[5]));
        System.out.println(Arrays.toString(tabla[6]));
        System.out.println(Arrays.toString(tabla[7]));
    }
}
   

