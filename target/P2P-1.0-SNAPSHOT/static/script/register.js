
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
        var uName=$("#userName").val();
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
                    if(result.rs==true){
                        show_validate_msg("#userName","success",result.content);
                    }else{
                        show_validate_msg("#userName","error",result.content);
                        return false;
                    }
                }
            })


        }

        var pass=$("#password").val();
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

        var uPhone=$("#phone").val();
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
                    if(result.rs==true){
                        show_validate_msg("#phone","success",result.content);
                    }else{
                        show_validate_msg("#phone","error",result.content);
                        return false;
                    }
                }
            })
        }

        var pVerify=$("#phonVerify").val();//手机验证码
        var regpVerify=/^\d{6}$/;
        if(!regpVerify.test(pVerify)){
            show_validate_msg("#phonVerify","error","验证码格式错误，请重新输入");
            return false;
        }else{
            show_validate_msg("#phonVerify","success","验证码格式正确");
        }
        if(!$("input[type='checkbox']").is(':checked')){
            return false;
        }
        return true;
    }
    //下一步---注册按钮
    $("#register").click(function () {
        if(validata_add_form()){//当所有验证正确后才可以提交注册的下一步
            alert("asda")
        }
    })
