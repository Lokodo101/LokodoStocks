/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2021-06-25 14:44:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title> Home </title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    body {\r\n");
      out.write("        background-color: #000000;\r\n");
      out.write("        font-family:arial,helvetica;\r\n");
      out.write("    }\r\n");
      out.write("    h1 {\r\n");
      out.write("        background-color: #070707;\r\n");
      out.write("        color:white;\r\n");
      out.write("        font-family:arial,helvetica;\r\n");
      out.write("    }\r\n");
      out.write("    p {\r\n");
      out.write("        background-color: #070707;\r\n");
      out.write("        color:white;\r\n");
      out.write("        font-family:arial,helvetica;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #body{\r\n");
      out.write("    font-family:arial,helvetica;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #footer {\r\n");
      out.write("       position:absolute;\r\n");
      out.write("       bottom:0;\r\n");
      out.write("       width:100%;\r\n");
      out.write("       height:50px;   /* Height of the footer */\r\n");
      out.write("       background:#070707;\r\n");
      out.write("       font-family:arial,helvetica;\r\n");
      out.write("    }\r\n");
      out.write("    .button {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            background-color: #070707;\r\n");
      out.write("            border-radius: 6px;\r\n");
      out.write("            outline: none\r\n");
      out.write("            font-family:arial,helvetica;\r\n");
      out.write("          }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div id=\"body\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1 style=\"text-align:center;\">Welcome to the Rogue Lite Typing Game</h1>\r\n");
      out.write("        <p style=\"text-align:center;\">Welcome to RLTG, use the hyperlink below to find out what the game is about and how to play it</p>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <!-- Footer start -->\r\n");
      out.write("        <p><a class=\"button\" href=\"about.jsp\" style=\"color: #FFFFFF\"> About </a> <a href=\"game.html\" class=\"button\" style=\"color: #FFFFFF\"> Game </a></a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer end -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
