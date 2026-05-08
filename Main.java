package Jogo;
import java.util.ArrayList;
import java.util.List;

// Método principal para testar a classe
  public class Main {    
       public static void main(String[] args) {
        // Instanciando o primeiro personagem
        Mago gandalf = new Mago("Gandalf", 10, 5, 100, 12.5);
        // Instanciando o segundo personagem
        Guerreiro thorus = new Guerreiro("Thorus", 9, 7, 120, 15.0);
      
        // Exibindo status dos personagens
        gandalf.exibirStatus();
        thorus.exibirStatus();

        //Usando Habilidades especiais
        thorus.usarHabilidadeEspecial();
        gandalf.usarHabilidadeEspecial();

        System.out.println("\n---Demonstraçao de Polimorfismo ---");
        List<Personagem> herois = new ArrayList<>();
        herois.add(gandalf);
        herois.add(thorus);
       
        herois.add(new Guerreiro("Borin", 11, 120, 10.0, 6.0));
            
        
        for(Personagem p : herois) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println("-------------------------");
        }
    }   
}
