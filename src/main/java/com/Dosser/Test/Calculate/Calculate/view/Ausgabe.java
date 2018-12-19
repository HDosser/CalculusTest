package com.Dosser.Test.Calculate.Calculate.view;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Ausgabe {

    private Scanner scan;

    public Ausgabe(){
        this.scan = new Scanner(System.in);
    }

    public void ausgabeUeberschrift(){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("# A Useless Calculator! #" );
        System.out.println("+++++++++++++++++++++++++");
    }
    public void augabeZahl(double d){
        System.out.println("Die summer ergiebt: "+d );
    }

    public double abfrageZahl()
    {
        System.out.println("Geben sie eine zahl ein!");
        return scan.nextDouble();
    }
}
