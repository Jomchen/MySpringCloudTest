var ws = new WebSocket("/spring-websocket-portfolio/myHandler");
var stompClient = Stomp.over(socket);
stompClient.connect({}, function() {

});


