import java.util.Scanner;

public class Main{
   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      Jogador jg = new Jogador();
      
      System.out.println("Digite o nome do Jogador: ");
      jg.nome = sc.nextLine();
      
      System.out.println("Digite agora a idade desse jogador: ");
      jg.idade = sc.nextInt();
      sc.nextLine();
      
      System.out.println("Digite agora a posicao desse jogador: GK, CB, LB,RB, CDM, CM, CAM, RW, LW, CF");
      jg.posicao = sc.nextLine();
      
      System.out.println("Digite agora o numero da camisa desse jogador: ");
      jg.numeroCamisa = sc.nextInt();
      
      System.out.println("O jogador " + jg.nome + " Tem " + jg.idade + " anos, joga como " + jg.posicao + " e usa a camisa numero " + jg.numeroCamisa);
   } 
}