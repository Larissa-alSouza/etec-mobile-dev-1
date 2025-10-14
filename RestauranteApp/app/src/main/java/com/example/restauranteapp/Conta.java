package com.example.restauranteapp;
import java.io.Serializable;


public class Conta implements Serializable {

    private int Nmesa;
    private double Vconsumido;
    private int QtdPessoas;

    public Conta() {
        this.Nmesa = 0;        
        this.Vconsumido = 0.0;   
        this.QtdPessoas = 0;  
    }

    public Conta(int Nmesa, double Vconsumido, int QtdPessoas){

        this.Nmesa = Nmesa;
        this.Vconsumido = Vconsumido;
        this.QtdPessoas = QtdPessoas;
    }

    public int getNmesa() {
        return Nmesa;
    }

    public void setNmesa(int nmesa) {
        Nmesa = nmesa;
    }

    public double getVconsumido() {
        return Vconsumido;
    }

    public void setVconsumido(double vconsumido) {
        Vconsumido = vconsumido;
    }

    public int getQtdPessoas() {
        return QtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        QtdPessoas = qtdPessoas;
    }
}

