package com.huayu.taft.Controller;

import com.huayu.taft.DAO.BaseDAO;
import com.huayu.taft.DAO.UserDAO;
import com.huayu.taft.Util.ProduceID;
import com.huayu.taft.Util.UserAcount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by taft on 15/7/15.
 */
@WebServlet(name = "Register",urlPatterns = "/register")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String check = request.getParameter("check");
        System.out.println("check:"+check);
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        UserDAO ud = new UserDAO();
        String userName = request.getParameter("userName");
        if (check!=null){
            System.out.println("来验证的用户名是："+userName);
            UserAcount<String> usc = ud.getUserAcount();
            if (usc.contains(userName)){
                out.println("用户名不可用");
            }else{
                out.println("用户名可用");
                session.setAttribute("userName",userName);
            }
        }else{
            String userRID = new ProduceID("User",userName).getID();
            String userPass = request.getParameter("userPass");
            BaseDAO bd = new BaseDAO();
            String sql = "insert into users(userID,userName,userPass)values(?,?,?)";
            boolean flag = bd.doExcute(sql,userRID,userName,userPass);
            if(flag){
                out.print(1);
            }else{
                out.print(0);
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
