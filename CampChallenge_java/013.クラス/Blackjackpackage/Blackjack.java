/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjackpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author inagakiyuuichi
 */
public class Blackjack extends HttpServlet {

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
            out.println("<title>Servlet Blackjack</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Blackjack at " + request.getContextPath() + "</h1>");
            //インスタンス生成（Dealerクラス、Userクラス）
            User U = new User();
            Dealer D = new Dealer();//コンストラクタにより、山札を持ち、生成

            //メソッドの呼び出し
            ArrayList<Integer> dealercards = D.deal();
            D.setCard(dealercards);
            out.print("ディーラが引いたカードは、" + D.myCards + "<br>");//ディーラーの手札

            out.print("現在の合計は、" + D.open() + "です<br>");
            ArrayList<Integer> usercards = D.deal();
            U.setCard(usercards);
            out.print("あなたの引いたカードは、" + U.myCards + "<br>");//ユーザーの手札

            out.print("現在の合計は、" + U.open() + "<br>");

            //双方へ、18以下なら、ヒットを、以上ならスタンドを指示
            out.print("ディーラーのターン<br>");
            while (D.checksum()) {
                D.setCard(D.hit());
                out.print("ディーラー「ヒットします」<br>");
                out.print("現在、ディーラーのハンドは、" + D.myCards + "<br>");

            }
            out.print("ディーラー「スタンド」<br>");
            
            out.print("あなたのターン<br>");

            while (U.checksum()) {
                U.setCard(D.hit());
                out.print("「ヒット」<br>");
                out.print("現在、あなたのハンドは、" + U.myCards + "<br>");
            }
            out.print("「スタンド」<br>");

            out.print("ディーラーのハンドは" + D.open() + "です" + "<br>");
            out.print("あなたのハンドは" + U.open() + "です" + "<br>");

            out.print("勝敗は、、、");
            //勝敗の判定
            if (D.open() > 21) {
                out.print("ディーラーのBARSTにより、あなたの勝ちです。<br>");

            } else {
                if (U.open() > 21) {
                    out.print("BARSTにより、あなたの負けです。");
                    
                } else if (D.open() > U.open()) {
                    out.print("ディーラーの勝ちです");
                } else if (U.open() > D.open()) {
                    out.print("あなたの勝ちです！");
                } else if (U.open() == D.open()) {
                    out.print("引き分けです。。。");
                } else {
                    out.print("両者BARSTにより、引き分けです。。。");
                }

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
