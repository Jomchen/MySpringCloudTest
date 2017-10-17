$(function() {
    $(".anniu_00").click(function() {
        anniu();
    });
});

function anniu() {
    $.ajax({
        url: "/all/page_00_ajax",
        type: "post",
        dataType: "json",
        data: {name: 'Linux'},
        success: function(result) {
            console.log("异步请求成功。。");
            console.log(result);
            console.log("异步请求成功。。");
        },
        error: function(e) {
            console.log("异步请求失败。。。");
            console.log(e);
            console.log("异步请求失败。。。");
        }
    });
}