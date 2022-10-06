package Model;

import Interfaces.Ipersonagem;

public class Personagem extends Sexo implements Ipersonagem {

    private final Ipersonagem personagem;
    private String nome;

    public Personagem(String orientacaoSexual, Ipersonagem personagem, String nome) {
        super(orientacaoSexual);
        this.personagem = personagem;
        this.nome = nome;
    }


    @Override
    public void nome() {
        this.nome=nome;
    }

    @Override
    public void sexo() {
        Sexo sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Personagem" +
                "\nnome=" + nome  +
                "\nOrientacaoSexual= " + OrientacaoSexual;
    }
}
