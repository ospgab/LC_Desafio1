/*
Escreva um algoritmo que receba um parâmetro String.

    Verificar se há 3 letras "X" em sequência entre dois números que somam 8.

Exemplo: frdts2XXX6xxbl2XXXeee5

Retorna true pois a String possui a combinação "2XXX6" (Sequencia de 3 "X" entre os
números 6 e 2 que somam 8).

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a string de entrada: ");
        String entrada = sc.nextLine();

        int criterioParada = 0;
        int parada = 0;
        char X = 'X';
        char x = 'x';


        for(int contador = 0; contador < (entrada.length()-1); contador++){
            char compara = entrada.charAt(contador);
            if(compara == X || compara == x){
                criterioParada++;

                if(criterioParada==3){
                    String anterior = String.valueOf(entrada.charAt(contador-3));
                    String proximo = String.valueOf(entrada.charAt(contador+1));
                    Integer a = Integer.parseInt(anterior);
                    Integer b = Integer.parseInt(proximo);

                    if(a+b == 8){
                        parada++;

                    } else {
                        criterioParada = 0;
                    }
                }
            }
        }

        if(parada > 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}