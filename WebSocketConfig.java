package com.example.galactic_messenger6.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
import org.springframework.messaging.handler.invocation.HandlerMethodReturnValueHandler;
import org.springframework.messaging.simp.config.ChannelRegistration;

import java.util.List;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

 @Override
 public void registerStompEndpoints(StompEndpointRegistry registry) {

  registry.addEndpoint("/galactic-messenger6-websocket").withSockJS();
 }

 @Override
 public void configureMessageBroker(MessageBrokerRegistry registry) {
  registry.setApplicationDestinationPrefixes("/app");
  registry.enableSimpleBroker("/topic");

 }

 @Override
 public void configureClientInboundChannel(ChannelRegistration registration) {
  // Configure the client inbound channel here
 }

 @Override
 public void configureClientOutboundChannel(ChannelRegistration registration) {
  // Configure the client outbound channel here
 }

 @Override
 public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
  // Add argument resolvers here
 }

 @Override
 public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
  // Add return value handlers here
 }

 @Override
 public boolean configureMessageConverters(List<MessageConverter> messageConverters) {
  // Configure message converters here
  return true;
 }
}
