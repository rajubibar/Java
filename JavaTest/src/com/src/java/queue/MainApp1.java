package com.src.java.queue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File file = new File("D:\\abc.txt");
			FileInputStream fin = new FileInputStream(file);
		}catch(FileNotFoundException f){
			f.printStackTrace();
		}catch(IOException iex){
			iex.printStackTrace();
		}
	}

}
