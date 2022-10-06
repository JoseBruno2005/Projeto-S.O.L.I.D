package Main;

import Interfaces.Ipersonagem;
import Model.Personagem;
import Model.Sexo;
import Raca.Anão;

public class Main {
    public static void main(String[] args) {
        Anão a1 = new Anão("Gay", "Bruno");

        System.out.println(a1);
        System.out.println(a1.BolaDeFogo());
    }

}
