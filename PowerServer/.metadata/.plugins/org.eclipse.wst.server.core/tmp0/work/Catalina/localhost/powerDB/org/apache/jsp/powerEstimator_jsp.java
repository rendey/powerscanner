/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2013-07-20 12:54:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public final class powerEstimator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>PowerScanner Transmitted DB</title>\r\n");
      bean.powerDAO dao = null;
      dao = (bean.powerDAO) _jspx_page_context.getAttribute("dao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dao == null){
        dao = new bean.powerDAO();
        _jspx_page_context.setAttribute("dao", dao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      bean.powerDTO dto = null;
      dto = (bean.powerDTO) _jspx_page_context.getAttribute("dto", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dto == null){
        dto = new bean.powerDTO();
        _jspx_page_context.setAttribute("dto", dto, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("dto"), request);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

	String save = application.getRealPath("/Power_Scanner");
	int size = 10*1024*1024;
	try{		
		MultipartRequest multi = new MultipartRequest(request,null,size,"utf-8",new DefaultFileRenamePolicy());

		dto.setPackagename(new String(multi.getParameter("packagename").getBytes("UTF-8"),"iso-8859-1"));
		dto.setTotal(Integer.parseInt(new String(multi.getParameter("total").getBytes("UTF-8"),"iso-8859-1")));
		dto.setLed(Integer.parseInt(new String(multi.getParameter("led").getBytes("UTF-8"),"iso-8859-1")));
		dto.setCpu(Integer.parseInt(new String(multi.getParameter("cpu").getBytes("UTF-8"),"iso-8859-1")));
		dto.setWifi(Integer.parseInt(new String(multi.getParameter("wifi").getBytes("UTF-8"),"iso-8859-1")));
		dto.setThreeg(Integer.parseInt(new String(multi.getParameter("threeg").getBytes("UTF-8"),"iso-8859-1")));
		dto.setGps(Integer.parseInt(new String(multi.getParameter("gps").getBytes("UTF-8"),"iso-8859-1")));
		dto.setAudio(Integer.parseInt(new String(multi.getParameter("audio").getBytes("UTF-8"),"iso-8859-1")));

	}catch(Exception e){
		//e.printStackTrace();
	}
	dao.inputPower(dto);

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
