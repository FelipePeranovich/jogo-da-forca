package jogoforca;

 

import java.util.Random;
import java.util.Scanner;

 /**
*
* @author Felipe Gomes Peranovich 
*/

public class jogoforca {
    
 
    
    public static void main(String[] args) {
        //possui 20 palavras aleatórias
        //Exibir letras já usada
        //marcar todas as letras iguais
        Scanner teclado = new Scanner(System.in);
        boolean jogar = true;
        int tentativa = 0;
        String[] plvr ={"caneta","caderno","escopeta","telefone","carro","bicicleta","computador","mesa","cadeira","copo","caneca","garfo","geladeira","forno","livro","espelho","tesoura","garrafa","prato","brinquedo"};
        Random gerador = new Random();
        int i = gerador.nextInt(20);        
        String palavra = plvr[i].toLowerCase();
        int acertos = 0;
        char[] palavraescondida = new char[palavra.length()];
        String letrasusadas = "";
        for (int j = 0; j < palavra.length(); j++) {
        palavraescondida[j] = '*';           
       }
        System.out.println("JOGO DA FORCA!");
        System.out.println("TEMA: OBJETOS");
            System.out.println("____");
            System.out.println("|  |");
            System.out.println("|  ");
            System.out.println("| ");
            System.out.println("| ");
            System.out.println("|");
            
            while(jogar == true ){
                
                for (int j = 0; j < palavra.length(); j++) {
                    System.out.print(palavraescondida[j]);
                }
                
                System.out.println("");
                System.out.println("Digite uma letra:");
                
                char letra = teclado.next().toLowerCase().charAt(0);
                
                //verifica os acertos
                boolean certo = false;
                for (int j = 0; j < palavra.length();j++) {

                    if (palavra.charAt(j)== letra) {
                        palavraescondida[j] = letra;
                        acertos++;
                        certo = true;
                    }                   
                }
                //verifica os erros
                if (certo == false){
                        System.out.println("LETRA NAO ENCONTRADA");                                      
                        letrasusadas = letrasusadas + " " + letra;
                        System.out.println("letras ja utilizadas:" + letrasusadas);                   
                        tentativa++;    
                    }
                
                switch(tentativa){
                    case 0:
                System.out.println("____");
                System.out.println("|  |");
                System.out.println("|  ");
                System.out.println("| ");
                System.out.println("| ");
                System.out.println("|");
                break;
                    case 1:
                System.out.println("____");
                System.out.println("|  |");
                System.out.println("|  O");
                System.out.println("| ");
                System.out.println("| ");
                System.out.println("|");
                break;
                    case 2:
                System.out.println("____");
                System.out.println("|  |");
                System.out.println("|  O");
                System.out.println("|  |");
                System.out.println("| ");
                System.out.println("|");
                break;
                    case 3:
                System.out.println("____");
                System.out.println("|  |");
                System.out.println("|  O");
                System.out.println("|  |\\");
                System.out.println("| ");
                System.out.println("|");
                break;
                    case 4:
                System.out.println("____");
                System.out.println("|  |");
                System.out.println("|  O");
                System.out.println("| /|\\");
                System.out.println("| ");
                System.out.println("|");        
                break;
                    case 5:
                System.out.println("____");
                System.out.println("|  |");
                System.out.println("|  O");
                System.out.println("| /|\\");
                System.out.println("| / ");
                System.out.println("|");
                break;
                    case 6:
                System.out.println("VOCÊ PERDEU!");       
                System.out.println("____");
                System.out.println("|  |");
                System.out.println("|  O");
                System.out.println("| /|\\");
                System.out.println("| / \\");
                System.out.println("|");
                System.out.println("A PALAVRA ERA: "+ palavra);
                jogar = false;

                }


                //Verifica se a palavra foi descoberta
                if (acertos == palavra.length()) {
                        for (int j = 0; j < palavra.length(); j++) {
                    System.out.print(palavraescondida[j]);
                }
                        System.out.println("");
                        System.out.println("PARABÉNS! A PALAVRA FOI DESCOBERTA");
                        jogar = false;
                    }
            }
                   
        
    }
  }