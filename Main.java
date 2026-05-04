  // Método principal para testar a classe
  public class Main {    
       public static void main(String[] args) {
        // Instanciando o primeiro personagem
        Personagem arqueiro = new Personagem("Legolas", "Arqueiro", 5, 100, 12.5);
      
        // Instanciando o segundo personagem
        Personagem guerreiro = new Personagem("Thorus", "Guerreiro", 7, 120, 15.0);
      
        // Exibindo status dos personagens
        arqueiro.exibirStatus();
        guerreiro.exibirStatus();
    }   
}
