/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.100
 * Generated at: 2025-04-21 18:25:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    if (session.getAttribute("userEmail") != null) {
        String userType = (String) session.getAttribute("user_type");
        if ("student".equals(userType)) {
            response.sendRedirect("student_dashboard.jsp");
        } else if ("admin".equals(userType)) {
            response.sendRedirect("admin_dashboard.jsp");
        }
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Library Login</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins:400,600&display=swap\">\r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            font-family: 'Poppins', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body, html {\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            background: url('./images/register.jpg') no-repeat center center/cover;\r\n");
      out.write("            backdrop-filter: blur(5px);\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .glass-form {\r\n");
      out.write("            background: rgba(255, 255, 255, 0.1);\r\n");
      out.write("            backdrop-filter: blur(10px);\r\n");
      out.write("            border-radius: 15px;\r\n");
      out.write("            padding: 40px;\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            box-shadow: 0 8px 32px rgba(0, 0, 0, 0.25);\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-title {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 28px;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-group {\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-group input {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px 15px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-submit {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 12px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            background: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-submit:hover {\r\n");
      out.write("            background: #45a049;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signup-image-link {\r\n");
      out.write("            display: block;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"glass-form\">\r\n");
      out.write("        <h2 class=\"form-title\">LOGIN</h2>\r\n");
      out.write("        <form class=\"login-form\" id=\"login-form\" method=\"POST\" action=\"");
      out.print(request.getContextPath());
      out.write("/LoginServlet\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"email\" name=\"email\" id=\"email\" placeholder=\"Email\" required />\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"Password\" required />\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group form-button\">\r\n");
      out.write("                <input type=\"submit\" name=\"login\" id=\"login\" class=\"form-submit\" value=\"Login\" />\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"forgot-password.jsp\" class=\"signup-image-link\">Forgot Password?</a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Display error message if login fails -->\r\n");
      out.write("            <c:if test=\"${not empty error}\">\r\n");
      out.write("                <div style=\"color: red; text-align: center; margin-top: 20px;\">\r\n");
      out.write("                    <p>${error}</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </c:if>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
