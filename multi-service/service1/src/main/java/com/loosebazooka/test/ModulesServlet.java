package com.loosebazooka.test;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.modules.ModulesService;
import com.google.appengine.api.modules.ModulesServiceFactory;


@WebServlet("/modules")
public class ModulesServlet extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setContentType("text/html");
    // print all the modules
    ModulesService modulesService = ModulesServiceFactory.getModulesService();
    resp.getWriter().println("Modules:<br>");
    for (String module : modulesService.getModules()) {
      String hostname = modulesService.getVersionHostname(module, "no_version");
      resp.getWriter().println(" <a href='http://" + hostname +"'>" + module + "</a> @" + hostname + "<br>");
    }
  }
}
