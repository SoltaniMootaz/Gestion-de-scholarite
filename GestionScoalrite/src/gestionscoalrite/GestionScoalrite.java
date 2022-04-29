

package gestionscoalrite;
import java.sql.* ;
/**
 *
 * @author Mootaz
 */
public class GestionScoalrite {
    public static void main(String[] args)throws ClassNotFoundException {
       Connection cnx=null;
       Statement st=null;
       try{
         Class.forName("com.mysql.jdbc.Driver");
         cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_scolarite?characterEncoding=utf8","root","");
         String requete="Insert into Personne(NOM,PRENOM,ADRESSE,TEL,MAIL,CIN) values('Mootaz','Soltani','8 Rue Karachi',24501725,'mootaz.1.soltani2019@gmail.com','09637431')";
         st=cnx.createStatement();
            int nb=st.executeUpdate(requete);
            System.out.println("nombre de mise a jour:"+nb);
         cnx.close();
       }catch(SQLException e){
           System.out.println(e);
       }
    }
    
}
