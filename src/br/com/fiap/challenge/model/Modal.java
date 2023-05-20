package br.com.fiap.challenge.model;
import br.com.fiap.challenge.model.Veiculo;


public class Modal {
    public void escolheModal(Veiculo veiculo){
        System.out.println("Calculando o melhor modal:.....\n");
        double pesoCalcula = veiculo.calculaPeso();
        if (pesoCalcula<=50){
            System.out.println("Melhor modal: Guincho pesado com quinta roda e bandeja.");
        }else if(pesoCalcula<=100){
            System.out.println("Melhor modal: Guincho pesado com plaraforma hidraulica MUNCK.");
        }else if(pesoCalcula<=200){
            System.out.println("Melhor modal: Guincho pesado com torre e lanca.");
        }else if(pesoCalcula == 0.0) {
            System.out.println("Invalido");
        }else{
            System.out.println("Melhor modal: Guincho pesado nao padrao.");
        }
    }

}
