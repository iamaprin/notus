package io.vilya.notus.websocket;

import java.io.IOException;

import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月23日 下午11:18:04
 */
@ServerEndpoint("/chat")
public class ChatService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ChatService.class);
    
    public ChatService() {
        LOGGER.info("ChatService");
    }
    
    @OnOpen
    public void OnOpen(Session session) throws IOException {
        LOGGER.info(session.getId());
        session.getBasicRemote().sendText("Hello, client!");
    }
    
    @OnMessage
    public void onMessage(String message, Session session) {
        LOGGER.info("Greeting received: " + message);
    }
}
