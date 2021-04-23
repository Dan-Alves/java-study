package aula52ex;

public class Contact {

	private String name;
	private String phone;
	private int id;
	private static int cont = 0;
	
	public Contact(){
        cont++;
        id = cont;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + ", id=" + id + "]";
	}
	
	
}
