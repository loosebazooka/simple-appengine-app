package com.loosebazooka.test;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.modules.ModulesService;
import com.google.appengine.api.modules.ModulesServiceFactory;


@WebServlet("/test")
public class MyServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/plain");
    resp.getWriter().println("this is the test servlet from service 1 using 3.1 annotations");

    // print all the modules
    ModulesService modulesService = ModulesServiceFactory.getModulesService();
    resp.getWriter().println("Modules:");
    for (String module : modulesService.getModules()) {
      resp.getWriter().println(modulesService.getVersionHostname(module, "no_version"));
    }
  }
}
