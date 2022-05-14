/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;

/**
 *
 * @author PC de Mootaz
 */
public class User extends Personne {
    private String MATRICULE;
    private String PASS;
    private Role role;

    public String getMATRICULE() {
        return MATRICULE;
    }

    public String getPASS() {
        return PASS;
    }

    public Role getRole() {
        return role;
    }

    public void setMATRICULE(String MATRICULE) {
        this.MATRICULE = MATRICULE;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
    
    public User(String MATRICULE, String PASS, Role role) {
        this.MATRICULE = MATRICULE;
        this.PASS = PASS;
        this.role = role;
    }

    public User(String MATRICULE, String PASS, Role role, int ID, String NOM, String PRENOM, int TEL, String MAIL, String CIN) {
        super(ID, NOM, PRENOM, TEL, MAIL, CIN);
        this.MATRICULE = MATRICULE;
        this.PASS = PASS;
        this.role = role;
    }

    public User() {
    }
    
}
