<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C/DTD HTML 4.01 Transitional//EN" "http://www.w3.org/Transitional">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html ; carset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <form method="get" action="LoginServlet">
            <label for="userId">아이디: </label>
            <input type="text" name="id" id="userid"><br>
            <label for="userpwd">암 &nbsp; 호 : </label>
            <input type="password" name="pwd" id="userpwd"><br>
            <input type="submit" value="로그인">
        </form>
    </body>
</html>