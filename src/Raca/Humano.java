package Raca;

import Interfaces.IPoderesDeMonge;
import Model.Personagem;

public class Humano extends Personagem implements IPoderesDeMonge {


    public Humano(String orientacaoSexual, String nome) {
        super(orientacaoSexual, personagem, nome);
    }

    @Override
    public void ControlarVento() {
        System.out.println(this.getNome() + " Controlando Vento");
    }

    @Override
    public void BeberCerveja() {
        System.out.println(this.getNome() + " Bebendo Cerveja");
    }
}
