public class Claculadora{
   
   public static double calcularPercentual(double percentual, double valor){
      return (percentual / 100) * valor;
   }
   
   public static double calcularRegraDeTres(double valor1, double valor2, double referencia){
      return (valor2 * referencia) / valor1;
   }
}