package com.loosebazooka.test;

import java.io.IOException;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("this is the test servlet from service 2 using web.xml");
    }
}
