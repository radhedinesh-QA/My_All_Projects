package ra_POJO;

public class Reqres_POJO {
	String name;
	String jon;

	//Default Construcor which is required for serialization for calling the call in other class
	public Reqres_POJO() {}

	public Reqres_POJO(String name, String jon) {
		super();
		this.name = name;
		this.jon = jon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJon() {
		return jon;
	}

	public void setJon(String jon) {
		this.jon = jon;
	}
}
