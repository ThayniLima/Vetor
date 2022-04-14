import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int v[] = {0};


    int N,cont, idx;
    int vetor[];
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor de N:");

    N = ler.nextInt();

    vetor = new int[N];
    
    idx=0;
    cont=1;
    while(cont <=N){
      System.out.print("digite o "+cont+"° numero:");
      vetor[idx] = ler.nextInt();
      cont = cont + 1;
      idx=idx + 1;


    }

  }

}
  


