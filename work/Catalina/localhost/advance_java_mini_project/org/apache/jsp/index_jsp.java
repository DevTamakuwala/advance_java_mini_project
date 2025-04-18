/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.100
 * Generated at: 2025-04-18 17:04:39 UTC
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Library Management System</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            font-family: 'Roboto', sans-serif;\r\n");
      out.write("            background-color: #f4f4f4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("     header {\r\n");
      out.write("         background-color: #e3f2fd; /* Light blue */\r\n");
      out.write("         color: #0d47a1; /* Darker blue text */\r\n");
      out.write("         padding: 10px 30px;\r\n");
      out.write("         display: flex;\r\n");
      out.write("         justify-content: space-between;\r\n");
      out.write("         align-items: center;\r\n");
      out.write("         flex-wrap: wrap;\r\n");
      out.write("         position: sticky;\r\n");
      out.write("         top: 0;\r\n");
      out.write("         z-index: 1000;\r\n");
      out.write("         box-shadow: 0 2px 6px rgba(0,0,0,0.1);\r\n");
      out.write("     }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                nav {\r\n");
      out.write("                    display: flex;\r\n");
      out.write("                    gap: 15px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("               nav a {\r\n");
      out.write("                   color: #0d47a1;\r\n");
      out.write("                   text-decoration: none;\r\n");
      out.write("                   font-weight: bold;\r\n");
      out.write("                   font-size: 16px;\r\n");
      out.write("                   padding: 8px 10px;\r\n");
      out.write("                   transition: color 0.3s ease;\r\n");
      out.write("               }\r\n");
      out.write("\r\n");
      out.write("               nav a:hover {\r\n");
      out.write("                   color: #1565c0; /* Slightly deeper blue on hover */\r\n");
      out.write("               }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                .auth-buttons {\r\n");
      out.write("                    display: flex;\r\n");
      out.write("                    gap: 8px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .auth-buttons a {\r\n");
      out.write("                    background-color: #0d47a1;\r\n");
      out.write("                    color: white;\r\n");
      out.write("                    padding: 6px 14px;\r\n");
      out.write("                    text-decoration: none;\r\n");
      out.write("                    border-radius: 4px;\r\n");
      out.write("                    font-weight: bold;\r\n");
      out.write("                    font-size: 14px;\r\n");
      out.write("                    border: none;\r\n");
      out.write("                    transition: all 0.3s ease;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .auth-buttons a:hover {\r\n");
      out.write("                    background-color: #1565c0;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        /* Hero Section */\r\n");
      out.write("        .hero-section {\r\n");
      out.write("            background-image: url('./images/lib1.jpg');\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            height: 80vh;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .hero-section::before {\r\n");
      out.write("            content: \"\";\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 0; left: 0;\r\n");
      out.write("            width: 100%; height: 100%;\r\n");
      out.write("            background: rgba(0, 0, 0, 0.5);\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .hero-content {\r\n");
      out.write("            position: relative;\r\n");
      out.write("            z-index: 2;\r\n");
      out.write("            max-width: 800px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .hero-content h1 {\r\n");
      out.write("            font-size: 3rem;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            letter-spacing: 1px;\r\n");
      out.write("            transition: transform 0.3s ease;\r\n");
      out.write("            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .hero-content h1:hover {\r\n");
      out.write("            transform: scale(1.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .hero-content p {\r\n");
      out.write("            font-size: 1.5rem;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("            font-style: italic;\r\n");
      out.write("            transition: color 0.3s ease;\r\n");
      out.write("            text-shadow: 1px 1px 4px rgba(0, 0, 0, 0.5);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .hero-content p:hover {\r\n");
      out.write("            color: #ffd700;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .hero-button {\r\n");
      out.write("            background-color: #ff6600;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 15px 30px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 1.2rem;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .hero-button:hover {\r\n");
      out.write("            background-color: #cc5200;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .main-content {\r\n");
      out.write("            padding: 40px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .main-content p {\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .nav-buttons a {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            margin: 10px;\r\n");
      out.write("            background-color: #007BFF;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 15px 30px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            border-radius: 6px;\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .nav-buttons a:hover {\r\n");
      out.write("            background-color: #0056b3;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .top-selling {\r\n");
      out.write("            padding: 40px 20px;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .top-selling h2 {\r\n");
      out.write("            font-size: 32px;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("            color: #007BFF;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            letter-spacing: 1px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .book-list {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            flex-wrap: wrap;\r\n");
      out.write("            gap: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .book-card {\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("            border-radius: 12px;\r\n");
      out.write("            width: 260px;\r\n");
      out.write("            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.12);\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            transition: transform 0.4s ease, box-shadow 0.4s ease;\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .book-card:hover {\r\n");
      out.write("            transform: scale(1.05);\r\n");
      out.write("            box-shadow: 0 12px 30px rgba(0, 123, 255, 0.3);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .book-card img {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 300px;\r\n");
      out.write("            object-fit: cover;\r\n");
      out.write("            object-position: center top;\r\n");
      out.write("            transition: transform 0.4s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .book-card:hover img {\r\n");
      out.write("            transform: scale(1.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .book-info {\r\n");
      out.write("            padding: 15px;\r\n");
      out.write("            background: linear-gradient(135deg, #f7f7f7, #eaeaea);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .book-info h3 {\r\n");
      out.write("            margin: 10px 0 5px;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .book-info p {\r\n");
      out.write("            margin: 4px 0;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            color: #555;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .review {\r\n");
      out.write("            font-style: italic;\r\n");
      out.write("            color: #666;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            font-size: 13px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer {\r\n");
      out.write("            background-color: #f0f0f0;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            padding: 40px 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            line-height: 1.8;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer p {\r\n");
      out.write("            margin: 10px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer a {\r\n");
      out.write("            color: #007BFF;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer a:hover {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @media (max-width: 768px) {\r\n");
      out.write("            nav, .auth-buttons {\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("                align-items: flex-start;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .nav-buttons a {\r\n");
      out.write("                width: 80%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .book-list {\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .hero-content h1 {\r\n");
      out.write("                font-size: 2rem;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .hero-content p {\r\n");
      out.write("                font-size: 1.2rem;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <a href=\"./index.jsp\">Home</a>\r\n");
      out.write("        <a href=\"./jsp/about.jsp\">About Us</a>\r\n");
      out.write("        <a href=\"./jsp/search.jsp\">Search Books</a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"auth-buttons\">\r\n");
      out.write("        <a href=\"./Login.jsp\">Login</a>\r\n");
      out.write("        <a href=\"./register.jsp\">Register</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!-- HERO SECTION -->\r\n");
      out.write("<section class=\"hero-section\">\r\n");
      out.write("    <div class=\"hero-content\">\r\n");
      out.write("        <h1>Join the Library Revolution Now!</h1>\r\n");
      out.write("        <p>YOUR LIBRARY, YOUR RULES.</p>\r\n");
      out.write("        <a href=\"#explore\" class=\"hero-button\">Explore Now</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- MAIN SECTION -->\r\n");
      out.write("<div class=\"main-content\" id=\"explore\">\r\n");
      out.write("    <p>Welcome to our smart and efficient Library Management System — explore, borrow, and manage books with ease!</p>\r\n");
      out.write("    <div class=\"nav-buttons\">\r\n");
      out.write("\r\n");
      out.write("        <a href=\"./members/\">Books</a>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- TOP SELLING BOOKS SECTION -->\r\n");
      out.write("<section class=\"top-selling\">\r\n");
      out.write("    <h2>Reader's Favorites</h2>\r\n");
      out.write("    <div class=\"book-list\">\r\n");
      out.write("        <div class=\"book-card\">\r\n");
      out.write("            <img src=\"./images/atomichabits.jpg\" alt=\"Atomic Habits\">\r\n");
      out.write("            <div class=\"book-info\">\r\n");
      out.write("                <h3>Atomic Habits</h3>\r\n");
      out.write("                <p>by James Clear</p>\r\n");
      out.write("                <p>Price: ₹499</p>\r\n");
      out.write("                <p class=\"review\">\"Life changing habits, explained simply!\"</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book-card\">\r\n");
      out.write("            <img src=\"./images/alchemist.jpg\" alt=\"The Alchemist\">\r\n");
      out.write("            <div class=\"book-info\">\r\n");
      out.write("                <h3>The Alchemist</h3>\r\n");
      out.write("                <p>by Paulo Coelho</p>\r\n");
      out.write("                <p>Price: ₹350</p>\r\n");
      out.write("                <p class=\"review\">\"Inspirational story with deep meaning.\"</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book-card\">\r\n");
      out.write("            <img src=\"./images/ikigai.png\" alt=\"Ikigai\">\r\n");
      out.write("            <div class=\"book-info\">\r\n");
      out.write("                <h3>Ikigai</h3>\r\n");
      out.write("                <p>by Héctor García</p>\r\n");
      out.write("                <p>Price: ₹420</p>\r\n");
      out.write("                <p class=\"review\">\"Soothing and motivating read that inspires purpose.\"</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book-card\">\r\n");
      out.write("            <img src=\"./images/richdad.png\" alt=\"Rich Dad Poor Dad\">\r\n");
      out.write("            <div class=\"book-info\">\r\n");
      out.write("                <h3>Rich Dad Poor Dad</h3>\r\n");
      out.write("                <p>by Robert Kiyosaki</p>\r\n");
      out.write("                <p>Price: ₹430</p>\r\n");
      out.write("                <p class=\"review\">\"Every student and entrepreneur must read this.\"</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- CUSTOMER REVIEWS SECTION -->\r\n");
      out.write("<section class=\"top-selling\">\r\n");
      out.write("    <h2>Reviews</h2>\r\n");
      out.write("    <div class=\"book-list\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book-card\">\r\n");
      out.write("            <img src=\"./images/review1.jpg\" alt=\"User Review 1\">\r\n");
      out.write("            <div class=\"book-info\">\r\n");
      out.write("                <h3>Anjali Sharma</h3>\r\n");
      out.write("                <p>⭐⭐⭐⭐⭐</p>\r\n");
      out.write("                <p>\"This library portal made my semester so easy. Borrowing books has never been smoother! The interface is user-friendly, and the borrowing process is incredibly fast.\"</p>\r\n");
      out.write("                <p class=\"review\">– Verified Member</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book-card\">\r\n");
      out.write("            <img src=\"./images/review2.jpg\" alt=\"User Review 2\">\r\n");
      out.write("            <div class=\"book-info\">\r\n");
      out.write("                <h3>Rahul Mehta</h3>\r\n");
      out.write("                <p>⭐⭐⭐⭐</p>\r\n");
      out.write("                <p>\"The library facilities are top-notch. I love the quiet study zones and the comfortable seating arrangements. It’s always a great place to focus!\"</p>\r\n");
      out.write("                <p class=\"review\">– Member since 2023</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book-card\">\r\n");
      out.write("            <img src=\"./images/review3.jpg\" alt=\"User Review 3\">\r\n");
      out.write("            <div class=\"book-info\">\r\n");
      out.write("                <h3>Fatima Khan</h3>\r\n");
      out.write("                <p>⭐⭐⭐⭐⭐</p>\r\n");
      out.write("                <p>\"The collection of books is incredible! There’s something for everyone, from academic texts to bestselling novels. I always find what I need!\"</p>\r\n");
      out.write("                <p class=\"review\">– Reader & Contributor</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- FOOTER -->\r\n");
      out.write("<footer style=\"background-color: #f9f9f9; color: #333; padding: 60px 20px; font-family: 'Segoe UI', sans-serif; border-top: 1px solid #ddd;\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer Title -->\r\n");
      out.write("    <div style=\"text-align: center; margin-bottom: 40px;\">\r\n");
      out.write("        <h2 style=\"color: #0077b6; font-size: 28px; margin-bottom: 10px;\">📚 Contact Us</h2>\r\n");
      out.write("        <p style=\"font-size: 16px; color: #555;\">Explore more links, updates & contact info below</p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main Footer Content -->\r\n");
      out.write("    <div style=\"max-width: 1200px; margin: auto; display: flex; flex-wrap: wrap; justify-content: space-between; gap: 40px;\">\r\n");
      out.write("\r\n");
      out.write("        <!-- About -->\r\n");
      out.write("        <div style=\"flex: 1 1 250px;\">\r\n");
      out.write("            <h3 style=\"color: #0077b6;\">Library Hub</h3>\r\n");
      out.write("            <p>Empowering readers with modern tools. Explore, reserve, and enjoy your favorite books — all in one place.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Quick Links -->\r\n");
      out.write("        <div style=\"flex: 1 1 200px;\">\r\n");
      out.write("            <h4 style=\"color: #0077b6;\">Quick Links</h4>\r\n");
      out.write("            <ul style=\"list-style: none; padding: 0; line-height: 1.8;\">\r\n");
      out.write("                <li><a href=\"./index.jsp\" style=\"color: #555; text-decoration: none;\">Home</a></li>\r\n");
      out.write("                <li><a href=\"./jsp/about.jsp\" style=\"color: #555; text-decoration: none;\">About Us</a></li>\r\n");
      out.write("                <li><a href=\"./jsp/search.jsp\" style=\"color: #555; text-decoration: none;\">Search Books</a></li>\r\n");
      out.write("                <li><a href=\"./jsp/login.jsp\" style=\"color: #555; text-decoration: none;\">Login</a></li>\r\n");
      out.write("                <li><a href=\"./jsp/register.jsp\" style=\"color: #555; text-decoration: none;\">Register</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Newsletter -->\r\n");
      out.write("        <div style=\"flex: 1 1 300px;\">\r\n");
      out.write("            <h4 style=\"color: #0077b6;\">Stay Connected</h4>\r\n");
      out.write("            <p>Join our newsletter to receive updates on new arrivals and events.</p>\r\n");
      out.write("            <form style=\"margin-top: 10px;\">\r\n");
      out.write("                <input type=\"email\" placeholder=\"Your email\" style=\"padding: 10px; width: 70%; border: 1px solid #ccc; border-radius: 4px 0 0 4px;\">\r\n");
      out.write("                <button type=\"submit\" style=\"padding: 10px 15px; background-color: #0077b6; color: #fff; border: none; border-radius: 0 4px 4px 0; cursor: pointer;\">Subscribe</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Contact Info -->\r\n");
      out.write("        <div style=\"flex: 1 1 250px;\">\r\n");
      out.write("            <h4 style=\"color: #0077b6;\">Contact Us</h4>\r\n");
      out.write("            <p>Email: <a href=\"mailto:support@library.com\" style=\"color: #0077b6;\">support@library.com</a></p>\r\n");
      out.write("            <p>Phone: +91-9876543210</p>\r\n");
      out.write("            <p>Location: 123 Knowledge Street, Booktown, India</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <hr style=\"margin: 40px 0; border-color: #ccc;\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bottom Bar -->\r\n");
      out.write("    <div style=\"text-align: center;\">\r\n");
      out.write("        <p style=\"margin: 10px 0;\">&copy; 2025 Library Management System. All rights reserved.</p>\r\n");
      out.write("        <div style=\"margin-top: 10px; font-size: 20px;\">\r\n");
      out.write("            <a href=\"#\" style=\"color: #0077b6; margin: 0 10px;\"><i class=\"fab fa-facebook\"></i></a>\r\n");
      out.write("            <a href=\"#\" style=\"color: #0077b6; margin: 0 10px;\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("            <a href=\"#\" style=\"color: #0077b6; margin: 0 10px;\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
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
