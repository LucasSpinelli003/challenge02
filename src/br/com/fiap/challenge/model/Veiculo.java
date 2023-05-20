package br.com.fiap.challenge.model;

import javax.swing.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Veiculo {
    private String modelo,tpCarroceria,mudancaNoVeiculo;
    private double comprimento,altura,largura,pesoCarga,peso;
    private int eixos;


    public void pegaDados(){
        modelo = JOptionPane.showInputDialog(null,"Digite o modelo do veiculo: ");
        tpCarroceria = JOptionPane.showInputDialog(null,"Digite o tipo da carroceria: ");
        mudancaNoVeiculo = JOptionPane.showInputDialog(null,"Houve alguma mudança no veículo? se sim qual?: ");
        peso = parseDouble(JOptionPane.showInputDialog("Digite o peso do veículo: "+"(Peso em toneladas)"));
        comprimento = parseDouble(JOptionPane.showInputDialog("Digite o comprimento do veículo: "));
        altura = parseDouble(JOptionPane.showInputDialog("Digite a altura do veículo: "));
        largura = parseDouble(JOptionPane.showInputDialog("Digite a largura do veículo: "));
        pesoCarga = parseDouble(JOptionPane.showInputDialog("Digite o peso da carga do veículo: "+"(Peso em toneladas)"));
        eixos = parseInt(JOptionPane.showInputDialog("Digite o numero de eixos do veículo: "));
    }

    public void exibeDados(){
        System.out.println("Modelo do veiculo........: " + modelo);
        System.out.println("Tipo da carroceria.......: "+ tpCarroceria);
        System.out.println("Mudança no veiculo......: " + mudancaNoVeiculo);
        System.out.println("Peso.....................: " + peso);
        System.out.println("Comprimento do veiculo...: " + comprimento);
        System.out.println("Altura do veiculo........: " + altura);
        System.out.println("Largura do veiculo.......: " + largura);
        System.out.println("Peso da carga do veiculo.: " + pesoCarga);
    }

    public double calculaPeso(){
        double pesoTotal = peso + pesoCarga;
        return pesoTotal;
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
