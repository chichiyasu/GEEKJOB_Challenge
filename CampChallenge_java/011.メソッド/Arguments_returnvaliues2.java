/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author inagakiyuuichi
 */
public class Arguments_returnvaliues2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    String[] profile(String st) {

        String[] human1 = {"1234", "1991.1.2", "tokyo"};
        String[] human2 = {"3456", "1991.3.4", "kanagawa"};
        String[] human3 = {"6789", "1991.5.6", null};

        if (st.equals(human1[0])) {

            return human1;

        } else if (st.equals(human2[0])) {

            return human2;
        } else if (st.equals(human3[0])) {
                         
            return human3;

        }
        return null;
       
        
    }


    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Arguments_returnvaliues2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Arguments_returnvaliues2 at " + request.getContextPath() + "</h1>");
            
            String[] data1 = profile("1234");

            for (int num1 = 0; num1 < 3; num1++) {

                out.print(data1[num1] + "<br>");

            }
            
            String[]data2 = profile("3456");
             
             for(int num2=0;num2<3;num2++){
                 
                 out.print(data2[num2]+"<br>");
                 
             }
                     
            String[]data3 = profile("6789");
             
             for(int num3=0;num3<3;num3++){
                 
              if(data3[num3]==null){
                   continue;
                   
              }   
                 out.print(data3[num3]+"<br>");
                 
             }
            
            
            out.println("</body>");
            out.println("</html>");
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
