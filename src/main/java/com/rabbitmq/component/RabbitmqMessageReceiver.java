package com.rabbitmq.component;

import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;
import org.springframework.util.SerializationUtils;

import com.rabbitmq.Models.BookDetailDTO;


/**
 * @author bharat
 * @since 1.0.0
 */
@Component
public class RabbitmqMessageReceiver {

	private CountDownLatch latch = new CountDownLatch(1);

	public void receiveMessage(byte[] data) {

		BookDetailDTO bookDetailDTO = (BookDetailDTO) SerializationUtils.deserialize(data);
		System.out.println("AuthorName" + bookDetailDTO.getAuthorName());

		latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}
}
