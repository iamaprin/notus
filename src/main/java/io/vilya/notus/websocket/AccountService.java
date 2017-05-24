package io.vilya.notus.websocket;

import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * @author zhukuanxin
 * @time 2017年5月24日 下午9:36:10
 */
@ServerEndpoint(value = "/account", configurator = NotusConfigurator.class)
public class AccountService extends Endpoint {

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        session.addMessageHandler(new MessageHandler.Whole<String>() {
            @Override
            public void onMessage(String message) {
                System.out.println(message);
            }
        });
    }

}
