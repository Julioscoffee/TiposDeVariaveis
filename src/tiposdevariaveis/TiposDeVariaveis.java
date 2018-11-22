package tiposdevariaveis;

import java.util.Scanner;

public class TiposDeVariaveis {

    public static void main(String[] args) {
        byte idade = 23;
        int rg = 1195661341;
        float salario = 600.00f;
        double decimoTerceiro = 450.50;
        String nome = "Víctor Romário";
        char inicial = 'V';
        
        //Entrevista
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomePessoa = ler.nextLine();
        System.out.println("Informe a sua idade: ");
        int idadePessoa = ler.nextInt();
        System.out.println("Informe o seu salário: ");
        float salarioPessoa = ler.nextFloat();
        System.out.println(nomePessoa + " tem " + idadePessoa + " anos e ganha " + salarioPessoa);
        
    }
    
}
