package com.ibm.poweshellexample.poweshellexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoweshellexampleApplication {
	@Autowired
	static AppExample appExample;

	public static void main(String[] args) {
		SpringApplication.run(PoweshellexampleApplication.class, args);
		String filePath = "C:\\Users\\SunithaGM\\welcome.txt";
		try {
			appExample.executePowerShellCommand(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
