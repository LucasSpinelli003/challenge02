package br.com.fiap.challenge.model;

import br.com.fiap.challenge.model.Contato;

import javax.print.attribute.standard.JobKOctets;
import javax.swing.*;

public class Chamado {
    private String nomeCompleto ;
    private String dataDeNascimento ;
    private String rg ;
    private String cpf ;
    private String descricaoDoProblema ;
    private Contato contato;
    private Veiculo veiculo;
    private Endereco endereco;
    private Login login;

    public Chamado( String nomeCompleto, String dataDeNascimento, String rg, String cpf, String descricaoDoProblema) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.descricaoDoProblema = descricaoDoProblema;
    }

    public void fazChamado(Contato contato, Veiculo veiculo, Endereco endereco,Login login,LocalChamado localChamado){
        login.registraUsuario();
        login.verificaLogin();
        nomeCompleto = JOptionPane.showInputDialog("Digite o seu nome completo: ");
        dataDeNascimento = JOptionPane.showInputDialog("Digite a sua data de nascimento: ");
        rg = JOptionPane.showInputDialog("Digite o seu rg: ");
        cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
        endereco.pegaEndereco();
        descricaoDoProblema = JOptionPane.showInputDialog("Digite a descrição do problema: ");
        veiculo.pegaDados();
        contato.pegaContato();
        localChamado.pegaLocalChamado();
    }


    public void exibeChamado (Contato contato,Veiculo veiculo, Endereco endereco,Login login,LocalChamado localChamado){
        System.out.println("Exibindo chamado: \n");
        System.out.println("Usuario..................: " + login.getRegistroUsuario());
        System.out.println("Nome completo............:" + nomeCompleto);
        System.out.println("Data de Nascimento.......: " + dataDeNascimento);
        System.out.println("rg:......................:" + rg);
        System.out.println("cpf......................: " + cpf);
        System.out.println("Descricao do problema..: " + descricaoDoProblema );
        veiculo.exibeDados();
        endereco.exibeEndereco();
        contato.exibeContato();
        localChamado.exibeLocalChamado();

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
