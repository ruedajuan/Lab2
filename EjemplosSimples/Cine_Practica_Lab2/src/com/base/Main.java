package com.base;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Espectadores e1 = new Espectadores("Juan Topo","123",2,"A");
        Espectadores e2 = new Espectadores("Rodri Gato","332",3,"A");
        Espectadores e3 = new Espectadores("Francia dog", "5545",4,"A");
        Espectadores e4 = new Espectadores("Simon cat","111",5,"A");

        List<Espectadores> listitaEspec=new ArrayList<Espectadores>();
        listitaEspec.add(e1);
        listitaEspec.add(e2);
        listitaEspec.add(e3);

        SalaDeCine s1 = new SalaDeCine("Sala1","Scream",5);
        s1.agregarListaEspectadores(listitaEspec);
        System.out.println(s1.toString());
        s1.eliminarEspectador("Juan Topo");
        System.out.println(s1.toString());
    }
}
