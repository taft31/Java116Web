package com.huayu.taft.Controller;

import com.huayu.taft.DAO.UserDAO;
import com.huayu.taft.Model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by taft on 15/7/7.
 */
@WebServlet(name = "Login",urlPatterns = "/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("lName");
        String userPass = request.getParameter("lPass");

        System.out.println("用户名："+userName);
        System.out.println("密码："+userPass);
        UserDAO ud = new UserDAO();
        User user = ud.userLogin(userName,userPass);
        if(user!=null){
            response.sendRedirect("pages/loginSuccess.jsp");
        }else{
            request.setAttribute("error","登录失败，用户名或密码错误");
            request.getRequestDispatcher("pages/login.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
