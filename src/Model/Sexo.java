package Model;

public class Sexo {

    String OrientacaoSexual;

    public Sexo(String orientacaoSexual) {
        OrientacaoSexual = orientacaoSexual;
    }

    public String getOrientacaoSexual() {
        return OrientacaoSexual;
    }

    public void setOrientacaoSexual(String orientacaoSexual) {
        OrientacaoSexual = orientacaoSexual;
    }

    @Override
    public String toString() {
        return "\nSexo:" +
                "\nOrientacao Sexual= " + OrientacaoSexual + '\'';
    }
}
