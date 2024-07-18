package Elevador_ATV;

public class Elevador {
    int cap_max = 10;
    int cap_atual;
    int andar_atual;
    int andar_min = 0;
    int andar_max = 7;

    //Declarar valores:
    //cap_max = 10;
    //andar_min = 0;
    //andar_max = 7;

    public String Subir(int n){
        if (andar_atual + n > andar_max){
            return("O Elevador não pode subir mais!");
        }
        andar_atual =  andar_atual + n;
        return("O Elevador subiu para o andar  " + andar_atual);
    }

    public String Descer(int n){
        if (andar_atual - n > andar_min){
            return("O Elevador não pode descer mais!");
        }
        andar_atual =  andar_atual - n;
        return("O Elevador subiu para o andar  " + andar_atual);
    }

    public String Entrar(int n){
        if (cap_atual + n > cap_max){
            return("Não há espaço suficiente para todas as pessoas.");
        }
        cap_atual = cap_atual + n;
        return(n + " Pessoa(s) entrou(aram) no elevador, Capacidade atual: " + cap_atual);
    }

    public String Sair(int n){
        if (cap_atual - n < 0){
            return("Não há pessoas suficientes no elevador.");
        }
        cap_atual = cap_atual - n;
        return(n + " Pessoa(s) saiu(íram) no elevador, Capacidade atual: " + cap_atual);
    }

}
