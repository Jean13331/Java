public class Fibonacci{
    public static int sequenciaFibonacci(int [] vet){
        System.out.println("posiçao | sequencia");
        for(int i = 0; i < 2; i++){
            vet[1] = 1;
            vet[2] = 1;
            System.out.println("   "+i+ "    | " + vet[i]);
        }
       
        for(int i = 2; i < vet.length; i++){
            vet[i] = vet[i - 1] + vet[i - 2];
            System.out.println("   "+i+ "    | " + vet[i]);
        }
        return 0;
    }
    public static void main(String [] args){
        int [] vet = new int [10];
        
        sequenciaFibonacci(vet);
    }
}