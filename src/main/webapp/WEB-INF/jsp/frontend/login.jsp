<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>p2p网贷平台登录页面</title>
    <link href="${pageContext.request.contextPath }/static/layui/css/layui.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/static/css/common.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath }/static/css/register.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="public/header.jsp"/>
<!--注册-->
<div class="wrap">
 <form id="LonginForm" name="LonginForm" action="" method="post">
	<div class="tdbModule loginPage">
		<div class="registerTitle">用户登录</div>
            <div class="registerCont">
                <ul>
                    <li>
                        <span class="dis">用户名：</span><input class="input" type="text" onchange="verifyNamePass()" placeholder="2-5位中文或者是6-16位英文和数字组合" name="j_username" id="userName" maxlength="16" tabindex="1" autocomplete="off">
                        <span id="user-name-label" data-info=""></span>
                    </li>
                    <li>
                       <span class="dis">密码：</span><input class="input" type="password" onchange="verifyNamePass()" placeholder="字母开头，长度在6~10之间" name="password" id="password" maxlength="10" tabindex="1" autocomplete="off">
                        <span id="user-pass-label" data-info=""></span>
                    </li>
                    <li>
                      <span class="dis">验证码：</span><input type="text"  id="pVerifyCode" onchange="verifyNamePass()" style="width:135px;" class="input" name="yzm" data-msg="验证码" maxlength="4" tabindex="1" autocomplete="off">
                        <a href="javascript:void(0)" id="captcha" style="color: mediumslateblue"> <img src="/kaptcha"  style="cursor:pointer;" class="valign">&nbsp;看不清</a>
                        <span id="user-code-label" data-info=""></span>
                    </li>
                    <li class="btn">
                        <button class="layui-btn layui-btn-lg layui-btn-radius" id="login">登录</button>
                        <button class="layui-btn layui-btn-lg layui-btn-radius" id="forgetPass">忘记密码？</button>
                    </li>
                </ul>
            </div>
	</div>
 </form>
</div>
<!--网站底部-->
<jsp:include page="public/foot.jsp"/>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/script/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/script/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/script/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/login.js"></script>
</body>
</html>
