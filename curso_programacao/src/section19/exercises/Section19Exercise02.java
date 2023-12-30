package section19.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import util.Entry;

public class Section19Exercise02 {

	public static void main(String[] args) {
		
		Scanner sc = Entry.startScanner();
		
		System.out.print("Enter file full path: ");
		String strPath = sc.nextLine();
		
		Map<String,Integer> candidates = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] data = line.split(",");
				
				if(candidates.containsKey(data[0])) {
					candidates.put(data[0],Integer.parseInt(data[1]) + candidates.get(data[0]));
				} else {
					candidates.put(data[0], Integer.parseInt(data[1]));
				}
				
				line = br.readLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		Entry.closeScanner();
		
		for(String key : candidates.keySet()) {
			System.out.println(key + ": " + candidates.get(key));
		}
		
		
	}
	

}
