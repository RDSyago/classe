package app;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(nome: "Matheus", idade: 23,)

    }
    
    public static void imprimirMenu(){
        System.out.println(x: "Menu de acesso");
        System.out.println(x: "1. Mostrar dados da pessa");
        System.out.println(x: "2. Alterar nome");
        System.out.println(x: "3. alterar idade");
        System.out.println(x: "4. alterar altura");
        System.out.println(x: "5. Mostar saudação");
        System.out.println(x: "0. sair");
        System.out.print(s: "escolha uma opção ");

        public static int receberOp(Scanner sc){
            int op;
            try {
                op = Integer.parseInt(sc.nextLine());  
            } catch ( NumberFormatException e ){
                System.out.println(x: "Digite uma opção vál:")
                op = -1; 
            }
        }
        return op;

    }









}