<%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2020/7/13
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>P2P头部模块</title>
</head>
<body>
    <div class="header-top min-width">
        <div class="container fn-clear"> <strong class="fn-left">咨询热线：183 193 42 799<span class="s-time">服务时间：9:00 - 18:00</span></strong>
            <ul class="header_contact">
                <li class="c_1"> <a class="ico_head_weixin" id="wx"></a>
                    <div class="ceng" id="weixin_xlgz" style="display: none;">
                        <div class="cnr"> <img src="${pageContext.request.contextPath }/static/images/code.png"> </div>
                        <b class="ar_up ar_top"></b> <b class="ar_up_in ar_top_in"></b> </div>
                </li>
                <li class="c_2"><a href="#" target="_blank" title="官方QQ" alt="官方QQ"><b class="ico_head_QQ"></b></a></li>
                <li class="c_4"><a href="#" target="_blank" title="新浪微博" alt="新浪微博"><b class="ico_head_sina"></b></a></li>
            </ul>
            <ul class="fn-right header-top-ul">
                <li> <a href="index.html" class="app">返回首页</a> </li>
                <li>
                    <div class=""><a href="register.html" class="c-orange" title="免费注册">免费注册</a></div>
                </li>
                <li>
                    <div class=""><a href="login.html" class="js-login" title="登录">登录</a></div>
                </li>
            </ul>
        </div>
    </div>
    <div class="header min-width">
        <div class="container">
            <div class="fn-left logo"> <a class="" href="../index.jsp"> <img src="${pageContext.request.contextPath }/static/images/logo.png" title=""> </a> </div>
            <ul class="top-nav fn-clear">
                <li class="on"> <a href="index.html">首页</a> </li>
                <li> <a href="list.html" class="">我要投资</a> </li>
                <li> <a href="帮助中心.html">安全保障</a> </li>
                <li class="top-nav-safe"> <a href="个人中心首页.html">我的账户</a> </li>
                <li> <a href="公司简介.html">关于我们</a> </li>
            </ul>
        </div>
    </div>
</body>
</html>
