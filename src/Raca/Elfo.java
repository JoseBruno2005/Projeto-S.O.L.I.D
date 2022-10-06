package Raca;

import Interfaces.IPoderesDeBruxo;
import Model.Personagem;

public class Elfo extends Personagem implements IPoderesDeBruxo {


    public Elfo(String orientacaoSexual, String nome) {
        super(orientacaoSexual, personagem, nome);
    }

    @Override
    public void InvocarDemonio() {
        System.out.println(this.getNome() + "Soltou demonio");
    }

    @Override
    public void Maldicoes() {
        System.out.println(this.getNome() + "Soltou demonio");
    }
}
