package com.Dosser.Test.Calculate.Calculate.controller;

import com.Dosser.Test.Calculate.Calculate.view.Ausgabe;
import org.springframework.stereotype.Controller;


@Controller
public class Logic {

    private Ausgabe ausgabe;

    public Logic(Ausgabe ausgabe) {
        this.ausgabe = ausgabe;
    }

    public void run(){
        double zahl1 = 0;
        double zahl2 = 0;

        ausgabe.ausgabeUeberschrift();
        zahl1 = ausgabe.abfrageZahl();
        zahl2 = ausgabe.abfrageZahl();
        ausgabe.augabeZahl(zahl1+zahl2);


    }
}
