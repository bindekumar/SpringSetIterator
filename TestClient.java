package com.binde.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class TestClient {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Resource resource=new FileSystemResource("TestCfg.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Test t=(Test)factory.getBean("td");
		t.display();
		
	}

}
