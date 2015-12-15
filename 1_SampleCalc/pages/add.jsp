<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:html>
  <head>
    <title>Add</title>
  </head>
  <html:form action="/add">
    <table border="0">
      入力画面
      <tr><td>
      <br>
        <html:text property="num1" size="20" maxlength="30" />
        ＋
        <html:text property="num2" size="20" maxlength="30" />
      </td></tr>
      <tr><td>
        <html:submit value="OK" />
      </td></tr>
    </table>
  </html:form>
</html:html>
