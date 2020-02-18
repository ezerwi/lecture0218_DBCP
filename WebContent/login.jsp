<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 화면</title>
</head>
<body>

<h1>로그인</h1>

<p>
<INPUT TYPE = "TEXT" NAME = "id" placeholder="아이디를 입력하세요" required="required" />
<INPUT TYPE = "PASSWORD" NAME = "pw" required="required" /> </p>
<INPUT TYPE = "submit" VALUE = "LOG-IN" /> &nbsp;&nbsp;&nbsp;
<INPUT TYPE = "RESET" VALUE = "CANCEL" /> &nbsp;&nbsp;&nbsp;
<INPUT TYPE = "BUTTON" VALUE = "회원가입" ONCLICK = "location.href = 'join'" />

</body>
</html>