<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>p2p网贷平台</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="css/common.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="css/user.css" />
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript" src="script/common.js"></script>
<script src="script/user.js" type="text/javascript"></script>
</head>
<body>
<header>
  <div class="header-top min-width">
    <div class="container fn-clear"> <strong class="fn-left">咨询热线：400-668-6698<span class="s-time">服务时间：9:00 - 18:00</span></strong>
      <ul class="header_contact">
        <li class="c_1"> <a class="ico_head_weixin" id="wx"></a>
          <div class="ceng" id="weixin_xlgz" style="display: none;">
            <div class="cnr"> <img src="images/code.png"> </div>
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
      <div class="fn-left logo"> <a class="" href="index.html"> <img src="images/logo.png"  title=""> </a> </div>
      <ul class="top-nav fn-clear">
        <li class="on"> <a href="index.html">首页</a> </li>
        <li> <a href="list.html" class="">我要投资</a> </li>
        <li> <a href="帮助中心.html">安全保障</a> </li>
        <li class="top-nav-safe"> <a href="个人中心首页.html">我的账户</a> </li>
        <li> <a href="公司简介.html">关于我们</a> </li>
      </ul>
    </div>
  </div>
</header>
<!--个人中心-->
<div class="wrapper wbgcolor">
  <div class="w1200 personal">
    <div class="credit-ad"><img src="images/clist1.jpg" width="1200" height="96"></div>
    <div id="personal-left" class="personal-left">
      <ul>
        <li class="pleft-cur"><span><a href="个人中心首页.html"><i class="dot dot1"></i>账户总览</a></span></li>
        <li><span><a style="font-size:14px;text-align:center;width:115px;padding-right:35px;" href="个人中心-资金记录 .html">资金记录</a></span></li>
        <li><span><a style="font-size:14px;text-align:center;width:115px;padding-right:35px;" href="个人中心-投资记录.html">投资记录</a></span></li>
        <li><span><a style="font-size:14px;text-align:center;width:115px;padding-right:35px;" href="个人中心-回款计划.html">回款计划</a></span></li>
        <li class=""><span><a href="个人中心-开通第三方1.html"><i class="dot dot02"></i>开通第三方</a> </span> </li>
        <li><span><a href="个人中心-充值1.html"><i class="dot dot03"></i>充值</a></span></li>
        <li class=""><span><a href="个人中心-提现1.html"><i class="dot dot04"></i>提现</a></span></li>
        <li style="position:relative;" class=""> <span> <a href="个人中心-我的红包.html"> <i class="dot dot06"></i> 我的红包 </a> </span> </li>
        <li class=""><span><a style="font-size:14px;text-align:center;width:115px;padding-right:35px;" href="个人中心-兑换历史.html">兑换历史</a></span></li>
        <li style="position:relative;"> <span> <a href="个人中心-系统消息.html"><i class="dot dot08"></i>系统信息 </a> </span> </li>
        <li><span><a href="个人中心-账户设置.html"><i class="dot dot09"></i>账户设置</a></span></li>
      </ul>
    </div>
    <div class="personal-main">
      <link rel="stylesheet" type="text/css" href="css/fileupload.less.css">
      <style type="text/css">
		.ui-fileupload-choose{
			background:none;
			width: 90px; height: 90px;
			border:0px none;
		}
		.ui-fileupload-choose input{
			width:100%;height:100%;
		}
		.ui-icon{
			background:none;
			width:0px;height:0px;
		} 
	</style>
      <div class="pmain-profile">
        <div class="pmain-welcome"> <span class="fl"><span id="outLogin">晚上好，</span>tg_gpdt0139 喝一杯下午茶，让心情放松一下~</span> <span class="fr">上次登录时间：
          2015-09-11 14:05:07 </span> </div>
        <div class="pmain-user">
          <div class="user-head"> <span id="clickHeadImage" class="head-img" title="点击更换头像">
            <form  method="post" action="">
              <input type="hidden" name="userPhotoUploadForm" value="userPhotoUploadForm">
              <span id="userPhotoUploadForm:photo"><img id="userPhotoUploadForm:photoImage" src="images/touxiang.png" alt="" style="width:88px;height:88px;z-index:0;"> <i class="headframe" style="z-index:0;"></i>-
              <div id="userPhotoUploadForm:shangchuan-btn" class="ui-fileupload ui-widget" style="z-index:0;">
                <div class="ui-fileupload-buttonbar ui-corner-top"><span class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-fileupload-choose" role="button"><span class="ui-button-icon-left ui-icon ui-c ui-icon-plusthick"></span><span class="ui-button-text ui-c"></span>
                  <input type="file" id="userPhotoUploadForm:shangchuan-btn_input" name="userPhotoUploadForm:shangchuan-btn_input" style="z-index:0;">
                  </span></div>
                <div class="ui-fileupload-content ui-widget-content ui-corner-bottom">
                  <table class="ui-fileupload-files">
                    <tbody>
                    </tbody>
                  </table>
                </div>
              </div>
              </span>
              <input type="hidden" name="javax.faces.ViewState" id="javax.faces.ViewState" value="2696547217205030168:-301641994240890871" autocomplete="off">
            </form>
            </span> <span class="head-icon"> <a href="#"><i title="第三方资金账户未认证" class="headiconbg headicon01"></i></a> <a href="#"><i class="headiconbg headicon2"></i></a> <a href="#"><i class="headiconbg headicon03"></i></a> </span> </div>
          <div class="user-info user-info1">
            <ul>
              <li>用户名<span>tg_gpdt0139</span></li>
              <li>安全级别<span><i class="safe-level"><i class="onlevel" style="width:40%;"></i></i></span> <a href="#">[低]</a></li>
              <li>您还未开通第三方支付账户，请 <a class="pmain-log" href="#">立即开通</a>以确保您的正常使用和资金安全。 </li>
            </ul>
          </div>
        </div>
        <div class="pmain-money">
          <ul>
            <li class="none"><span><em>账户总额</em><i id="zhze" class="markicon"></i><span class="arrow-show1" style="display:none;">可用余额+待收本息</span><span class="icon-show1" style="display:none;"></span></span> <span class="truemoney"><i class="f26 fb">0.00 </i> 元</span> </li>
            <li><span><em>待收本息</em><i id="dsbx" class="markicon"></i><span class="arrow-show2" style="display:none;">未到账的投资项目的本金、利息总额</span><span class="icon-show2" style="display:none;"></span></span> <span class="truemoney"><i class="f26 fb">0.00 </i>元</span> </li>
            <li><span><em>累计收益</em><i id="ljsy" class="markicon"></i><span class="arrow-show3" style="display: none;">已到账的投资收益+未到账的投资收益</span><span class="icon-show3" style="display: none;"></span></span> <span class="truemoney"><i class="f26 fb c-pink">0.00 </i> 元</span> </li>
          </ul>
        </div>
      </div>
      <script type="text/javascript">
			//<![CDATA[
			       $(function(){
			    	   $("#clickHeadImage").click(function(){
			    		   $(this).find('span').removeClass('ui-state-hover');
			    		   document.getElementById("userPhotoUploadForm:shangchuan-btn_input").click();
			    	   });
			    	   var safeLevel = "低";
			    	   if(safeLevel=="高"){
			    		   $(".pmain-user .user-info li .safe-level .onlevel").css("background-color","#f1483c");
			    	   }
			    	   
			    	   $("#clickHeadImage span").hover(function(){
			    		   $(this).removeClass('ui-state-hover');
			    	   });
			    	   
			    	   var myDate = new Date();
			    	   var h = myDate.getHours();
			    	   if(h>11 && h<19){
			    	   	 $("#outLogin").html("下午好，");
			    	   }else if(h>18){
			    	   	 $("#outLogin").html("晚上好，");
			    	   }else{
			    	   	 $("#outLogin").html("上午好，");
			    	   }
			       });
			//]]>           
		</script>
      <div class="pmain-connent">
        <div id="pmain-contab" class="pmain-contab">
          <ul>
            <li id="pmain-contab1" class="on">回款计划</li>
            <li id="pmain-contab2">资金记录</li>
            <li id="pmain-contab3">投资记录</li>
            <li class="li-other"></li>
          </ul>
        </div>
        <div class="pmain-conmain" id="pmain-conmain">
          <div class="pmain-conmain1">
            <div class="pmain-contitle"> <span class="pmain-titledate">计划回款时间</span><span class="pmain-titleproject">项目</span><span class="pmain-titletype">类型</span><span class="pmain-titlemoney">回款金额</span> </div>
            <ul style="float:left;">
              <li><span class="pmain-titledate">2015-10-20</span><span class="pmain-titleproject">宝马汽车借贷业务</span><span class="pmain-titletype">债权转让</span><span class="pmain-titlemoney">10.00</span></li>
              <li><span class="pmain-titledate">2015-10-20</span><span class="pmain-titleproject">宝马汽车借贷业务</span><span class="pmain-titletype">债权转让</span><span class="pmain-titlemoney">10.00</span></li>
              <li><span class="pmain-titledate">2015-10-20</span><span class="pmain-titleproject">宝马汽车借贷业务</span><span class="pmain-titletype">债权转让</span><span class="pmain-titlemoney">10.00</span></li>
              <li><span class="pmain-titledate">2015-10-20</span><span class="pmain-titleproject">宝马汽车借贷业务</span><span class="pmain-titletype">债权转让</span><span class="pmain-titlemoney">10.00</span></li>
              <li><span class="pmain-titledate">2015-10-20</span><span class="pmain-titleproject">宝马汽车借贷业务</span><span class="pmain-titletype">债权转让</span><span class="pmain-titlemoney">10.00</span></li>
              <li><span class="pmain-titledate">2015-10-20</span><span class="pmain-titleproject">宝马汽车借贷业务</span><span class="pmain-titletype">债权转让</span><span class="pmain-titlemoney">10.00</span></li>
              <!--<div style=" width:
										760px;height:200px;padding-top:100px; text-align:center;color:#d4d4d4; font-size:16px;">
										 <img src="images/nondata.png" width="60" height="60"><br><br>
										   暂无回款计划</div>-->
            </ul>
            <div class="pmain-morebtn" style="border-top:0;margin-top:0"></div>
          </div>
          <div class="pmain-conmain2" style=" display:none;">
            <div class="pmain-contitle"> <span class="pmain-titledate">交易时间</span><span class="pmain-w100">交易类型</span><span class="pmain-w120">交易金额</span><span class="pmain-w120">余额</span><span class="pmain-w200">备注</span> </div>
            <ul style="float:left;">
              <li><span class="pmain-titledate">2015-10-20</span><span class="pmain-w100">债权转让</span><span class="pmain-w120 pmain-money">10.00</span><span class="pmain-w120 pmain-money">10.00</span><span class="pmain-w200">备注</span></li>
              <!--<div style=" width:760px;height:200px;padding-top:100px; text-align:center;color:#d4d4d4; font-size:16px;">
										 <img src="images/nondata.png" width="60" height="60"><br><br>
										   暂无资金记录</div>-->
            </ul>
            <div class="pmain-morebtn" style="border-top:0;margin-top:0"></div>
          </div>
          <div class="pmain-conmain3" style=" display:none;">
            <div class="pmain-contitle"> <span class="pmain-titledate">交易时间</span><span class="pmain-w210">项目</span><span class="pmain-w80">状态</span><span class="pmain-whb200">我的投资</span><span class="pmain-whb110">我的收益</span> </div>
            <ul style="float:left;">
              <li><span class="pmain-titledate">2015-10-20</span><span class="pmain-w210">债权转让</span><span class="pmain-w80 pmain-money">10.00</span><span class="pmain-whb200 pmain-money">10.00</span><span class="pmain-whb110">备注</span></li>
              <!--	<div style=" width:760px;height:200px;padding-top:100px; text-align:center;color:#d4d4d4; font-size:16px;">
										    <img src="images/nondata.png" width="60" height="60"><br><br>
										   暂无投资记录</div>-->
            </ul>
            <div class="pmain-morebtn" style="border-top:0;margin-top:0"></div>
          </div>
        </div>
      </div>
    </div>
    <div class="clear"></div>
  </div>
