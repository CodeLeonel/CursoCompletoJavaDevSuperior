package section17.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import section17.exercise.entities.Product;

public class Section17Exercise01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		String strPath = "c:\\temp";
		String strPathProducts = strPath + "\\products.csv";		
		String strPathOut = "c:\\temp\\out";
		String strPathSummary = strPathOut + "\\summary.csv";
		
		List<Product> products = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPathProducts))) {
			
			String line = br.readLine();
			
			while(line != null) {
				
				Product product = new Product(line.split(",")[0], Double.parseDouble(line.split(",")[1]) , Integer.parseInt(line.split(",")[2]));
				products.add(product);
				
				line = br.readLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}

		boolean success = new File(strPathOut).mkdir();
		System.out.println("Create folder out: " + success);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPathSummary))) {
			
			for(Product product : products) {
				bw.write(product.toString());
				bw.newLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
