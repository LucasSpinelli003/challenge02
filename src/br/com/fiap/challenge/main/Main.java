package br.com.fiap.challenge.main;

import br.com.fiap.challenge.model.Chamado;
import br.com.fiap.challenge.model.Contato;
import br.com.fiap.challenge.model.Veiculo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Chamado chamado = new Chamado(" "," "," "," "," "," "," ");
        Contato ctt = new Contato(" ", " ");
        Veiculo v = new Veiculo(" ", " ", " ", 0,0,0,0,0,0);

        chamado.fazChamado(ctt,v);
        chamado.exibeChamado(ctt,v);


    }
}