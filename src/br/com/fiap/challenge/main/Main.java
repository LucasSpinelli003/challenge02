package br.com.fiap.challenge.main;

import br.com.fiap.challenge.model.*;


public class Main {
    public static void main(String[] args) {

        Chamado chamado = new Chamado("Invalido ","Invalido ","Invalido ","Invalido ","Invalido ");
        Contato c = new Contato("Invalido ", "Invalido ");
        Veiculo v = new Veiculo("Invalido", "Invalido ", "Invalido ", 0,0,0,0,0,0);
        Endereco e = new Endereco("Invalido ", 0,"Invalido ", "Invalido ");
        Modal m = new Modal();
        Login l = new Login("Invalido ", "Invalido ", "Invalido ", "Invalido ");
        LocalChamado lc = new LocalChamado(" ", " ");



        chamado.fazChamado(c,v,e,l,lc);
        chamado.exibeChamado(c,v,e,l,lc);
        m.escolheModal(v);

        //Testando a classe LocalChamado
        //lc.pegaLocalChamado();
        //lc.exibeLocalChamado();

        //Testando a classe Login
        //l.registraUsuario();
        //l.verificaLogin();

        //Testando a classe Modal
        // m.escolheModal(v);

        //testando a classe Endereco
        //e.pegaEndereco();
        //e.exibeEndereco();

        //Testando a classe Veiculo
        //v.pegaDados();
        //v.exibeDados();
        //v.calculaPeso();

        //Testando a classe Contato
        //c.pegaContato();
        //c.exibeContato();

    }
}