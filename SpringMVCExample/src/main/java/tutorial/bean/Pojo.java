package tutorial.bean;

/**
 * Basic pojo(plain old java object) class
 * 
 * @author deepak
 * 
 */
public class Pojo {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void printMsg() {
		System.out.println("msg is : " + msg);
	}
}
