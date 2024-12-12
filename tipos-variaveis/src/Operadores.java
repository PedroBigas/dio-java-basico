public class Operadores {
    public static void main(String[] args) {
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (20 * 7) + (20 / 4);

        System.out.println(modulo);

        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultadoa = (a == b) ? "verdadeiro" : "false";

        System.out.println(valor);

        // ComparacaoAvancada.java
        int numero1 = 1;
        int numero2 = 1;

        if (numero1 == 2 & numero2++ == 2)
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);

        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2
        // )

    }

}
