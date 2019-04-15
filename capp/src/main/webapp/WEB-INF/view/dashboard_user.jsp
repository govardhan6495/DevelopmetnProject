<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Dashboard - Contact Application </title>
         <s:url var="url_css" value="resources/css/style.css"/>
        <link href="${url_css}" rel="stylesheet" type="text/css"/>
    </head>
    <s:url var="url_bg" value="resources/images/bg.jpg"/>
    <body background="${url_bg}">
        <table border="1" width="80%" align="center">
            <tr>
                <td height="80px">
                    <%-- Header --%>
                    <jsp:include page="common/header.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="25px">
                     <%-- Menu --%>
                     <jsp:include page="common/menu.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="350px" valign="top">
                     <%-- Page Content Area--%>
                     <h1>User Dashboard</h1>
                      TODO : User Options in this page
                </td>
            </tr>
             <tr>
                <td height="25px">
                     <%-- Footer --%>
                     <jsp:include page="common/footer.jsp"/>
                </td>
            </tr>
        </table>
    </body>
</html>
