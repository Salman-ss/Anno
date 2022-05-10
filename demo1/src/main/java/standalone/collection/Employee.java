package standalone.collection;

import java.util.List;
import java.util.Map;

public class Employee {
	
	
	private List<String> names;
	private Map<String,Integer> data;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	
	public Employee(List<String> names, Map<String, Integer> data) {
		super();
		this.names = names;
		this.data = data;
	}

	public Map<String, Integer> getData() {
		return data;
	}

	public void setData(Map<String, Integer> data) {
		this.data = data;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [names=" + names + ", data=" + data + "]";
	}

	
	

}
