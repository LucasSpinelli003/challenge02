package br.com.fiap.challenge.model;

import javax.swing.*;

public class LocalChamado {
    private String endereco;
    private String pontoDeReferencia;

    public LocalChamado(String endereco, String pontoDeReferencia) {
        this.endereco = endereco;
        this.pontoDeReferencia = pontoDeReferencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }

    public void pegaLocalChamado(){
        endereco = JOptionPane.showInputDialog("Digite o endereço para irmos até você: ");
        pontoDeReferencia = JOptionPane.showInputDialog("Ponto de referência");
    }
    public void exibeLocalChamado(){
        System.out.println("Endereco: " + endereco);
        System.out.println("Ponto de referencia: " + pontoDeReferencia);
    }

}
