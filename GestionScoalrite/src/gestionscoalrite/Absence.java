/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;

/**
 *
 * @author PC de Mootaz
 */
public class Absence {
    private Cours cours;
    private Etudiant ETD;
    private int NOMBRE;

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public void setETD(Etudiant ETD) {
        this.ETD = ETD;
    }

    public void setNOMBRE(int NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public Cours getCours() {
        return cours;
    }

    public Etudiant getETD() {
        return ETD;
    }

    public int getNOMBRE() {
        return NOMBRE;
    }

    public Absence(Cours cours, Etudiant ETD, int NOMBRE) {
        this.cours = cours;
        this.ETD = ETD;
        this.NOMBRE = NOMBRE;
    }

    public Absence() {
    }
    
    
}
