/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-30 13:28:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.center.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class commonFooterJS_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/respond.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/excanvas.min.js\"></script> \n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/ie8.fix.min.js\"></script> \n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("<!-- 上下文对象路径 -->\n");
      out.write("<input type=\"hidden\" id=\"hdnContextPath\" name=\"hdnContextPath\" value=\"");
      out.print(request.getContextPath() );
      out.write("\"/>\n");
      out.write("<input type=\"hidden\" id=\"apiServer\" name=\"apiServer\" value=\"http://192.168.1.2:8081\"/> \n");
      out.write("<input type=\"hidden\" id=\"bgmServer\" name=\"bgmServer\" value=\"http://192.168.1.2:8080/mvc\"/>\n");
      out.write("<!-- <input type=\"hidden\" id=\"apiServer\" name=\"apiServer\" value=\"http://imoocdsp.com/imooc-video-mini-api\"/> -->\n");
      out.write("<!-- <input type=\"hidden\" id=\"bgmServer\" name=\"bgmServer\" value=\"http://118.24.157.179/mvc\"/> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- BEGIN CORE PLUGINS -->\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/jquery.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/bootstrap/js/bootstrap.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/js.cookie.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/morris/morris.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/jquery-validation/js/jquery.validate.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/jquery-validation/js/additional-methods.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("<!-- BEGIN THEME GLOBAL SCRIPTS -->\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/scripts/app.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<!-- END THEME GLOBAL SCRIPTS -->\n");
      out.write("<!-- BEGIN PAGE LEVEL SCRIPTS -->\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/jquery.form.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/pages/scripts/form-validation.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/bootstrap-sweetalert/sweetalert.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/Guriddo_jqGrid_JS_5.2.0/js/i18n/grid.locale-cn.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/Guriddo_jqGrid_JS_5.2.0/js/jquery.jqGrid.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- END PAGE LEVEL SCRIPTS -->\n");
      out.write("\n");
      out.write("<!-- BEGIN PAGE LEVEL SCRIPTS -->\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/pages/scripts/dashboard.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/pages/scripts/ui-sweetalert.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/pages/scripts/ui-blockui.min.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/icheck/icheck.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/pages/scripts/form-icheck.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/bootstrap-modal/js/bootstrap-modalmanager.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/bootstrap-modal/js/bootstrap-modal.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/file-uploader/js/vendor/jquery.ui.widget.js?v=3.1415926\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/global/plugins/file-uploader/js/jquery.fileupload.js?v=3.1415926\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- END PAGE LEVEL SCRIPTS -->\n");
      out.write("\n");
      out.write("<!-- BEGIN 自己写的页面JS -->\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/pages/js/commonJSFunction.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- END 自己写的页面JS -->\n");
      out.write("\n");
      out.write("<!-- BEGIN THEME LAYOUT SCRIPTS -->\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/layouts/layout/scripts/layout.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/layouts/layout/scripts/demo.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/layouts/global/scripts/quick-sidebar.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/static/layouts/global/scripts/quick-nav.js?v=3.1415926\" type=\"text/javascript\"></script>\n");
      out.write("<!-- END THEME LAYOUT SCRIPTS -->\n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
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
