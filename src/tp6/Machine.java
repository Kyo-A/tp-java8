package tp6;

public class Machine {
	
	private Integer year;
	
	private String name;

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Machine(Integer year, String name) {
		super();
		this.year = year;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Machine [year=" + year + ", name=" + name + "]";
	}
	
	

}
