package DB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@DataProvider(name = "login")
	public Object  [][] dp(){
		Object [][] o= new Object[2][2];
		o [0][0]="user1";
		o[0][1]="pass1";
		o[1][0]="user2";
		o[1][1]="pass2";
		return o ;
	}
	
	
	FileReader f;
	BufferedReader bf;
	
	public void test3() {
		throw new NoSuchElementException();
	}
	
	@Test
	public void test1() {
		
		try {
			//risky
			f= new FileReader(new File("C:\\Users\\Shamima Nasrin\\eclipse-workspace\\TestNGProject200926M\\book.txt"));
		    bf= new BufferedReader(f);
		    String line = bf.readLine();
		
		    while(line!=null) {
			  System.out.println(line);
			  line=bf.readLine();
			 }
		
		}catch(FileNotFoundException e) {
		    System.out.println("not found");
		    
		}catch(IOException e) {
			e.printStackTrace();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			try {
				if(f!=null) {
					f.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			if(bf!=null) {
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("continue");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
