

$(function() {

    var ws = new WebSocket("ws://127.0.0.1:8080/myHandler");
    ws.onopen = function(event) {
        console.log("正在进行连接 websocket 。。。");
    };
    ws.onerror = function(event) {
        console.log("websocket 错误 。。。");
    };
    ws.onmessage = function(event) {
        console.log("数据为：" + event.data);
    };

    $(".anniu").click(function() {
        ws.send("Hello Linux !!" + new Date().getTime());
    });
});


