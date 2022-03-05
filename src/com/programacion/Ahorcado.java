package com.programacion;

import javax.swing.*;
import java.util.Scanner;

public class Ahorcado {
    //Variables
    public boolean palabraCorrecta=true;
    public String[] palabras = new String[3];
    public String cadena = "";


    public void Ahorcado(){
    //Le doy valores al Array
    palabras[0]="hormiga";
    palabras[1]="camión";
    palabras[2]="elefante";

    //Hago un for para contar el numero de letras/caracteres que tiene la palabra
    for(int i=0;i<palabras[0].length();i++){
        cadena +="*";
    }

    //Hago un while para introducir la palabra y un if para salir del while
    while(palabraCorrecta){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String intento=sc.nextLine();

        System.out.println("----------");
        System.out.println(cadena);
        System.out.println("----------");
        if(cadena.equalsIgnoreCase(cadena)){
            palabraCorrecta=false;
        }

    }

    //Muestro la palabra
    System.out.println(palabras[0]);
    }

}
