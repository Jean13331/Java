import java.util.Scanner;
public class SomadeMatriz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [][] mat = new int [6][6];
        int soma = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[i][j] = sc.nextInt();
                //System.out.print(" "+ mat[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < mat.length; j++){
                soma += mat[i][j];
            }
        }
        System.out.println(soma);
    }
}