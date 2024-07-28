package laços.enquanto;
import java.util.Scanner;
/*
======= Soma de Números Positivos ============ 
    Escreva um programa que peça ao usuário digitar números positivos. O programa deve continuar pedindo números até que o usuário digite o número 0. Quando o número 0 for digitado, o programa deve exibir a soma de todos estes programa soma números
*/
public class exer2 {

    public static void main(String[] args) {
        
        //Um objeto "Scanner" é criado para ler a entrada do usuário
        Scanner porta = new Scanner(System.in); 
        
        int soma = 0; //Inicializa a variável "soma" para armazenar a soma dos número fornecidos. 

        int numero; //A variável número é declarada para armazena cada número fornecido pelo usuário.


        System.out.println("Digite números para somar. Digite um número negativo para encerar o programa. ");

        //Laço while que continua enquanto o número fornecido for negativo. 

        while(true){//Este laço com 'while'(true). Cria um laço infinito. Dentro dele, usamos uma condição "if" para verificar se o número é igual a zero e, se for, usamos 'brak' para sair do laço. 

            //O usuário é solicitado a digitar um número.Se o número for negativo, o laço termina com 'break'. 
            System.out.print("Digite um número: "); 
            
            numero = porta.nextInt(); 

            //Se o número for negativo, sai do laço
            if(numero == 0){
                break;
            }

            //Adiciona número a soma
            soma += numero;//Se o número não negativo, ele é adicionado à variavel "soma". 
        }

       //Se o laço terminar, a soma total dos números é exibida
        System.out.println("A soma total é: " + soma);
        porta.close();
    }
}
