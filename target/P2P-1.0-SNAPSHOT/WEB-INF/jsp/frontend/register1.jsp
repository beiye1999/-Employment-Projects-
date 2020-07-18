<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>p2p网贷平台</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="${pageContext.request.contextPath }/static/layui/css/layui.css">
<link href="${pageContext.request.contextPath }/static/css/common.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath }/static/css/register.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="public/header.jsp"/>

<!--注册-->
<div class="wrap">
  <div class="tdbModule register">
    <div class="registerTitle">注册账户</div>
    <div class="registerLc3">
      <p class="p1">填写账户信息</p>
      <p class="p2">验证手机信息</p>
      <p class="p3">注册成功</p>
    </div>
    <div class="registerCont">
      <ul>
          <li class="scses">    ${sessionScope.username}， 恭喜您注册成功！<p>建议您登录后开通双乾支付账户,即可投资！</p>
              <hr class="layui-bg-orange"></li>
        <li class="rz" style="text-align: center"><a href="login.html" class="btn">立即登录</a></li>
      </ul>
    </div>
  </div>
</div>

<!--网站底部-->
<jsp:include page="public/foot.jsp"/>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/script/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/script/common.js"></script>
</body>
</html>
