/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutogit;

/**
 *
 * @author Theophile
 */
public class Complexe {
    private double reel ;
    private double imaginaire ;

    public Complexe() {
    }

    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public double getReel() {
        return reel;
    }

    public void setReel(double reel) {
        this.reel = reel;
    }

    public double getImaginaire() {
        return imaginaire;
    }

    public void setImaginaire(double imaginaire) {
        this.imaginaire = imaginaire;
    }

    @Override
    public String toString() {
        return "Complexe{" + "reel=" + reel + ", imaginaire=" + imaginaire + '}';
    }
    public Complexe opposer (Complexe a)
    {
        return new Complexe(-reel, -imaginaire);
    }
    
}
