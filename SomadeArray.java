public class SomadeArray{
    public static void main(String [] args){
        int [] vet = new int [5];
        int soma = 0;

        for(int i = 0; i < vet.length;i++){
            vet[i] = (int)(Math.random()*11);
            System.out.println(vet[i]);
        }
        System.out.println();
        for(int i = 0; i < vet.length;i++){
            soma += vet[i];
        }
        System.out.println();
        System.out.println(soma);
    }
}