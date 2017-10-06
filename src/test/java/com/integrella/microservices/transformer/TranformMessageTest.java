package com.integrella.microservices.transformer;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.integrella.microservices.transformer.TransformMessage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TranformMessageTest {
	
	@Test
	public void transformTest(){
		TransformMessage tm = new TransformMessage();
		String data = "data";
		CharSequence expectedXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>"
				+ "<IntegrellaMDM><Header id=\"1\"/><Data>data</Data></IntegrellaMDM>";
		tm.transform(data);
		assertThat(tm.transform(data)).isXmlEqualTo(expectedXml);
	}

}
