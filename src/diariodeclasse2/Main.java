package diariodeclasse2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Chamada> chamadas = new LinkedList<>();

        Chamada dia1 = new Chamada("Daniel", "Presente");
        Chamada dia2 = new  Chamada("Edgar", "Ausente");
        Chamada dia3 = new Chamada("Zé", "Presente");

        chamadas.add(dia1);
        chamadas.add(dia2);
        chamadas.add(dia3);


        for (Chamada c : chamadas){
            System.out.println(c);
        }


    }
}

