package it.haltardhrim.pet;

public class Pet {

	private Integer id;
	private String name;
	private Integer weight;

	public Integer getId() {
		return id;
	}

	public void setId(Integer i) {
		id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer i) {
		weight = i;
	}

	public String toString() {
		String s = "Pet:\n" + "  Id: " + id + "\n" + "  Name: " + name + "\n" + "  Weight: " + weight + "\n";
		System.out.println(s);
		return s;
	}

}