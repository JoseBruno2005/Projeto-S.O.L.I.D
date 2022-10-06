package Raca;

import Interfaces.IPoderesDeGuerreiro;
import Model.Personagem;

public class Orc extends Personagem implements IPoderesDeGuerreiro {


    public Orc(String orientacaoSexual, String nome) {
        super(orientacaoSexual, personagem, nome);
    }

    @Override
    public void Soco() {
        System.out.println(this.getNome() + " Deu um sabaco mais um muxicrao");
    }

    @Override
    public void CortesComEspadas() {
        System.out.println(this.getNome() + " Passou a peixeira");
    }
}
