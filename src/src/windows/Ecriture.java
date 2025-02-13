package windows;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Ecriture {
	

	
	public static void main(String [] args){
		File ff=new File("C:\\Users\\Alex\\eclipse-workspace\\Takuzu\\takliste6.txt");
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null,},
					{null, null, null, null, null, null,},
					{null, null, null, null, null, null,},
					{null, null, null, null, null, null,},
					{null, null, null, null, null, null,},
					{null, null, null, null, null, null,},
					
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column",
				}
			));
	try{
	 // définir l'arborescence
	FileWriter ffw=new FileWriter(ff);
	int i = 0;
	while (i<10000) {
		Takuzu6 tak = new Takuzu6(table);
		ffw.write(tak.toString()); 
		System.out.println("----------------------------------");
		ffw.write("\n");
		i++;
	}
	 // écrire une ligne dans le fichier resultat.txt
	 // forcer le passage à la ligne
	ffw.close(); // fermer le fichier à la fin des traitements
	} catch (Exception e) {}
	}
	
}
