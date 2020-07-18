<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>p2p网贷平台重置密码</title>
    <link href="${pageContext.request.contextPath }/static/layui/css/layui.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/static/css/common.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath }/static/css/register.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="public/header.jsp"/>
<!--注册-->
<div class="wrap">
    <form class="layui-form" id="passFrom">
        <div class="tdbModule loginPage">
            <div class="registerTitle" style="font-size: 22px">重置方式:通过短信验证码验证重置</div>
            <div class="registerCont">
                <ul>
                    <li>
                        <span class="dis">手机号码:</span><input class="input"  type="text" onchange="checkingPass()" name="uphonenumber"  id="phone" maxlength="11" tabindex="1" autocomplete="off">
                        <span id="user-phone-label" data-info=""></span>
                    </li>
                    <li>
                        <span class="dis">短信验证码:</span><input type="text"  id="verifyCode" style="width:166px;" class="input" name="code" data-msg="验证码" maxlength="6" tabindex="1" autocomplete="off">
                        <input  class="layui-btn layui-btn-radius" type="button" value="获取验证码" id="sendPhones">
                        <span id="code-label"  data-info=""></span>
                    </li>
                    <li>
                        <span class="dis">密码：</span><input class="input" onchange="checkingPass()" placeholder="以字母开头，长度在6~10之间" type="password" name="upassword" id="pass" maxlength="10" tabindex="1" autocomplete="off">
                        <span id="user-upass-label" data-info=""></span>
                    </li>
                    <li>
                        <span class="dis">确认密码：</span><input class="input" onchange="checkingPass()" placeholder="以字母开头，长度在6~10之间" type="password" name="repasswords" id="repass" maxlength="10" tabindex="1" autocomplete="off">
                        <span id="user-repass-label" data-info=""></span>
                    </li>
                    <li class="btn">
                        <button class="layui-btn layui-btn-lg layui-btn-radius" id="reset">重置</button>
                        <button class="layui-btn layui-btn-lg layui-btn-radius" id="return">返回</button>
                    </li>
                </ul>
            </div>
        </div>
    </form>
</div>
<%--找回密码的表单--%>
<!--网站底部-->
<jsp:include page="public/foot.jsp"/>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/script/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/script/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/script/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/login.js"></script>
</body>
</html>
