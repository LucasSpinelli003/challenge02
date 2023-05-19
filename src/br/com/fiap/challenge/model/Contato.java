package br.com.fiap.challenge.model;

import javax.swing.*;

public class Contato {
    private String telefone, email;


    public Contato(String telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

    public void pegaContato(){
        telefone = JOptionPane.showInputDialog(null,"Digite o seu telefone: ");
       email = JOptionPane.showInputDialog(null,"Digite o seu email: ");
    }


    public void exibeContato() {
        JOptionPane.showMessageDialog(null,"Telefone: " + telefone);
        JOptionPane.showMessageDialog(null,"Email: " + email);
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
