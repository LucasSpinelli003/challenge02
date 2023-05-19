import br.com.fiap.challenge.model.Chamado;
import br.com.fiap.challenge.model.Contato;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Chamado chamado = new Chamado(" "," "," "," "," "," "," ");
        Contato ctt = new Contato(" ", " ");

        chamado.fazChamado();

        ctt.pegaContato();

        chamado.exibeChamado();


    }
}