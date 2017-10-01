package com.bodastage.cm.websockets;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
import org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

@Configuration 
@EnableWebSocketMessageBroker
//@Controller
//@RequestMapping("/api/websocket")
public class WebSocketConfiguration  implements WebSocketMessageBrokerConfigurer  {
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		//registry.enableStompBrokerRelay("/topic", "/export-response")
		registry.enableStompBrokerRelay("/topic")
                .setRelayHost("0.0.0.0") //@TODO: Pick from configuration file
                .setRelayPort(61613) //@TODO: Pick from configuration file
                .setClientLogin("admin")
                .setClientPasscode("admin")
            	;
		        registry.setApplicationDestinationPrefixes("/app");

    }

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureClientInboundChannel(ChannelRegistration arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureClientOutboundChannel(ChannelRegistration arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean configureMessageConverters(List<MessageConverter> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void configureWebSocketTransport(WebSocketTransportRegistration arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/websocket")
			.setAllowedOrigins("*" )
			.withSockJS();
	}
}
