/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;
import java.util.ArrayList;
/**
 *
 * @author PC de Mootaz
 */
public class Groupe {
    private int ID;
    private String Nom;
    private ArrayList<Etudiant> List_Etd;
    private ArrayList<Enseignant> List_Ens;

    public int getID() {
        return ID;
    }

    public String getNom() {
        return Nom;
    }

    public ArrayList<Etudiant> getList_Etd() {
        return List_Etd;
    }

    public ArrayList<Enseignant> getList_Ens() {
        return List_Ens;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setList_Etd(ArrayList<Etudiant> List_Etd) {
        this.List_Etd = List_Etd;
    }

    public void setList_Ens(ArrayList<Enseignant> List_Ens) {
        this.List_Ens = List_Ens;
    }

    
    public Groupe(int ID, String Nom, ArrayList<Etudiant> List_Etd, ArrayList<Enseignant> List_Ens) {
        this.ID = ID;
        this.Nom = Nom;
        this.List_Etd = List_Etd;
        this.List_Ens = List_Ens;
    }

    public Groupe() {
    }
    
    
}
