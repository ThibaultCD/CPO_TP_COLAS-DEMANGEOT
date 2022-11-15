/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armes;

/**
 *
 * @author 33781
 */
public class Baton extends Arme {
    
    int age;
    
    public Baton(String n, int i, int a){
        super(n, i);
        if (a > 0){
            age = a;
        }else{
            age = 0;  
        }if (a >= 100){
                   age = 99;
            }
    }
    @Override
    public String toString(){
        return "Baton(nom = "+ nom + ", attaque = " + attaque + ", age = " + age + ")";
    }
}
