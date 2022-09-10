/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classsch;

/**
 *
 * @author Dell
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import classsch.Barcode_Image;
import classsch.Barcode_PDF;
public class Barcode2{
	public static void main(String[] args) {
		 	PreparedStatement ps=null;
			Connection connection=null;
			Barcode obj_DBConnection=new Barcode();
			connection=obj_DBConnection.getConnection();
			ResultSet rs=null;
		try { 
			String query="select * from login_info";
                        
                        ps = connection.prepareStatement(query);
                        
                          rs=ps.executeQuery();
                         
                           
                          
                          
                          
                          
                          
                          while(rs.next()){
				Barcode_Image.createImage(rs.getString("mobile")+".png", rs.getString("mobile"));
				Barcode_PDF.createPDF(rs.getString("mobile")+".pdf", rs.getString("mobile"));
				System.out.println("Creating Barcode for "+rs.getString("mobile"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(connection!=null){
				try {
						connection.close();
					}
				 catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if(ps!=null){
				try {
					ps.close();
					}
				 catch (Exception e2) {
					 e2.printStackTrace();
				}
			}
		}
		}
        
}
    

