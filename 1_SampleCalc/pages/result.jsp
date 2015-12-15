<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:html>
  <head>
    <title>Result</title>
  </head>
    <table border="0">
      <tr><td>
      結果画面
      <tr><td>
      <bean:write name="AddForm" property="result" />
      </td></tr>
    </table>
</html:html>
