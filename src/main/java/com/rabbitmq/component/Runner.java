package com.rabbitmq.component;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author bharat
 * @since 1.0.0
 */
@Component
public class Runner implements CommandLineRunner {

	@Autowired
    private  RabbitmqMessageReceiver receiver;

    @Override
    public void run(String... args) throws Exception {        
        receiver.getLatch().await(1000, TimeUnit.MILLISECONDS);
    }

}