/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;

/**
 *
 * @author PC de Mootaz
 */
public class Matiere {
    private int ID;
    private Groupe GROUPE;
    private Enseignant ENS;
    private String NOM;

    public Matiere(int ID, Groupe GROUPE, Enseignant ENS, String NOM) {
        this.ID = ID;
        this.GROUPE = GROUPE;
        this.ENS = ENS;
        this.NOM = NOM;
    }

    public Matiere() {
    }

    public int getID() {
        return ID;
    }

    public Groupe getGROUPE() {
        return GROUPE;
    }

    public Enseignant getENS() {
        return ENS;
    }

    public String getNOM() {
        return NOM;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setGROUPE(Groupe GROUPE) {
        this.GROUPE = GROUPE;
    }

    public void setENS(Enseignant ENS) {
        this.ENS = ENS;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }
    
}
