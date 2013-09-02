package tutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tutorial.bean.Pojo;

/**
 * Basic service class. Controller will call the service class depending on the
 * request
 * 
 * @author deepak
 * 
 */
@Service
public class TestService {
	@Autowired
	private Pojo pojo;

	public void printMessage() {
		pojo.printMsg();
	}
}
