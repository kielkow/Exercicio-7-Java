package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
     
        int num1, num2;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        System.out.println("Digite o 1° numero:");
        num1 = input1.nextInt();
        
        System.out.println("Digite o 2° numero:");
        num2 = input2.nextInt();
        
        System.out.println("O maior numero é " + verificarMaior(num1, num2));
    }
    static int verificarMaior(int x, int y){
        if(x > y){
            return x;
        }
        return y;
    }
}
