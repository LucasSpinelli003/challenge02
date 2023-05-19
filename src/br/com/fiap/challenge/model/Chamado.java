package br.com.fiap.challenge.model;


import javax.swing.*;

public class Chamado {
    private String usuario ;
    private String senha ;
    private String nomeCompleto ;
    private String dataDeNascimento ;
    private String rg ;
    private String cpf ;
    private String descricaoDoProblema ;
    private Contato contato;

    public void fazChamado(){
        usuario = JOptionPane.showInputDialog("Digite o seu usuario: ");
        senha = JOptionPane.showInputDialog("Digite a sua senha: ");
        nomeCompleto = JOptionPane.showInputDialog("Digite o seu nome completo: ");
        dataDeNascimento = JOptionPane.showInputDialog("Digite a sua data de nascimento: ");
        rg = JOptionPane.showInputDialog("Digite o seu rg: ");
        cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
        descricaoDoProblema = JOptionPane.showInputDialog("Digite a descrição do problema: ");
        contato.pegaContato();
    }


    public void exibeChamado (){
        JOptionPane.showMessageDialog(null,"Exibindo chamado: \n");
        JOptionPane.showMessageDialog(null,"Usuário: " + usuario);
       JOptionPane.showMessageDialog(null,"Nome completo:" + nomeCompleto);
        JOptionPane.showMessageDialog(null,"Data de Nascimento: " + dataDeNascimento);
        JOptionPane.showMessageDialog(null,"rg: " + rg);
        JOptionPane.showMessageDialog(null,"cpf: " + cpf);
        JOptionPane.showMessageDialog(null,"Descrição do problema: " + descricaoDoProblema );
        JOptionPane.showMessageDialog(null,"Email: " + contato);
        JOptionPane.showMessageDialog(null,"Telefone : " + contato);
    }

    public Chamado(String usuario, String senha, String nomeCompleto, String dataDeNascimento, String rg, String cpf, String descricaoDoProblema) {
        this.usuario = usuario;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.descricaoDoProblema = descricaoDoProblema;
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

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDescricaoDoProblema() {
        return descricaoDoProblema;
    }

    public void setDescricaoDoProblema(String descricaoDoProblema) {
        this.descricaoDoProblema = descricaoDoProblema;
    }
}
