/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;

/**
 *
 * @author PC de Mootaz
 */
public class Enseignant extends Personne {
   private int CNSS;

//SETTERS AND GETTERS
public void setCNSS(int cnss) {
	this.CNSS=cnss;
}
public int getCNSS() {
	return CNSS;
}
//FUNCTIONS
public void affichageCNSS() {
	System.out.println("cnss du professeur ==> "+getCNSS());
        this.Display();
}

//CONSTRUCTORS
Enseignant(){
	
} 

    public Enseignant(int CNSS) {
        this.CNSS = CNSS;
    }

    public Enseignant(int CNSS, int ID, String NOM, String PRENOM, int TEL, String MAIL, String CIN) {
        super(ID, NOM, PRENOM, TEL, MAIL, CIN);
        this.CNSS = CNSS;
    }

}
