var Code=null;//注册的短信验证码==系统生成的
var uName=null;//用户名
var pass=null;//密码
var uPhone=null;//用户电话
var pVerify=null;//注册的手机验证码框===用户输入的
var invist=null;

    function show_validate_msg(ele,status,msg){
        $(ele).nextAll("span").text("");
        if("success"==status){
            $(ele).nextAll("span").text(msg).css("color","blue");
        }else if("error"==status){
            $(ele).nextAll("span").text(msg).css("color","red");
        }
    }
    //注册用户信息的校验
    function validata_add_form(){
    uName=$("#userName").val();//验证用户名
    var regName=/(^[a-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
    if(!regName.test(uName)){
        show_validate_msg("#userName","error","用户名必须是2-5位中文或者是6-16位英文和数字组合!");
        return false;
    }else{
        $.ajax({
            url:'/users/verifyName',
            type:'POST',
            dataType:"json",
            data:{unickname:uName},
            success:function (result) {
                if(result.rs!=true){
                    show_validate_msg("#userName","success",result.content);
                }else{
                    show_validate_msg("#userName","error",result.content);
                    return false;
                }
            }
        })
    }

    pass=$("#password").val();//验证密码
    var regPass=/^[a-zA-Z]\w{5,10}$/;
    if(!regPass.test(pass)){
        show_validate_msg("#password","error","以字母开头，长度在6~10之间，只能包含字母、数字和下划线!");
        return false;
    }else{
        show_validate_msg("#password","success","密码可用");
    }
    if($("#repeatPassword").val() != $("#password").val()){
        show_validate_msg("#repeatPassword", "error", "两次密码输入不一致，请重试!");
        return false;
    }else{
        show_validate_msg("#repeatPassword","success","重复密码可用");
    }

    uPhone=$("#phone").val();//电话号码
    var regPhone=/^1[3456789]\d{9}$/;
    if(!regPhone.test(uPhone)){
        show_validate_msg("#phone","error","手机号格式错误，请重新输入!");
        return false;
    }else{
        $.ajax({
            url:'/users/verifyPhone',
            type:'POST',
            dataType:"json",
            data:{uphonenumber:uPhone},
            success:function (result) {
                if(result.rs===true){
                    show_validate_msg("#phone","success",result.content);
                    antiRefresh();
                }else{
                    show_validate_msg("#phone","error",result.content);
                    return false;
                }
            }
        })
    }

    pVerify=$("#phonVerify").val();//手机验证码
    var regpVerify=/^\d{6}$/;
    if(!regpVerify.test(pVerify)){
        show_validate_msg("#phonVerify","error","验证码格式错误，请重新输入");
        return false;
    }else{
        show_validate_msg("#phonVerify","success","验证码格式正确");
    }

    //判断推荐人是否存在，为空则不判断
    invist=$("#invist").val();
    if(invist!=null&&invist!==""){
        $.ajax({
            url:'/users/verifyName',
            type:'POST',
            dataType:"json",
            data:{unickname:invist},
            success:function (result) {
                if(result.rs===true){
                    show_validate_msg("#invist","success","该推荐人存在");
                }else{
                    show_validate_msg("#invist","error","该推荐人不存在");
                    return false;
                }
            }
        })
    }else{
        show_validate_msg("#invist","success","请填写推荐人账户名，如无推荐人请留空");
    }

    //判断注册是否同意协议
    if(!$("input[type='checkbox']").is(':checked')){
        return false;
    }
    return true;
}
    /*发送短信验证*/
    function antiRefresh(){
        /*防刷新：检测是否存在cookie*/
        if($.cookie("captcha")){
            var count = $.cookie("captcha");
            var btn = $('#sendPhone');
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
        $('#sendPhone').click(function(){
            var btn = $(this);
            var count = 60;
            var resend = setInterval(function(){
                count--;
                if (count > 0){
                    btn.val(count+"秒后可重新获取");
                    $.cookie("captcha", count, {path: '/', expires: (1/86400)*count});
                }else {
                    clearInterval(resend);
                    btn.val("获取验证码").removeAttr('disabled style');
                }
            }, 1000);
            btn.attr('disabled',true).css('cursor','not-allowed');
            //发送ajax请求去获取验证码
            var uPhone=$("#phone").val();//获取电话号码的值
            $.ajax({
                url:'/users/verifyCode',
                type:'POST',
                dataType:"JSON",
                data:{uphonenumber:uPhone},
                success:function (data) {
                    if(data.rs===true){
                        Code=data.data;
                        show_validate_msg("#sendPhone","success",data.content);
                    }else{
                        show_validate_msg("#sendPhone","error",data.content);
                    }
                }
            })
        });
    }
    //下一步---注册按钮
    $("#register").click(function () {
           if(validata_add_form()){//当所有验证正确后才可以提交注册的下一步
               if(Code===pVerify){
                   $.ajax({
                       url:'/users/regUser',
                       type:'POST',
                       data:{
                           username:uName,
                           password:pass,
                           phone:uPhone,
                           recommender:invist
                       },
                       success:function (result) {
                           window.location="/frontend/register1.html";
                       },error:function () {
                            alert("注册失败")
                       }
                   })
               }else{
                   show_validate_msg("#phonVerify","error","验证码错误，请重试");
               }
           }
       })

