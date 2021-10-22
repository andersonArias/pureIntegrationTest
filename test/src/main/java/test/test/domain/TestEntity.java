package test.test.domain;

import java.io.Serializable;
import java.util.Map;

public class TestEntity implements Serializable{

	private static final long serialVersionUID = 2189749425626696134L;
	private Map<String, Object> message;
	private String status;

	public Map<String, Object> getMessage() {
		return message;
	}

	public void setMessage(Map<String, Object> message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
