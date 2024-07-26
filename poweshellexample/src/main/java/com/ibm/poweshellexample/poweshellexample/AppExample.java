package com.ibm.poweshellexample.poweshellexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AppExample {

	static void executePowerShellCommand(String filePath) {

		try {
			// PowerShell command to read and print the content of the file
			String powerShellCommand = "Get-Content -Path " + filePath;

			// Create a ProcessBuilder
			List<String> command = new ArrayList<>();
			command.add("powershell.exe");
			command.add("-Command");
			command.add(powerShellCommand);

			ProcessBuilder processBuilder = new ProcessBuilder(command);

			// Start the process
			Process powerShellProcess = processBuilder.start();

			// Capture the output
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(powerShellProcess.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(powerShellProcess.getErrorStream()));

			// Read the output from the command
			String s;
			// System.out.println("Welcome Message:");
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}

			// Read any errors from the attempted command
			// System.out.println("Standard Error (if any):");
			while ((s = stdError.readLine()) != null) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
