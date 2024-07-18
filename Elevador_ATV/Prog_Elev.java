package Elevador_ATV;

import java.util.Scanner;

public class Prog_Elev {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Elevador elevador = new Elevador();
        String ordem = teclado.nextLine();

        //System.out.println("Digte a capacidade máxima do Elevador: ");
        //elevador.cap_max = teclado.nextInt();

        //System.out.println("Digte o maior andar: ");
        //elevador.andar_max = teclado.nextInt();

        //System.out.println("Digte a capacidade máxima do Elevador: ");
        //elevador.cap_max = teclado.nextInt();

        System.out.println("Digite a Ordem: ");
        ordem = teclado.nextLine();

        while (!ordem.equals("@")) {
            if (ordem.equalsIgnoreCase("S")){
                System.out.println("Para qual andar você deseja subir?");
                int subir = teclado.nextInt();
                elevador.Subir(subir);
            } else if (ordem.equalsIgnoreCase("D")) {
                System.out.println("Para qual andar você deseja descer?");
                int descer = teclado.nextInt();
                elevador.Descer(descer);
            } else if (ordem.equalsIgnoreCase("R")) {
                System.out.println("Quantas pessoas desejam sair?");
                int sair = teclado.nextInt();
                elevador.Sair(sair);
            } else {
                System.out.println("Quantas pessoas vão entrar?");
                int entrar = teclado.nextInt();
                elevador.Entrar(entrar);
            }
            teclado.nextLine();
            System.out.println("Digite Uma Ordem válida: ");
            ordem = teclado.nextLine();
        }

        teclado.close();

        //Prits finais 
        System.out.println(elevador.cap_atual);
        System.out.println(elevador.andar_atual);
    }
}
