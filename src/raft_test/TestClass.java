package raft_test;

public class TestClass {

	public static void main(String[] args){
		
		String unixCommand = "/usr/local/bin/raft -f /Users/malavika_parvathy/Desktop/CalculatorNumbers.py";
		try {
			UnixCommandUtil.execUnixCommand(unixCommand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
