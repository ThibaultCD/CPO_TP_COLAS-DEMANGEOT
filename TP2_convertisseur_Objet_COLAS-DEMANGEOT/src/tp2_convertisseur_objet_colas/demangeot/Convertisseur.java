/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseur_objet_colas.demangeot;

import java.util.Scanner;
/**
 *
 * @author 33781
 */
public class Convertisseur {//Création d'une classe, de son attribut et de ses méthodes de conversions
     int nbConversions;
    
    public Convertisseur(){
        nbConversions = 0;
    }
    
     @Override
    public String toString(){
        return "nb de conversions : "+ nbConversions;
    }
    
     public double CelciusVersKelvin(double Celcius){
        double Kelvin = Celcius + 273.15;
        return Kelvin;      
    }
    
    public double KelvinVersCelcius(double Kelvin){
        double Celcius = Kelvin - 273.15;
        return Celcius;     
    }
    
    
    public double FarenheitVersCelcius(double Farenheit){
        double Celcius = (Farenheit - 32) / 1.8;
        return Celcius;
    }

    public double CelciusVersFarenheit(double Celcius){
        double Farenheit = (Celcius * 1.8) + 32;
        return Farenheit;  
    }
    
    public double KelvinVersFarenheit(double Kelvin){
        double Farenheit = CelciusVersFarenheit(KelvinVersCelcius(Kelvin));
        return Farenheit;  
    }
    
    public double FarenheitVersKelvin(double Farenheit){
        double Kelvin = CelciusVersKelvin(FarenheitVersCelcius(Farenheit));
        return Kelvin;    
    }
    
    public byte Selectmode(){//Création d'une méthode qui affichera à l'utilisateur les différentes possibilités 
        byte mode = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        
        System.out.println("Selectionnez la conversion de temperature souhaitee : \n"
                + "0 -> STOP\n"
                + "1 -> Celcius Vers Kelvin\n"
                + "2 -> Kelvin Vers Celcius\n"
                + "3 -> Farenheit Vers Celcius\n"
                + "4 -> Celcius Vers Farenheit\n"
                + "5 -> Kelvin Vers Farenheit\n"
                + "6 -> Farenheit Vers Kelvin\n");
        while(mode<1 | mode>6){
            mode = sc.nextByte();    
        }
        return mode;
    }
    
    public double convert(){// Création d'une méthode pour convertir
        byte mode = Selectmode();//Appelle de la méthode Selectmode
        Scanner sc = new Scanner(System.in);//Création d'un nouvel objet
        System.out.println("Saisissez une valeur : ");
        double t = sc.nextDouble();
        System.out.println("Vous avez choisi : " + t + "\n");
        String entree = "";
        String sortie = "";
        double resultat = 0;
        
        switch(mode){//Selon la solution choisie par l'utilisateur, cela renvoie à une des méthodes créée auparavant 
            case 0:
                return -300;
            case 1:
                entree = "Celsius";
                sortie = "Kelvin";
                resultat = CelciusVersKelvin(t);
                break;
            case 2:
                entree = "Kelvin";
                sortie = "Celsius";
                resultat = KelvinVersCelcius(t);
                break;
            case 3:
                entree = "Farenheit";
                sortie = "Celsius";
                resultat = FarenheitVersCelcius(t);
                break;
            case 4:
                entree = "Celsius";
                sortie = "Farenheit";
                resultat = CelciusVersFarenheit(t);
                break;
            case 5:
                entree = "Kelvin";
                sortie = "Farenheit";
                resultat = KelvinVersFarenheit(t);
                break;
            case 6:
                entree = "Farenheit";
                sortie = "Kelvin";
                resultat = FarenheitVersKelvin(t);
                break;
        }
        
        nbConversions ++;//Ajoute 1 à chaque conversions effectuées
        return resultat;
        
    }
}
