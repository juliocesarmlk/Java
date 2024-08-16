public class Retangulo{
   //Atributos
   public double altura;
   public double largura;
   
   //Método para calcular a área
   public double calcularArea(){
      return altura * largura;
   }
   
   //Método para calcular o perímetro
   public double calcularPerimetro(){
      return altura * 2 + largura * 2;
   }
   
   //Método para calcular a diagonal
   public double calcularDiagonal(){
      return Math.sqrt(altura * altura + largura * largura);
   }
}