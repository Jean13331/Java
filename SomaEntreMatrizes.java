public class SomaEntreMatrizes{
    public static void main(String[] args){
        int [][] mat = new int [6][6];
        int [][] matA = new int [6][6];
        int [][] soma = new int [6][6];

        System.out.println("Primeira Matriz");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[i][j] = (int)(Math.random()*10);
                System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }
        System.out.println("Segunda Matriz");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                matA[i][j] = (int)(Math.random()*10);
                System.out.print(" "+matA[i][j]);
            }
            System.out.println();
        }
        System.out.println("Resultado");

        for(int i = 0;i < mat.length; i++){
            for(int j = 0;j < mat.length; j++){
                soma[i][j] = mat[i][j]+matA[i][j];
                System.out.print(" "+soma[i][j]);
            }
            System.out.println();
        }
    }
}