</div>
<!--网站底部-->
<div id="footer" class="ft">
  <div class="ft-inner clearfix">
    <div class="ft-helper clearfix">
      <dl>
        <dt>关于我们</dt>
        <dd><a href="公司简介.html">公司简介</a><a href="管理团队.html">管理团队</a><a href="网站公告.html">网站公告</a></dd>
      </dl>
      <dl>
        <dt>相关业务</dt>
        <dd><a href="list.html">我要投资</a><a href="我要借款.html">我要借款</a></dd>
      </dl>
      <dl>
        <dt>帮助中心</dt>
        <dd><a href="帮助中心.html">新手入门</a><a href="个人中心首页.html">我的账户</a><a href="list.html">债权转让</a></dd>
      </dl>
      <dl>
        <dt>联系我们</dt>
        <dd><a href="联系我们.html">联系我们</a></dd>
      </dl>
    </div>
    <div class="ft-service">
      <dl>
        <dd>
          <p><strong>400-660-1268</strong><br>
            工作日 9:00-22:00<br>
            官方交流群:<em>12345678</em><br>
            工作日 9:00-22:00 / 周六 9:00-18:00<br>
          </p>
          <div class="ft-serv-handle clearfix"><a class="icon-hdSprite icon-ft-sina a-move a-moveHover" title="亿人宝新浪微博" target="_blank" href="#"></a><a class="icon-hdSprite icon-ft-qqweibo a-move a-moveHover" title="亿人宝腾讯微博" target="_blank" href="#"></a><a class="icon-ft-qun a-move a-moveHover" title="亿人宝QQ群" target="_blank" href="#"></a><a class="icon-hdSprite icon-ft-email a-move a-moveHover mrn" title="阳光易贷email" target="_blank" href="mailto:xz@yirenbao.com"></a></div>
        </dd>
      </dl>
    </div>
    <div class="ft-wap clearfix">
      <dl>
        <dt>官方二维码</dt>
        <dd><span class="icon-ft-erweima"><img src="images/code.png" style="display: inline;"></span></dd>
      </dl>
    </div>
  </div>
  <div class="ft-record">
    <div class="ft-approve clearfix"><a class="icon-approve approve-0 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-1 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-2 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-3 fadeIn-2s" target="_blank" href="#"></a></div>
    <div class="ft-identity">©2015 亿人宝 All rights reserved&nbsp;&nbsp;&nbsp;<span class="color-e6">|</span>&nbsp;&nbsp;&nbsp;安徽省亿人宝投资管理有限公司&nbsp;&nbsp;&nbsp;<span class="color-e6">|</span>&nbsp;&nbsp;&nbsp;<a target="_blank" href="http://www.miitbeian.gov.cn/">皖ICP备12345678号-1</a></div>
  </div>
</div>
</body>
</html>
