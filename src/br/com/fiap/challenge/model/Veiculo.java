package br.com.fiap.challenge.model;

import javax.swing.*;

import static java.lang.Double.parseDouble;

public class Veiculo {
    private String modelo,tpCarroceria,mudancaNoVeiculo;
    private double peso,comprimento,altura,largura,pesoCarga;
    private int eixos;


    public void pegaDados(){
        modelo = JOptionPane.showInputDialog(null,"Digite o modelo do veiculo: ");
        tpCarroceria = JOptionPane.showInputDialog(null,"Digite o tipo da carroceria: ");
        mudancaNoVeiculo = JOptionPane.showInputDialog(null,"Houve alguma mudança no veículo? se sim qual?: ");
        peso = parseDouble(JOptionPane.showInputDialog("Digite o peso do veículo: "));
        comprimento = parseDouble(JOptionPane.showInputDialog("Digite o comprimento do veículo: "));
        altura = parseDouble(JOptionPane.showInputDialog("Digite a altura do veículo: "));
        largura = parseDouble(JOptionPane.showInputDialog("Digite a largura do veículo: "));
        pesoCarga = parseDouble(JOptionPane.showInputDialog("Digite o peso da carga do veículo: "));
    }

    public void exibeDados(){
        JOptionPane.showMessageDialog(null,"Modelo do veiculo: " + modelo);
         JOptionPane.showMessageDialog(null,"Tipo da carroceria: "+ tpCarroceria);
         JOptionPane.showMessageDialog(null,"Mudança no veículo: " + mudancaNoVeiculo);
         JOptionPane.showMessageDialog(null,"Peso: " + peso);
         JOptionPane.showMessageDialog(null,"Comprimento do veículo: " + comprimento);
        JOptionPane.showMessageDialog(null,"Altura do veículo: " + altura);
        JOptionPane.showMessageDialog(null,"Largura do veículo: " + largura);
        JOptionPane.showMessageDialog(null,"Peso da carga do veículo: " + pesoCarga);
    }

    public Veiculo(String modelo, String tpCarroceria, String mudancaNoVeiculo, double peso, double comprimento, double altura, double largura, double pesoCarga, int eixos) {
        this.modelo = modelo;
        this.tpCarroceria = tpCarroceria;
        this.mudancaNoVeiculo = mudancaNoVeiculo;
        this.peso = peso;
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.pesoCarga = pesoCarga;
        this.eixos = eixos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTpCarroceria() {
        return tpCarroceria;
    }

    public void setTpCarroceria(String tpCarroceria) {
        this.tpCarroceria = tpCarroceria;
    }

    public String getMudancaNoVeiculo() {
        return mudancaNoVeiculo;
    }

    public void setMudancaNoVeiculo(String mudancaNoVeiculo) {
        this.mudancaNoVeiculo = mudancaNoVeiculo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
}
