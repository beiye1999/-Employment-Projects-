<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>p2p网贷平台</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="${pageContext.request.contextPath }/static/layui/css/layui.css" type="text/css" rel="stylesheet"/>
<link href="${pageContext.request.contextPath }/static/css/common.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath }/static/css/register.css" rel="stylesheet" type="text/css">
</head>
<body>
    <%--引入头部页面--%>
    <jsp:include page="public/header.jsp"/>
<!--注册-->
<div class="wrap">
  <div class="tdbModule register">
    <div class="registerTitle">注册账户</div>
    <div class="registerLc1">
      <p class="p1">填写账户信息</p>
      <p class="p2">验证手机信息</p>
      <p class="p3">注册成功</p>
    </div>
    <div class="registerCont">
      <ul>
        <li><span class="dis">用户名:</span>
          <input type="text" onchange="validata_add_form()" name="unickname" id="userName" class="input _userName" maxlength="16" tabindex="1">
          <span id="userNameAlt"></span>
        </li>

        <li><span class="dis">密码:</span>
          <input type="password" onchange="validata_add_form()" name="upassword" id="password" class="input _password" maxlength="10" tabindex="1">
          <span id="passwordAlt" ></span>
        </li>

        <li><span class="dis">确认密码:</span>
          <input type="password" onchange="validata_add_form()" name="repeatPassword" id="repeatPassword" class="input _repeatPassword" maxlength="10" tabindex="1">
          <span id="repeatPasswordAlt"></span>
        </li>

        <li class="telNumber"> <span class="dis">手机号码:</span>
          <input type="text" onchange="validata_add_form()" class="input _phoneNum" id="phone" name="uphonenumber" tabindex="1" maxlength="11">
          <input  class="layui-btn layui-btn-radius" type="button" value="获取验证码" id="sendPhone">
          <span id="phoneJy"></span>
        </li>

        <li class="telNumber"><span class="dis">短信验证码:</span>
          <input id="phonVerify" onchange="validata_add_form()" type="text" class="input input1  _phonVerify" maxlength="6" data-_id="phonVerify" tabindex="1">
          <span class="info" id="phonVerifys"></span>
        </li>

        <li> <span class="dis">推 荐 人:</span>
          <input type="text" id="invist" onchange="validata_add_form()" class="input input1 _invist" name="ureferrer">
          <span class="_invist_msg">请填写推荐人账户名，如无推荐人请留空</span></li>

        <li class="agree">
          <input name="protocol" onchange="validata_add_form()" id="protocol" type="checkbox" value="" checked="checked">
          我同意《<a href="#" target="_black">亿人宝注册协议</a>》 <span id="protocolAlt" data-info="请查看协议">请查看协议</span></li>

        <li class="btn"><button class="layui-btn layui-btn-lg layui-btn-radius" id="register">下一步</button></li>
      </ul>
    </div>
  </div>
</div>

    <%--引入底部模块--%>
    <jsp:include page="public/foot.jsp"/>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/script/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/script/jquery.cookie.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/script/common.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/register.js"></script>
</body>
</html>
