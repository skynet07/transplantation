import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Analyzes extends Organs {
    
	private String OrganAnalyzes;
	private String BloodAnalyzes;
	public String getOrganAnalyzes() {
		return OrganAnalyzes;
	}
	public void setOrganAnalyzes(String organAnalyzes) {
		OrganAnalyzes = organAnalyzes;
	}
	public String getBloodAnalyzes() {
		return BloodAnalyzes;
	}
	public void setBloodAnalyzes(String bloodAnalyzes) {
		BloodAnalyzes = bloodAnalyzes;
	}
	

}