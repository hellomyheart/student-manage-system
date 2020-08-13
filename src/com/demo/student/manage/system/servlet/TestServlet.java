package com.demo.student.manage.system.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description ServletDemo
 * @className: TestServlet
 * @package: com.demo.student.manage.system.servlet
 * @author: Stephen Shen
 * @date: 2020/8/13 下午9:14
 */
public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("test");
    }
}
