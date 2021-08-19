package com.ms.workday.Pages;

import java.util.Base64;

public class sample {

	public static void main(String[] args) {
		String encrptData= "Matryx1@2020";
		
		byte[] encodedBytes = Base64.getEncoder().encode(encrptData.getBytes());
				
		System.out.println("encodedBytes --------------->" + new String(encodedBytes));

	}

}
