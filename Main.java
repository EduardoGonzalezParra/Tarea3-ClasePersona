package com.company;

class Persona{
    //Atributos
    private int edad;
    private String name;

    //Metodos
    public void cumplirAños()
    {
        edad ++;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setNombre(String name)
    {
        this.name = name;
    }

    public String getNombre()
    {
        return name;
    }
}

public class Main {
    public static void main(String[] args)
    {
        Persona Paco = new Persona();
        Persona Lupe = new Persona();

        Paco.cumplirAños();
        Paco.cumplirAños();
        Paco.cumplirAños();
        Paco.cumplirAños();

        Lupe.cumplirAños();
        Lupe.cumplirAños();

        Paco.setNombre("Paco");
        Lupe.setNombre("Lupe");

        System.out.println(Paco.getNombre() + " tiene " + Paco.getEdad() + " años");
        System.out.println(Lupe.getNombre() + " tiene " + Lupe.getEdad() + " años");
    }
}

