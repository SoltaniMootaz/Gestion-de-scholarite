/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;

/**
 *
 * @author PC de Mootaz
 */
public class Note {
   private Matiere MAT;
   private Etudiant ETD;
   private String TYPE;
   private double note;

    public void setMAT(Matiere MAT) {
        this.MAT = MAT;
    }

    public void setETD(Etudiant ETD) {
        this.ETD = ETD;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Matiere getMAT() {
        return MAT;
    }

    public Etudiant getETD() {
        return ETD;
    }

    public String getTYPE() {
        return TYPE;
    }

    public double getNote() {
        return note;
    }

    public Note(Matiere MAT, Etudiant ETD, String TYPE, double note) {
        this.MAT = MAT;
        this.ETD = ETD;
        this.TYPE = TYPE;
        this.note = note;
    }

    public Note() {
    }
   
   
}
