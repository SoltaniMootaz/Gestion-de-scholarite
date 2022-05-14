/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;
public class Etudiant extends Personne {
    	private int NUM_INSC;
	//SETTERS AND GETTERS
	public 
		void setNum(int num) {
		this.NUM_INSC=num;
	}
	public int getNum() {
		return NUM_INSC;
	}
	//Functions
	void affichage() {
		
		System.out.println("votre numero d'inscription : "+getNum());
		this.Display();
	}
	//CONSTRUCTORS
	Etudiant(){	
	}

    public Etudiant(int NUM_INSC) {
        this.NUM_INSC = NUM_INSC;
    }

    public Etudiant(int NUM_INSC, int ID, String NOM, String PRENOM, int TEL, String MAIL, String CIN) {
        super(ID, NOM, PRENOM, TEL, MAIL, CIN);
        this.NUM_INSC = NUM_INSC;
    }
	
}
