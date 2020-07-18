var layer = layui.layer;
var index=null;//重置密码的弹出层
var pass=null;
var repass=null;
var uphone=null;
var Code=null;//系统生成的验证码
var pVerify=null;//用户输入的验证码
var sendPhones=$("#sendPhones");
var flag=false;

/*忘记密码的操作*/

    /*提示消息模块*/
    function show_validate_msg(ele,status,msg){
    $(ele).nextAll("span").text("");
    if("success"===status){
        $(ele).nextAll("span").text(msg).css("color","blue");
    }else if("error"===status){
        $(ele).nextAll("span").text(msg).css("color","red");
    }
}
    /*单击忘记密码跳转页面*/
    $("#forgetPass").click(function () {
        window.location.href="resetPass.html";
        return false;
    })
    /*单击返回跳转页面*/
    $("#return").click(function () {
        window.history.back(-1);
        return false;
    })
    //验证密码和手机号码格式
    function checkingPass() {
        pVerify=$("#verifyCode").val();//手机验证码
    pass=$("#pass").val();
    uphone=$("#phone").val();//电话号码
    repass=$("#repass").val();
    var regPhone=/^1[3456789]\d{9}$/;
    if(!regPhone.test(uphone)) {
        show_validate_msg("#phone", "error", "手机号格式错误，请重新输入!");
        return false;
    }else{
        show_validate_msg("#phone", "success", "手机号可用");
        verifyPass();
    }

    var regPass=/^[a-zA-Z]\w{5,10}$/;
    if(!regPass.test(pass)){
        show_validate_msg("#pass","error","密码格式错误");
        return false;
    }else{
        show_validate_msg("#pass","success","密码可用");
    }
    if(repass !== pass){
        show_validate_msg("#repass", "error", "两次密码输入不一致，请重试!");
        return false;
    }else{
        show_validate_msg("#repass","success","重复密码可用");
    }
    return true;
}
    /*发送手机短信找回密码*/
    function verifyPass() {
        /*防刷新：检测是否存在cookie*/
        if($.cookie("captcha")){
            var count = $.cookie("captcha");
            var btn = $('#sendPhones');
            btn.val(count+'秒后可重新获取').attr('disabled',true).css('cursor','not-allowed');
            var resend = setInterval(function(){
                count--;
                if (count > 0){
                    btn.val(count+'秒后可重新获取').attr('disabled',true).css('cursor','not-allowed');
                    $.cookie("captcha", count, {path: '/', expires: (1/86400)*count});
                }else {
                    clearInterval(resend);
                    btn.val("获取验证码").removeClass('disabled').removeAttr('disabled style');
                }
            }, 1000);
        }
        /*点击改变按钮状态，已经简略掉ajax发送短信验证的代码*/
        sendPhones.click(function() {
            var btn = $(this);
            var count = 60;
            var resend = setInterval(function () {
                count--;
                if (count > 0) {
                    btn.val(count + "秒后可重新获取");
                    $.cookie("captcha", count, {path: '/', expires: (1 / 86400) * count});
                } else {
                    clearInterval(resend);
                    btn.val("获取验证码").removeAttr('disabled style');
                }
            }, 1000);
            btn.attr('disabled', true).css('cursor', 'not-allowed');
            //发送验证码去校验
            $.ajax({
                url:'/users/verifyCode',
                type: 'POST',
                dataType:'JSON',
                data:{uphonenumber:uphone},
                success:function (data) {
                    if(data.rs===true){
                        Code=data.data;
                        console.log(Code)
                        show_validate_msg("#sendPhones","success",data.content);
                    }else{
                        show_validate_msg("#sendPhones","error",data.content);
                    }
                }
            });
            flag=true;
        });
    }
    /*重置密码*/
    function resPass(){
        if(checkingPass()&&flag){//当所有验证正确后才可以重置
            if(Code===pVerify){
                $.ajax({
                    url:'/users/regPass',
                    type:'POST',
                    data:{
                        password:pass,
                        phone:uphone,
                    },
                    success:function (result) {
                        alert("重置成功")
                        window.location.href="login.html";
                    },error:function () {
                        alert("重置失败")
                    }
                })
            }else{
                show_validate_msg("#verifyCode","error","验证码错误，请重试");
            }
        }
    }
    /*重置密码按钮*/
    $("#reset").click(function () {
        resPass();
        return false;
    })

/*登录的操作*/
var userName=null;
var loginPass=null;
var pVerifyCode=null;
    /*更换验证码*/
    $("#captcha").click(function() {
        let url = "/kaptcha"
        $(this).find("img").attr("src", url + "?n=" + parseInt(Math.random() * 1000));
    })
    /*脚本验证账号密码格式和验证码*/
    function verifyNamePass() {
        userName=$("#userName").val();//验证用户名
        var loginName=/(^[a-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
        if(!loginName.test(userName)){
            show_validate_msg("#userName","error","用户名格式错误!");
            return false;
        }else{
            show_validate_msg("#userName","success","用户名格式正确!");
        }

        loginPass=$("#password").val();
        var logPass=/^[a-zA-Z]\w{5,10}$/;
        if(!logPass.test(loginPass)){
            show_validate_msg("#password","error","密码格式错误");
            return false;
        }else{
            show_validate_msg("#password","success","密码格式正确");
        }

        pVerifyCode=$("#pVerifyCode").val();//验证码
        var regpVerify=/^\d{4}$/;
        if(!regpVerify.test(pVerifyCode)){
            show_validate_msg("#pVerifyCode","error","验证码格式错误，请重新输入");
            return false;
        }else{
            show_validate_msg("#pVerifyCode","success","验证码格式正确");
        }
        return true;
    }
    /*发送请求登录*/
    $("#login").click(function () {
        if(verifyNamePass()){
            $.ajax({
                url:'/users/goLogin',
                type:'POST',
                data:{unickname:userName,upass:loginPass,kaptcha:pVerifyCode,},
                success:function (result) {
                    if(result.resultType==="LOGIN"){
                        alert(result.content)
                    }
                    if(result.resultType==="KAPTCHAERROR"){
                        alert(result.content)
                    }
                    if(result.resultType==="SUCCESS"){
                        alert(result.content);
                        window.location.href="index.html";
                    }
                }
            })
        }
        return false;
    })






