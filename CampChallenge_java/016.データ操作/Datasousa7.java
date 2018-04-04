/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datasousapackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author inagakiyuuichi
 */
//セッションを利用して現在時刻を記録してください。また，２回目以降のアクセス時は，セッションの値を取り出し，前回にアクセスした時刻の情報を画面に表示してください。



public class Datasousa7 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Datasousa7</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Datasousa7 at " + request.getContextPath() + "</h1>");
            
            //現在時刻の作成
            //Dateクラスのインスタンス作成
            Date now = new Date();
            //SimpleDateForamatクラスのインスタンス作成
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            //logtimeへ現在時刻のフォーマットを代入
            String logtime = sdf.format(now);
            
            //セッションクラスのインスタンス作成
            HttpSession hs = request.getSession();

            //loginにString型の”lastlogin”を登録
            String login = (String) hs.getAttribute("lastlogin");

            //ログインに何か登録されている場合
            if (login != null) {

                out.println("最終ログインは、<br>" + login + "<br>");
                out.println("現在の時刻は、<br>" + logtime + "<br>");

                //登録なしの場合
            } else {
                //現在の時刻を表示
                out.println("現在の時刻は、<br>" + logtime);

            }
            //lastloginに現在の時刻を登録
                 hs.setAttribute("lastlogin",logtime);
            


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
