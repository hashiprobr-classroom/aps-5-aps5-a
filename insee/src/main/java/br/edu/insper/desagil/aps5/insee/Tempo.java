package br.edu.insper.desagil.aps5.insee;

public class Tempo extends Referencia {

    private int minuto;
    private int hora;


    public Tempo() {
        this.minuto = 0;
        this.hora = 0;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

    public void atualiza(int minuto, int hora) {

        if (minuto < 0) {
            minuto = 0;
        } else if (minuto > 59) {
            minuto = 59;
        }

        if (hora < 0) {
            hora = 0;
        } else if (hora > 23) {
            hora = 23;
        }

        this.minuto = minuto;
        this.hora = hora;
    }

    @Override
    public int comoInteiro() {
        return minuto+ (hora * 60);
    }
}