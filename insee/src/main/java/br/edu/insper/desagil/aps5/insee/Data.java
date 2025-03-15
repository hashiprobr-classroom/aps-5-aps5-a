package br.edu.insper.desagil.aps5.insee;

import java.util.HashMap;
import java.util.Map;

public class Data extends Referencia {

    private int dia;
    private int mes;
    private int ano;
    private Map<Integer, Integer> limites;

    public Data() {

        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
        this.limites = new HashMap<>();


        limites.put(1, 31);
        limites.put(2, 28);
        limites.put(3, 31);
        limites.put(4, 30);
        limites.put(5, 31);
        limites.put(6, 30);
        limites.put(7, 31);
        limites.put(8, 31);
        limites.put(9, 30);
        limites.put(10, 31);
        limites.put(11, 30);
        limites.put(12, 31);

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void atualiza(int dia, int mes, int ano) {

        if (dia < 1) {
            dia = 1;
        } else if (dia > limites.get(mes)) {
            dia = limites.get(mes);
        }

        if (mes < 1) {
            mes = 1;
        } else if (mes > 12) {
            mes = 12;
        }

        if (ano < 1970) {
            ano = 1970;
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    @Override
    public int comoInteiro() {

        int somaDias = 0;
        int diasDesde1970 = (ano - 1970) * 365;

        for (int i = 1; i < mes; i++) {
            somaDias += limites.get(i);
        }

        return somaDias + diasDesde1970 + (dia - 1);
    }
}