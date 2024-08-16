import java.util.Locale;
import java.util.Scanner;

public class Programinha {
   public static void main(String[] args){
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      Retangulo a = new Retangulo();
      
      System.out.println("Digite a altura do retangulo: ");
      a.altura = sc.nextDouble();
      
      System.out.println("Digite a largura desse retangulo: ");
      a.largura = sc.nextDouble();
      
      double area = a.calcularArea();
      double perimetro = a.calcularPerimetro();
      double diagonal = a.calcularDiagonal();
      
      System.out.printf("A area desse retangulo eh: %.2f%n", area);
      System.out.printf("O perimetro desse retangulo eh: %.2f%n", perimetro);
      System.out.printf("A diagonal desse retangulo eh: %.2f%n", diagonal);
   }
}