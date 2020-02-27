package com.yan.nginx;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * @author
 * @date 2020/2/27 13:25
 */
public class SessionServlet extends HttpServlet {

    private static final long serialVersionUID = -8552876250776236612L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("uid") == null){
            req.getSession().setAttribute("uid", new Random().nextInt(100));
        }
        System.out.println(req.getSession().getAttribute("uid"));
        //转发
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
        System.out.println("llll");
    }
}
