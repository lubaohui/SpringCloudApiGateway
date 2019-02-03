package com.admin.demo;

import com.admin.demo.sender.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloApplication.class)
@WebAppConfiguration
public class ApplicationTests {

	@Autowired
	private SinkSender sinkSender;

	@Test
	public void hello() {
		//sinkSender.output().send(MessageBuilder.withPayload("From"));
	}

}
