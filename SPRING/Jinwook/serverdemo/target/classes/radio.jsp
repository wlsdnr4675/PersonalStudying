<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>서블릿</title>
    </head>
    <body>
        <form method="GET" action="RadioServlet">
            <label for="gender">SEX</label> 
            <input type="radio" id="gender" name="gender" value="Male" checked> Male
            <input type="radio" id="gender" name="gender" value="Female"> Female<br>
            <label for="chk_mail">메일정보수신여부:</label>
            <input type="radio" name="chk_mail" id="chk_mail" value="yes" checked> admit
            <input type="radio" name="chk_mail" id="chk_mail" value="no"> deny <br>
            <label for="content"> 가입 인사</label><br>
            <textarea name="content" id="content" cols="35" rows="3"></textarea><br>
            <input type="submit" value="전송">
            
        </form>
    </body>
</html>