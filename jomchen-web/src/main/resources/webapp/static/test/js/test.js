$(function() {
    $(".btn").click(function() {
        var display = $(".fu").css("width");
        if (display == "0px") {
            $(".fu").animate({
                width: "50%"
            }, 500);
        } else {
            $(".fu").animate({
                width: "0%"
            }, 250);
        }
    });

});



/*
jQuery.validator.addMethod("stringCheck", function(value, element) {
    var reg = /^1[3|4|5|8]\d{9}$/;
    return reg.test(value);
}, "请输入正确的电话号码 !!!!!!");

$("#myform").validate({
    debut: true,
    submitHandler: function(form) {
        alert("提不提交");
        console.log("提不提交");
    },
    errorPlacement: function(error, element) {
        error.appendTo(element.siblings(".error_msg"));
    },
    rules: {
        username: {
            required: true,
            rangelength: [3, 8]
        },
        age: {
            required: true,
            min: 0,
            max: 200,
            digits: true
        },
        passwd: {
            required: true
        },
        aginpasswd: {
            required: true,
            equalTo: "#passwd"
        },
        telphone: {
            stringCheck: true
        },
        sex: {
            required: true
        },
        lover: {
            required: true
        },
        subject: {
            required: true
        }
    },
    messages: {
        username: {
            required: "请输入用户名",
            rangelength: $.validator.format("输入的长度必须在：{0}-{1}之间")
        },
        age: {
            required: "请输入年龄",
            min: "年龄最小值为 0",
            max: "年龄最大值为 200",
            digits: "必须输入整数"
        },
        passwd: {
            required: "请输入密码"
        },
        aginpasswd: {
            required: "请输入密码",
            equalTo: "两次密码不一致"
        },
        telphone: {
            stringCheck: "请输入正确的电话号码"
        },
        sex: {
            required: "请选择性别"
        },
        lover: {
            required: "请选择您的爱好"
        },
        subject: {
            required: "请选择科目"
        }
    }

});
*/