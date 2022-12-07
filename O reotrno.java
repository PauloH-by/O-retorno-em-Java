//Exercício 1

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    
     int valor;

     System.out.println("Informe um valor: ");
     valor = scan.nextInt();

      if (valor < 0) {
        System.out.println("O valor " + valor + " é negativo.");
      }
      else if (valor > 0) {
        System.out.println("O valor " + valor + " é positivo");
      }
      else {
        System.out.println("O valor " + valor + " é igual a 0");
      }
        
    }
     
  }

//Exercício 2
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);    
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int valor;

         for(int i = 0; i < 3; i++) {
            System.out.println("Informe um valor: ");
            valor = entrada.nextInt();

            numbers.add(valor);
         }   
        
         int maior = Collections.max(numbers);
         
         System.out.println("O maior numero informado é: " + maior);

 }     
}

//Exercício 3
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int valor1;
        int valor2; 
        int valor3;

        System.out.println("Digite o primeiro valor: ");
        valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = scan.nextInt();

        System.out.println("Digite o terceiro valor: ");
        valor3 = scan.nextInt();


        

         if(valor1 < valor2 && valor1 < valor3) {
            System.out.println("A soma dos maiores numeros foi de: " + (valor2 + valor3));
         }
         else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println("A soma dos maiores numeros foi de: " + (valor1 + valor3));
         }
         else {
            System.out.println("A soma dos maiores numeros foi de: " + (valor1 + valor2));
         }
    }

}
//Exercício 4
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       
       int total = 0;
       
       for (int i = 0; i < 10; i++) {

           System.out.println("Digite um valor: ");
           int n1 = scan.nextInt();
           total += n1;
       }

       System.out.println("A média artimética desses 10 valores foi de: " + (total / 10));
           
}
}

//Exercício 5
import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    int n1, n2, n3, n4;
    int res;
    String name;

    System.out.println("Digite seu nome: ");
    name = scan.nextLine();

    System.out.println("Informe a primeira nota do aluno: ");
    n1 = scan.nextInt();
    Math.round(n1);

    System.out.println("Informe a segunda nota do aluno: ");
    n2 = scan.nextInt();
    

    System.out.println("Informe a terceira nota do aluno: ");
    n3 = scan.nextInt();
    

    System.out.println("Informe a quarta nota do aluno: ");
    n4 = scan.nextInt();
    
    res = (n1 + n2 + n3 + n4) / 4;
    
    if (res >= 6 && res <= 10) {
        System.out.println("Parabens aluno: " + name + " você foi aprovado com a média: " + res);
    }
    else if (res < 6 && res >= 0) {
        System.out.println("Infelizmente aluno: " + name + " não foi aprovado sua média foi: " + res);
    }
    else {
        System.out.println("Por favor somente valores de 1 a 10!");
    }

     
    }
}

    //6
    double nota = 0;
    int reprovado = 0;
    
    System.out.println("Escreva 2 notas:");
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 2; i++) {
    nota += scan.nextDouble();
    }
    
    double notaFinal = nota / 2;
    if (notaFinal < 6.5) {
    System.out.println("A média das notas é " + notaFinal + " - Aluno reprovado! Estude mais na próxima.");
    
    } else {
    System.out.println("A média das notas é " + notaFinal + " - Aluno aprovado! Parabéns!");
      reprovado += 1;
   
    }
    System.out.println("Deseja calcular outra média?");
    String resposta = scan.nextLine();
    
    if(resposta == "S"){
      System.out.println("Chegou");
      main();
    }else if(resposta == "N"){
      System.out.println("A quantidade de alinos reprovados é de " + reprovado);
      System.exit(0);
    }else{
      System.out.println("Digite um valor valor válido!");
    }