/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;

/**
 *
 * @author PC de Mootaz
 */
public class Personne {
    private int ID;
    private String NOM;
    private String PRENOM;
    private int TEL;
    private String MAIL;
    private String CIN;
public
//SETTERS
	void setID(int ID) {
	this.ID=ID;
}
void setNOM(String  nom) {
this.NOM=nom;
}
void setPrenom(String prenom) {
this.PRENOM=prenom;
}
void setEmail(String email) {
this.MAIL=email;
}

    public void setTEL(int TEL) {
        this.TEL = TEL;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

	//GETTERS
public int getID() {
	return ID;
}
public String getNom() {
	return NOM;
}
public String getPrenom() {
	return PRENOM;
}
public String getEmail() {
	return MAIL;
}

    public int getTEL() {
        return TEL;
    }

    public String getCIN() {
        return CIN;
    }

Personne(){
	
}

    public Personne(int ID, String NOM, String PRENOM, int TEL, String MAIL, String CIN) {
        this.ID = ID;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.TEL = TEL;
        this.MAIL = MAIL;
        this.CIN = CIN;
    }

public void Display() {
	System.out.println("votre nom est : "+this.NOM);
	System.out.println("votre prenom est : "+this.PRENOM);
	System.out.println("votre email est : "+this.MAIL);
        System.out.println("votre numero de telephone est : "+this.TEL);
        System.out.println("Votre CIN est :"+ this.CIN);
	System.out.println("votre ID est : "+this.ID);
}


protected void finalize()  
{    
}       
}
