package com.jomchen.web.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Create by Jomchen on 15:33 2017/10/17
 */
public class MyHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String data = message.getPayload();
        System.out.println("WEBSOCKET 得到的信息为 data");
        TextMessage responseMessage = new TextMessage("你好啊，客户端！！");
        session.sendMessage(responseMessage);
    }

}
