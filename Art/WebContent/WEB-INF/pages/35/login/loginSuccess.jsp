<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入成功</title>
</head>
<style>
.welcome{
	text-align: center;
}
</style>
<body>
<div class="welcome">
<h1>${sessionScope.member.getName()}</h1>
<h2>猜您想看這些活動</h2>
</div>
</body>
</html>