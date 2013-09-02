package tutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tutorial.bean.Pojo;

@Service
public class TestService {
	@Autowired
	private Pojo pojo;

	public void printMessage() {
		pojo.printMsg();
	}
}
