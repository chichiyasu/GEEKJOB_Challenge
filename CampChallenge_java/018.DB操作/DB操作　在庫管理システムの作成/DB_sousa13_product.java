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
import javax.servlet.RequestDispatcher;

/**
 *
 * @author inagakiyuuichi
 */
public class DB_sousa13_product extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   Connection db_con = null;
   PreparedStatement db_st = null;
   ResultSet db_data = null;
   
    
    String product_insert = "INSERT INTO Product VALUES (?,?,?,?,?)";
    String product_select = "select * from Product";
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/GEEKJOB_db","INAGAKI","1222");
            System.out.println("MySQLへ接続できました。");
            
            request.setCharacterEncoding("UTF-8");
            
            
           if(request.getParameter("btnsubmit").equals("追加")){
            db_st = db_con.prepareStatement(product_insert);
            
            String N = request.getParameter("NO");
            String n = request.getParameter("name");
            String p = request.getParameter("price");
            String c = request.getParameter("count");
            String D = request.getParameter("DofR");
            
            db_st.setInt(1,Integer.parseInt(N));
            db_st.setString(2,n);
            db_st.setInt(3,Integer.parseInt(p));
            db_st.setInt(4,Integer.parseInt(c));
            db_st.setDate(5,Date.valueOf(D));
         
            
            int result = db_st.executeUpdate();
            
            System.out.println("更新結果は、"+result+"です。");
            if(result != 0){
                out.println("登録しました。");
            }
               
           }else if(request.getParameter("btnsubmit").equals("一覧")){
              
            db_st = db_con.prepareStatement(product_select);
            
            db_data = db_st.executeQuery();
            
            
                  while (db_data.next()) {

                out.println("No:" + db_data.getInt("NO") + "/" + "商品名:" + db_data.getString("name") + "/"
                        + "価格:" + db_data.getInt("price")+"円" + "/" + "在庫数:" + db_data.getInt("count")+"個" + "/" + "最終更新日:" + db_data.getDate("DofR") + "<br>");

            }
           }
            db_data.close();
            db_st.close();
            db_con.close();

        } catch (SQLException e_sql) {
            System.out.println("接続時にエラーが発生しました。"+e_sql.toString());
        }catch(Exception e){
            System.out.println("接続時にエラーが発生しました。"+e.toString());
        }finally{
           if(db_con != null){
               try{
                   db_con.close();
               }catch(Exception e_con){
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
