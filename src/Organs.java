import java.util.ArrayList;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.Serializable;

public class Organs implements Serializable  {
	
	
	private String name;
	private String Blood;
	private String Price;
	public String getBlood() {
		return Blood;
	}
	public void setBlood(String blood) {
		Blood = blood;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}


	
	
	
}
