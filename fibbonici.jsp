<%-- 
    Document   : convert
    Created on : 4 Apr, 2021, 7:42:45 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="fibbonici" method="post">
            <input type="text" name="txtnum" placeholder="enter number"/>
            <br>
            <input type="submit" name="btnsubmit" value="fabbonici sereis"/>
            <br>
            
        </form>
        <P>
            <%
            if(request.getParameter("q")!=null)
            {
                out.print(request.getParameter("q")) ;
            }
            %></p>
    </body>
</html>
