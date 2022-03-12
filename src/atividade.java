package Metodos;


public class atividade {


    public static void main(String[] args) {

        String feminino, masculino;

        feminino = "maria;paula;olinda";
        mostrarItens(feminino, ";", "feminino");

        masculino = "pedro - joão - fernando - almir - jairo";
        mostrarItens(masculino, " - ", "masculino");
    }

    public static void mostrarItens(String s, String separador, String tipo) {
        String partes[];

        partes = s.split(separador);

        int i, n = partes.length;
        for(i=0; i<n; i++) {
            System.out.printf("%do. %s: %s\n", (i+1), tipo, partes[i]);
        }
        System.out.println();
    }

}