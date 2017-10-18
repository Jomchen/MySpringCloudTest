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
        System.out.println("正在进行 WEBSOCKET 握手协议。。。");
        return true;
    }

    @Override
    public void afterHandshake(
            ServerHttpRequest serverHttpRequest,
            ServerHttpResponse serverHttpResponse,
            WebSocketHandler webSocketHandler,
            Exception e) {
        System.out.println("WEBSOCKET 握手协议成功。。。");
    }

}
