package raft_test;

/**
 * The value object to hold the output of Runtime Process
 */
public class ProcessVO {
	
	private int exitCode = -1;
	private String output = null;
	
	//Default Constructor
	public ProcessVO () {		
	}

	public int getExitCode() {
		return exitCode;
	}

	public void setExitCode(int exitCode) {
		this.exitCode = exitCode;
	}

	
	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

}
