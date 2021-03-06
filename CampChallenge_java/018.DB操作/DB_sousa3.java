/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author inagakiyuuichi
 */
public class DB_sousa3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    Connection db_con=null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;
    
    
    String prof_select = "select * from profiles";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
           
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           
           db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/GEEKJOB_db","INAGAKI","1222");
           
            System.out.println("MySQLへ接続できました。");
            
            db_st =db_con.prepareStatement(prof_select);
            
            db_data = db_st.executeQuery();
            
            out.println("GEEKJOB_db内のprofilesを全件表示します。"+"<br>");
            out.println("profilesID/name/tel/age/birthday"+"<br>");
            
            while(db_data.next()){
                out.println(db_data.getInt("profilesID")+"/");
                out.println(db_data.getString("name")+"/");
                out.println(db_data.getString("tel")+"/");
                out.println(db_data.getInt("age")+"/");
                out.println(db_data.getString("birthday")+"<br>");
                
            }
            db_data.close();
            db_st.close();
            db_con.close();
       
            
        }catch(SQLException e_sql){
            System.out.println("接続時にエラーが発生しました。"+e_sql.toString());
        }catch(Exception e){
            System.out.println("接続時にエラーが発生しました。"+e.toString());
     
        } finally {
            if (db_con != null ) {
            
            try {
                    db_con.close();
                } catch (SQLException e_con) {
                    System.out.println(e_con.getMessage());
                }
            }
        }
    }
  
  
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
