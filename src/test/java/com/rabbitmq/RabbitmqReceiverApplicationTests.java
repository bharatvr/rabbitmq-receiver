package com.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.rabbitmq.component.RabbitmqMessageReceiver;
import com.rabbitmq.component.Runner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqReceiverApplication.class)
public class RabbitmqReceiverApplicationTests {

	@MockBean
	private Runner runner;
	
	@MockBean
    private  RabbitmqMessageReceiver receiver;
	
	@MockBean
	private ConnectionFactory connectionFactory;
	
	@MockBean
	private MessageListenerAdapter listenerAdapter;
	

	@Test
	public void contextLoads() {
	}

}
