/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.HinhChuNhat;

/**
 *
 * @author HP
 */
public class ChuViDienTich extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse respond)
            throws ServletException,java.io.IOException
    {
        request.setCharacterEncoding("UTF-8");
        respond.setContentType("text/html; charset=UTF-8");
        String url = "/fail.html";
        String act = request.getParameter("action");
        if ("tinhtoan".equals(act)) {
            try {
                String cdai_str = request.getParameter("ChieuDai");
                String crong_str = request.getParameter("ChieuRong");
                
                float dai = Float.parseFloat(cdai_str);
                float rong = Float.parseFloat(crong_str);
                
                if (dai > 0 && rong > 0) {
                    HinhChuNhat hinhchunhat = new HinhChuNhat(dai, rong);
                    request.setAttribute("hcn", hinhchunhat);
                    
                    url = "/result.jsp";
                }
            } catch (NumberFormatException e){
               System.out.println(e.getMessage());
            }
            
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, respond);
    }
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse respond)
            throws ServletException,java.io.IOException
    {
        doPost(request, respond);
    }
}
