/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;

/**
 *
 * @author PC de Mootaz
 */
public class Departement {
    private int ID;
    private String NOM;
    private Enseignant CHEF;

    public int getID() {
        return ID;
    }

    public String getNOM() {
        return NOM;
    }

    public Enseignant getCHEF() {
        return CHEF;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public void setCHEF(Enseignant CHEF) {
        this.CHEF = CHEF;
    }

    public Departement(int ID, String NOM, Enseignant CHEF) {
        this.ID = ID;
        this.NOM = NOM;
        this.CHEF = CHEF;
    }

    public Departement() {
    }
 
    
}
