package br.com.fiap.challenge.model;

import javax.swing.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Endereco {
    private String rua,complemento,cep;
    private int numero;

    public Endereco(String rua, int numero, String complemento, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void pegaEndereco (){
        rua = JOptionPane.showInputDialog("Digite o nome da sua rua: ");
        numero = parseInt(JOptionPane.showInputDialog("Digite o numero da sua rua: "));
        complemento = JOptionPane.showInputDialog("Complemento: ");
        cep = JOptionPane.showInputDialog("Digite o cep: ");
    }
    public void exibeEndereco (){
        System.out.println("Nome da rua.......:" + rua);
        System.out.println("Numero............:" + numero);
        System.out.println("Complemento.......:" + complemento);
        System.out.println("Cep...............:" + cep);


    }


}
