package com.javaex.ex22;

import java.io.IOException;

public class MyApp {

	public static void main(String[] args) {
		
		FileReader fr = new FileReader();
		//파일이 있을때
		fr.Read("C:/school.text");
		
		
		//파일이 없을떄
		fr.Read2("C:/shcool.text");
		
		try {
		fr.Read3("C:/school.text");
		} catch (IOException e) {
			System.out.println("****파일이 없다****");
		}
		
	}

}
