/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;

/**
 *
 * @author PC de Mootaz
 */
public class Role {
    private int ID;
    private String NOM;
    private int PERMISSION;

    public int getID() {
        return ID;
    }

    public String getNOM() {
        return NOM;
    }

    public int getPERMISSION() {
        return PERMISSION;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public void setPERMISSION(int PERMISSION) {
        this.PERMISSION = PERMISSION;
    }

    public Role(int ID, String NOM, int PERMISSION) {
        this.ID = ID;
        this.NOM = NOM;
        this.PERMISSION = PERMISSION;
    }

    public Role() {
    }
    
}
