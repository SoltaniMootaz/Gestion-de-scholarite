/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionscoalrite;

import java.sql.*;

/**
 *
 * @author PC de Mootaz
 */
public  class Connexion {
    public static Connection cnx;
    public static int ID_PERS;
    public Connexion()throws SQLException, ClassNotFoundException {
        try{
         Class.forName("com.mysql.jdbc.Driver");
         cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_scolarite?characterEncoding=utf8","root","");
       }catch(SQLException e){
           System.out.println(e);
       }
    }
       public static int VerifUsers(String Mat,String Pass) throws SQLException, ClassNotFoundException{
         System.out.println(Mat);
         String QUERY = "select ID_PERS, count(*) AS counted  from user where MATRICULE=? and PASS=?";
         int retourner = 0;
          
        try{
         PreparedStatement Statement1=cnx.prepareStatement(QUERY);
         Statement1.setString(1, Mat);
         Statement1.setString(2, Pass);
        User user = new User();
         ResultSet rs1 = Statement1.executeQuery();
         rs1.next();
         
         
         //ResultSetMetaData metadata=rs1.getMetaData();*/
         int count=rs1.getInt("counted");
         if(count>0){
         ID_PERS=rs1.getInt("ID_PERS");
         retourner =1;
         }else{
         retourner =0;
         }
                     
             }
        catch (SQLException e) {
            //If exception occurs catch it and exit the program
            e.printStackTrace();
        }
        return retourner ;
        }

       

}
