/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2023-06-21 00:27:05 UTC
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>Insert title here</title>\r\n");
      out.write("	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script src=\"https://kit.fontawesome.com/05d425af79.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.1.6/dist/sweetalert2.all.min.js\"></script>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/sweetalert2@11.1.6/dist/sweetalert2.min.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Comfortaa:wght@700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- <script src=\"index.js\"></script> -->\r\n");
      out.write("	<style>\r\n");
      out.write("	body {\r\n");
      out.write("      margin: 0;\r\n");
      out.write("      padding: 0;\r\n");
      out.write("      background-color: pink;\r\n");
      out.write("      background-image: url('https://wallpaperaccess.com/full/2529012.jpg');\r\n");
      out.write("      background-repeat: no-repeat;\r\n");
      out.write("      background-size: cover;\r\n");
      out.write("    }\r\n");
      out.write("    .display-none {\r\n");
      out.write("      opacity: 0;\r\n");
      out.write("      transition: opacity 2.5s;\r\n");
      out.write("    }\r\n");
      out.write("    .display-block {\r\n");
      out.write("      opacity: 1;\r\n");
      out.write("      transition: opacity 2.5s;\r\n");
      out.write("    }\r\n");
      out.write("    .white-placeholder::placeholder {\r\n");
      out.write("        color: white;\r\n");
      out.write("    }\r\n");
      out.write("    .shadow{\r\n");
      out.write("        box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px;\r\n");
      out.write("    }\r\n");
      out.write("	</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- div for creating Login and sinhup buttons...  -->\r\n");
      out.write("	<div class=\"d-flex justify-content-end align-items-center\" style=\"position: relative; top: 60px\">\r\n");
      out.write("		<button type=\"button\" class=\"btn btn-outline-light mx-5\" onclick=\"openLoginForm()\" id=\"login_button\">Login</button>\r\n");
      out.write("		<button type=\"button\" class=\"btn btn-outline-light mx-5\" id=\"signupButton\" onclick=\"opensignupForm()\">Signup</button>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- div for creating Login and sinhup buttons...  -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- SIDEBAR -->\r\n");
      out.write("	<div class=\"d-flex justify-content-center align-items-center\" style=\"height: 100vh; width: 12vw\">\r\n");
      out.write("    <div class=\"d-flex flex-column justify-content-center align-items-center\">\r\n");
      out.write("      <i class=\"fa-solid fa-user p-4 sideBarIcon\"></i>\r\n");
      out.write("      <i class=\"fa-solid fa-magnifying-glass p-4 sideBarIcon\"></i>\r\n");
      out.write("      <i class=\"fa-solid fa-house p-4 sideBarIcon\"></i>\r\n");
      out.write("      <i class=\"fa-solid fa-tv p-4 sideBarIcon\"></i>\r\n");
      out.write("      <i class=\"fa-solid fa-clapperboard p-4 sideBarIcon\"></i>\r\n");
      out.write("      <i class=\"fa-solid fa-volleyball p-4 sideBarIcon\"></i>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"d-flex flex-column justify-content-around display-none\" style=\"height: 384px\" id=\"sideBar\">\r\n");
      out.write("	      <strong>MySpace</strong>\r\n");
      out.write("	      <strong>Search</strong>\r\n");
      out.write("	      <strong>Home</strong>\r\n");
      out.write("	      <strong>Tv</strong>\r\n");
      out.write("	      <strong>Movies</strong>\r\n");
      out.write("	      <strong>Sport</strong>\r\n");
      out.write("	    </div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- SIDEBAR -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("// Get all sidebar icons\r\n");
      out.write("const sideBarIcons = document.querySelectorAll(\".sideBarIcon\");\r\n");
      out.write("const sideBar = document.getElementById(\"sideBar\");\r\n");
      out.write("let container;\r\n");
      out.write("\r\n");
      out.write("// Add event listeners to each icon\r\n");
      out.write("sideBarIcons.forEach(icon => {\r\n");
      out.write("icon.addEventListener(\"mouseover\", function() {\r\n");
      out.write("    sideBar.classList.remove(\"display-none\");\r\n");
      out.write("    sideBar.classList.add(\"display-block\");\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("icon.addEventListener(\"mouseout\", function() {\r\n");
      out.write("    sideBar.classList.remove(\"display-block\");\r\n");
      out.write("    sideBar.classList.add(\"display-none\");\r\n");
      out.write("});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//create a div of full viewPort size...\r\n");
      out.write("function createFullViewPortSizedContainerForLoginAndSignupFor(){\r\n");
      out.write("	container = document.createElement(\"div\");\r\n");
      out.write("    container.classList.add(\"d-flex\", \"align-items-center\", \"justify-content-center\", \"flex-column\");\r\n");
      out.write("    container.style.position = \"absolute\";\r\n");
      out.write("    container.style.top = \"0\";\r\n");
      out.write("    container.style.width = \"100vw\";\r\n");
      out.write("    container.style.height = \"100vh\";\r\n");
      out.write("}\r\n");
      out.write("//create a div of full viewPort size...\r\n");
      out.write("\r\n");
      out.write("/*open signup form after clicking on signupButton...*/\r\n");
      out.write("function opensignupForm(){\r\n");
      out.write("    // create a div of full viewPort size...\r\n");
      out.write("    createFullViewPortSizedContainerForLoginAndSignupFor();\r\n");
      out.write("    \r\n");
      out.write("    // crete a form... \r\n");
      out.write("    let form = document.createElement(\"form\");\r\n");
      out.write("    form.classList.add(\"p-4\", \"rounded\", \"shadow\");\r\n");
      out.write("    form.style.backgroundColor = \"rgb(255,255,255)\";\r\n");
      out.write("    form.style.height = \"80vh\";\r\n");
      out.write("    form.style.width = \"28vw\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    let heading = document.createElement(\"h3\");\r\n");
      out.write("    heading.textContent = \"SIGNUP\";\r\n");
      out.write("    heading.classList.add(\"text-dark\", \"text-center\", \"mb-4\");\r\n");
      out.write("    heading.style.fontWeight = \"800\";\r\n");
      out.write("    form.appendChild(heading);\r\n");
      out.write(" 	// crete a form... \r\n");
      out.write("    \r\n");
      out.write("    for(let i = 0 ; i < 5 ; i++) {\r\n");
      out.write("\r\n");
      out.write("        // label ...\r\n");
      out.write("        let label = document.createElement(\"label\");\r\n");
      out.write("        label.setAttribute(\"for\", \"formGroupExampleInput\");\r\n");
      out.write("        label.classList.add(\"form-label\");\r\n");
      out.write("        label.style.marginLeft = \"13px\";\r\n");
      out.write("        label.style.fontFamily = 'Comfortaa', 'cursive';\r\n");
      out.write("        label.style.fontSize = \"12px\";\r\n");
      out.write("        if(i === 0){\r\n");
      out.write("            label.textContent = \"Email\";\r\n");
      out.write("        }\r\n");
      out.write("        else if(i === 1){\r\n");
      out.write("            label.textContent = \"Contact number\";\r\n");
      out.write("        }\r\n");
      out.write("        else if(i === 2){\r\n");
      out.write("            label.textContent = \"Username\";\r\n");
      out.write("        }\r\n");
      out.write("        else if(i === 3){\r\n");
      out.write("            label.textContent = \"Password\";\r\n");
      out.write("        }\r\n");
      out.write("        else if(i === 4){\r\n");
      out.write("            label.textContent = \"Confirm Password\";\r\n");
      out.write("        }\r\n");
      out.write("        // label ...\r\n");
      out.write("\r\n");
      out.write("        // input tag ...\r\n");
      out.write("        let input = document.createElement(\"input\");\r\n");
      out.write("        input.setAttribute(\"type\", \"text\");\r\n");
      out.write("        input.classList.add(\"form-control\", \"border-bottom\", \"border-0\", \"mb-4\");\r\n");
      out.write("        input.id = \"formGroupExampleInput\";\r\n");
      out.write("        input.style.borderBottomWidth = \"4px\";\r\n");
      out.write("        input.style.fontSize = \"13px\";\r\n");
      out.write("        input.style.fontFamily = 'Comfortaa', 'cursive';\r\n");
      out.write("        // <i class=\"fa-solid fa-user p-4 sideBarIcon\"></i>\r\n");
      out.write("        // input tag ...\r\n");
      out.write("        \r\n");
      out.write("        let icon;\r\n");
      out.write("\r\n");
      out.write("        if (i === 0) {\r\n");
      out.write("        	\r\n");
      out.write("            // icon \r\n");
      out.write("            icon = document.createElement(\"i\");\r\n");
      out.write("            icon.classList.add(\"fas\", \"fa-user\", \"p-4\");\r\n");
      out.write("            input.appendChild(icon);\r\n");
      out.write("            input.placeholder = \"Type email id\";\r\n");
      out.write("            input.id = \"email\";\r\n");
      out.write("            input.name = \"email\";\r\n");
      out.write("            // icon \r\n");
      out.write("            \r\n");
      out.write("        } else if (i === 1) {\r\n");
      out.write("        	\r\n");
      out.write("            input.placeholder = \"Type contact number\";\r\n");
      out.write("            input.id = \"contact\";\r\n");
      out.write("            input.setAttribute(\"maxlength\", \"10\");\r\n");
      out.write("            input.name = \"contact\";\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        else if (i === 2) {\r\n");
      out.write("        	\r\n");
      out.write("            input.placeholder = \"Type username\";\r\n");
      out.write("            input.id = \"username\";\r\n");
      out.write("            input.name = \"username\";\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        else if (i === 3) {\r\n");
      out.write("        	\r\n");
      out.write("            input.placeholder = \"Type Password\";\r\n");
      out.write("            input.id = \"password\";\r\n");
      out.write("            input.setAttribute(\"maxlength\", \"10\");\r\n");
      out.write("            input.name = \"password\";\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        else if(i === 4){\r\n");
      out.write("        	\r\n");
      out.write("            input.placeholder = \"Confirm Password\";\r\n");
      out.write("            input.id = \"confirm_password\";\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        /* append form element */\r\n");
      out.write("        form.appendChild(label);\r\n");
      out.write("        form.appendChild(input);\r\n");
      out.write("        /* append form element */\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    // login button inside sinup form \r\n");
      out.write("    let signupButton = document.createElement(\"button\");\r\n");
      out.write("    signupButton.classList.add(\"btn\", \"btn-outline-primary\");\r\n");
      out.write("    signupButton.style.width = \"97%\";\r\n");
      out.write("    signupButton.textContent = \"SIGNUP\";\r\n");
      out.write("    signupButton.id = \"signup_button\";\r\n");
      out.write("    form.appendChild(signupButton);\r\n");
      out.write("    container.appendChild(form);\r\n");
      out.write("    document.body.appendChild(container);\r\n");
      out.write("    \r\n");
      out.write("    /* click event on signup button - validate all input fields... */\r\n");
      out.write("    signupButton.addEventListener('click', function(event) {\r\n");
      out.write("    	\r\n");
      out.write("        event.preventDefault(); // Prevent the default form submission\r\n");
      out.write("        \r\n");
      out.write("        let ans = validateInputFields();\r\n");
      out.write("        if(ans == true){\r\n");
      out.write("        	console.log(\"yes\");\r\n");
      out.write("        	\r\n");
      out.write("			/* submit - signup form */\r\n");
      out.write("			\r\n");
      out.write("			let user = send_User_Signup_Info();\r\n");
      out.write("			sendAjaxRequest('user_signup', 'post', 'json', user);\r\n");
      out.write("			form.remove();\r\n");
      out.write("			container.remove();\r\n");
      out.write("			/* submit - signup form */\r\n");
      out.write("        	\r\n");
      out.write("        }\r\n");
      out.write("        else\r\n");
      out.write("        	console.log(\"NO\");\r\n");
      out.write("        \r\n");
      out.write("      });\r\n");
      out.write("    /* click event on signup button - validate all input fields... */\r\n");
      out.write("\r\n");
      out.write(" 	// login button inside sinup form\r\n");
      out.write(" 	\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("/*open signup form after clicking on signupButton...*/\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* open loginForm... */\r\n");
      out.write("function openLoginForm(){\r\n");
      out.write("	\r\n");
      out.write("	// create a div of full viewPort size...\r\n");
      out.write("    createFullViewPortSizedContainerForLoginAndSignupFor();\r\n");
      out.write("	\r\n");
      out.write("	/* create login form... */\r\n");
      out.write("	let form = document.createElement(\"form\");\r\n");
      out.write("    form.classList.add(\"p-4\", \"rounded\", \"shadow\");\r\n");
      out.write("    form.style.backgroundColor = \"rgb(255,255,255)\";\r\n");
      out.write("    form.style.height = \"57vh\";\r\n");
      out.write("    form.style.width = \"25vw\";\r\n");
      out.write("    /* create login form... */\r\n");
      out.write("    \r\n");
      out.write("    /* create heading of login form... */\r\n");
      out.write("    let heading = document.createElement(\"h3\");\r\n");
      out.write(" 	let icon = document.createElement(\"i\");\r\n");
      out.write(" 	icon.classList.add(\"fa-solid\", \"fa-right-to-bracket\");\r\n");
      out.write(" 	icon.style.marginRight = \"10px\";\r\n");
      out.write(" 	heading.innerHTML = \"LOGIN\";\r\n");
      out.write(" 	heading.prepend(icon);\r\n");
      out.write("    \r\n");
      out.write("    heading.classList.add(\"text-dark\", \"text-center\", \"mb-5\");\r\n");
      out.write("    heading.style.fontWeight = \"800\";\r\n");
      out.write("    form.appendChild(heading);\r\n");
      out.write("    /* create heading of login form... */\r\n");
      out.write("    \r\n");
      out.write("    for(let i = 0 ; i < 2 ; i++){\r\n");
      out.write("    	\r\n");
      out.write("    	/* label... */\r\n");
      out.write("    	let label = document.createElement(\"label\");\r\n");
      out.write("        label.classList.add(\"form-label\");\r\n");
      out.write("        label.style.marginLeft = \"13px\";\r\n");
      out.write("        label.style.fontFamily = 'Comfortaa', 'cursive';\r\n");
      out.write("        label.style.fontSize = \"12px\";\r\n");
      out.write("    	/* label... */\r\n");
      out.write("    	\r\n");
      out.write("    	 // input tag ...\r\n");
      out.write("        let input = document.createElement(\"input\");\r\n");
      out.write("        input.setAttribute(\"type\", \"text\");\r\n");
      out.write("        input.classList.add(\"form-control\", \"border-bottom\", \"border-0\", \"mb-5\");\r\n");
      out.write("        input.style.borderBottomWidth = \"4px\";\r\n");
      out.write("        input.style.fontSize = \"13px\";\r\n");
      out.write("        input.style.fontFamily = 'Comfortaa', 'cursive';\r\n");
      out.write("     	// input tag ...\r\n");
      out.write("     \r\n");
      out.write("    	if(i == 0){\r\n");
      out.write("    		\r\n");
      out.write("            input.id = \"username\";\r\n");
      out.write("            label.setAttribute(\"for\", \"username\");\r\n");
      out.write("			label.innerHTML = 'Username';\r\n");
      out.write("			input.placeholder = \"Type username\";\r\n");
      out.write("            \r\n");
      out.write("    	}\r\n");
      out.write("    	else if(i == 1){\r\n");
      out.write("    		\r\n");
      out.write("    		input.id = \"password\";\r\n");
      out.write("            label.setAttribute(\"for\", \"password\");\r\n");
      out.write(" 			label.innerHTML = 'Password'\r\n");
      out.write(" 			input.placeholder = \"Type password\";\r\n");
      out.write(" 			input.setAttribute(\"maxLength\", \"10\");\r\n");
      out.write(" 			\r\n");
      out.write("    	}\r\n");
      out.write("    	\r\n");
      out.write("     	/* form me label and input ele insert kar do... */\r\n");
      out.write("    	form.appendChild(label);\r\n");
      out.write("    	form.appendChild(input);\r\n");
      out.write("    	/* form me label and input ele insert kar do... */\r\n");
      out.write("    	\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    /* create Login button... */\r\n");
      out.write("    let loginButton = document.createElement(\"button\");\r\n");
      out.write("    loginButton.classList.add(\"btn\", \"btn-outline-primary\");\r\n");
      out.write("    loginButton.style.width = \"97%\";\r\n");
      out.write("    loginButton.textContent = \"LOGIN\";\r\n");
      out.write("    loginButton.id = \"login_button\";\r\n");
      out.write("    form.appendChild(loginButton);\r\n");
      out.write("    /* create Login button... */\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    container.appendChild(form);\r\n");
      out.write("    document.body.appendChild(container);\r\n");
      out.write("    \r\n");
      out.write("    /* agar user login button par click karta hai to... */\r\n");
      out.write("    \r\n");
      out.write("    loginButton.addEventListener('click', function(event){\r\n");
      out.write("    	\r\n");
      out.write("    	 event.preventDefault(); \r\n");
      out.write("    	 let user = send_User_Login_Info();\r\n");
      out.write("    	 sendAjaxRequest('user_login', 'post', 'json', user);\r\n");
      out.write("    	\r\n");
      out.write("    	\r\n");
      out.write("    });\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("    /* agar user login button par click karta hai to... */\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("/* open loginForm... */\r\n");
      out.write("\r\n");
      out.write("/* get object - user - info at Signup */\r\n");
      out.write("function send_User_Signup_Info(){\r\n");
      out.write("	let user = {\r\n");
      out.write("		email : document.getElementById(\"email\").value,\r\n");
      out.write("		contact : document.getElementById(\"contact\").value,\r\n");
      out.write("		username : document.getElementById(\"username\").value,\r\n");
      out.write("		password : document.getElementById(\"password\").value\r\n");
      out.write("	};\r\n");
      out.write("	return user;\r\n");
      out.write("}\r\n");
      out.write("/* get object - user - info at Signup */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* get object - user - info at login */\r\n");
      out.write("function send_User_Login_Info(){\r\n");
      out.write("	let user = {\r\n");
      out.write("		username : document.getElementById(\"username\").value,\r\n");
      out.write("		password : document.getElementById(\"password\").value\r\n");
      out.write("	};\r\n");
      out.write("	return user;\r\n");
      out.write("}\r\n");
      out.write("/* get object - user - info at login */\r\n");
      out.write("\r\n");
      out.write("function validateInputFields(){\r\n");
      out.write("	\r\n");
      out.write("	console.log(validateEmailId(), validateContactNumber(), validatePassword(), matchConfPassword());\r\n");
      out.write("	if(validateEmailId() == true && validateContactNumber() == true && validatePassword() == true && matchConfPassword() == true){\r\n");
      out.write("		return true;\r\n");
      out.write("	}\r\n");
      out.write("	return false;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* validate email id */\r\n");
      out.write("function validateEmailId(){\r\n");
      out.write("	return true;\r\n");
      out.write("}\r\n");
      out.write("/* validate email id */\r\n");
      out.write("\r\n");
      out.write("/* validate contact number */\r\n");
      out.write("function validateContactNumber(){\r\n");
      out.write("	let contact = document.getElementById(\"contact\");\r\n");
      out.write("	\r\n");
      out.write("	if(contact.value.length == 10){\r\n");
      out.write("		\r\n");
      out.write("		/* check karo - contact.value - is number or not */\r\n");
      out.write("		let isNot_Number = isNaN(contact.value);\r\n");
      out.write("		\r\n");
      out.write("		if(isNot_Number == false){\r\n");
      out.write("			return true;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		else{\r\n");
      out.write("			Swal.fire(\r\n");
      out.write("    		  'Dear User!',\r\n");
      out.write("    		  'Invalid Contact',\r\n");
      out.write("    		  'error'\r\n");
      out.write("    		)\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("		/* check karo - contact.value - is number or not */\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("	else\r\n");
      out.write("		return false;\r\n");
      out.write("}\r\n");
      out.write("/* validate contact number */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* validatePassword */\r\n");
      out.write("function validatePassword(){\r\n");
      out.write("	return true;\r\n");
      out.write("}\r\n");
      out.write("/* validatePassword */	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("/* compare password and confirm password */\r\n");
      out.write("function matchConfPassword(){\r\n");
      out.write("	\r\n");
      out.write("	if(document.getElementById(\"confirm_password\").value == document.getElementById(\"password\").value){\r\n");
      out.write("		console.log(\"jbhjbjh\");\r\n");
      out.write("		return true;\r\n");
      out.write("	}\r\n");
      out.write("	else{\r\n");
      out.write("		Swal.fire(\r\n");
      out.write("   		  'Dear User!',\r\n");
      out.write("   		  'Confirm Password, Not Matched',\r\n");
      out.write("   		  'error'\r\n");
      out.write("   		)\r\n");
      out.write("   		return false;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("/* compare password and confirm password */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* sendAjaxRequest */\r\n");
      out.write("function sendAjaxRequest(url, method, dataType, info){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		  url : url,\r\n");
      out.write("		  method : method,\r\n");
      out.write("		  dataType : dataType,\r\n");
      out.write("		  data : info,\r\n");
      out.write("		  success: function(response) {\r\n");
      out.write("		   \r\n");
      out.write("			  \r\n");
      out.write("			console.log(response.source, \" and \", response.result);\r\n");
      out.write("			\r\n");
      out.write("			/* agar response user_signup servlet se aaya hai... */\r\n");
      out.write("			if(response.source == \"user_signup\") {\r\n");
      out.write("				\r\n");
      out.write("				/* show a successfull signup message to user */\r\n");
      out.write("			    Swal.fire(\r\n");
      out.write("	    		  'Dear User!',\r\n");
      out.write("	    		  'Signup successfull',\r\n");
      out.write("	    		  'success'\r\n");
      out.write("	    		)\r\n");
      out.write("	    		/* show a successfull signup message to user */\r\n");
      out.write("				\r\n");
      out.write("			}\r\n");
      out.write("			/* agar response user_signup servlet se aaya hai... */\r\n");
      out.write("			\r\n");
      out.write("			/* agar response user_login servlet se aaya hai... */\r\n");
      out.write("			else if(response.source == \"user_login\") {\r\n");
      out.write("				\r\n");
      out.write("				/* ADMIN */\r\n");
      out.write("				if(response.result == \"admin\"){\r\n");
      out.write("					Swal.fire(\r\n");
      out.write("		    		  'Dear Admin!',\r\n");
      out.write("		    		  'Login successfull',\r\n");
      out.write("		    		  'success'\r\n");
      out.write("		    		)\r\n");
      out.write("		    		\r\n");
      out.write("				}\r\n");
      out.write("				/* ADMIN */\r\n");
      out.write("				\r\n");
      out.write("				/* USER */\r\n");
      out.write("				else if(response.result == \"user\"){\r\n");
      out.write("					Swal.fire(\r\n");
      out.write("		    		  'Dear User!',\r\n");
      out.write("		    		  'Login successfull',\r\n");
      out.write("		    		  'success'\r\n");
      out.write("		    		)\r\n");
      out.write("				}\r\n");
      out.write("				/* USER */\r\n");
      out.write("				\r\n");
      out.write("				/* doesn't exist */\r\n");
      out.write("				else if(response.result == \"none\"){\r\n");
      out.write("					Swal.fire(\r\n");
      out.write("		    		  'Dear User!',\r\n");
      out.write("		    		  'Login Failed',\r\n");
      out.write("		    		  'error'\r\n");
      out.write("		    		)\r\n");
      out.write("				}\r\n");
      out.write("				/* doesn't exist */\r\n");
      out.write("\r\n");
      out.write("			}\r\n");
      out.write("			/* agar response user_login servlet se aaya hai... */\r\n");
      out.write("			\r\n");
      out.write("\r\n");
      out.write("		  },\r\n");
      out.write("		  error: function(xhr, status, error) {\r\n");
      out.write("		    console.log('An error occurred index.jsp: ' + error);\r\n");
      out.write("		  }\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("/* sendAjaxRequest */\r\n");
      out.write("</script>\r\n");
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
