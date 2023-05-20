package br.com.fiap.challenge.model;

import javax.swing.*;

public class Login {
        private String registroUsuario;
        private String registroSenha;
        private String usuario;
        private String senha;

    public String getRegistroUsuario() {
        return registroUsuario;
    }

    public void setRegistroUsuario(String registroUsuario) {
        this.registroUsuario = registroUsuario;
    }

    public String getRegistroSenha() {
        return registroSenha;
    }

    public void setRegistroSenha(String registroSenha) {
        this.registroSenha = registroSenha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public Login(String registroUsuario, String registroSenha, String usuario, String senha) {
        this.registroUsuario = registroUsuario;
        this.registroSenha = registroSenha;
        this.usuario = usuario;
        this.senha = senha;
    }

    public void registraUsuario (){
        registroUsuario = JOptionPane.showInputDialog("Digite o seu usuario para ser cadastrado.");
        registroSenha = JOptionPane.showInputDialog("Digite o seu senha para ser cadastrado.");
    }

    public void verificaLogin(){
        String usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
        String senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
        int contador = 1;

        while (!senha.equals(registroSenha)|| !usuario.equals(registroUsuario)){
            JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto, tente novamente");
            JOptionPane.showMessageDialog(null, "Tentativas restantes: "+ (2 - contador));
            usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
            senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
            contador++;
            break;


        }if(senha.equals(registroSenha)&& usuario.equals(registroUsuario)) {
            JOptionPane.showMessageDialog(null,"Acesso liberado");
        }else if(contador<1){
            JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
        }else {
            JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
        }
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

