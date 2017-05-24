package io.vilya.notus.websocket;

import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;
import javax.websocket.server.ServerEndpointConfig.Configurator;

/**
 * @author zhukuanxin
 * @time 2017年5月24日 下午9:31:54
 */
public class NotusConfigurator extends Configurator {
    
    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        // TODO Auto-generated method stub
        super.modifyHandshake(sec, request, response);
    }
    
}
