package Raca;

import Interfaces.IPoderesDeMago;
import Interfaces.Ipersonagem;
import Model.Personagem;

public class Anão extends Personagem implements IPoderesDeMago, Ipersonagem {


    public Anão(String orientacaoSexual, String nome) {
        super(orientacaoSexual, personagem, nome);
    }

    @Override
    public boolean BolaDeFogo() {
        System.out.println("Bola de fogo");
    }

    @Override
    public void BolaDeGelo() {

    }

    @Override
    public void nome() {
        
    }

    @Override
    public void sexo() {

    }


}
