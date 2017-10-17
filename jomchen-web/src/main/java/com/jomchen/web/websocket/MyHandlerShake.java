package com.jomchen.web.websocket;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;

/**
 * Create by Jomchen on 16:27 2017/10/17
 */
public class MyHandlerShake implements HandshakeInterceptor {

    @Override
    public boolean beforeHandshake(
            ServerHttpRequest serverHttpRequest,
            ServerHttpResponse serverHttpResponse,
            WebSocketHandler webSocketHandler,
            Map<String, Object> map) throws Exception {

        return false;
    }

    @Override
    public void afterHandshake(
            ServerHttpRequest serverHttpRequest,
            ServerHttpResponse serverHttpResponse,
            WebSocketHandler webSocketHandler,
            Exception e) {
        System.out.println("你经过了一个 web socket 的握手处理后方法。。。");
    }

}
