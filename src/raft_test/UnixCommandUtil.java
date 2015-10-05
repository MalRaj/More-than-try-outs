package raft_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UnixCommandUtil {
	/**
	 * To run the unixCommand through java.
	 * 
	 * @param unixCommand The complete unix command
	 * @return Instance of ProcessVO
	 * @throws Exception While executing unix command
	 */
    public static ProcessVO execUnixCommand(String unixCommand) throws Exception {

    	if (unixCommand == null) {
			System.out.println("UnixCommand cannot be null !!");
    	}
    	
    	BufferedReader buff = null;
        String line = null;
    	ProcessVO processVO = new ProcessVO();
    	StringBuffer sb = new StringBuffer();

        try {
            ProcessBuilder pb = new ProcessBuilder("bash", "-c", unixCommand);
            pb.redirectErrorStream(true);
            Process shell = pb.start();
            shell.waitFor();
            processVO.setExitCode(shell.exitValue());
            
            buff = new BufferedReader(new InputStreamReader(shell.getInputStream()));

            while ((line = buff.readLine()) != null) {
            	if (sb.length() > 0) {
            		sb.append('\n');
            	}
            	sb.append(line);
            }
        } catch (Exception e) {

        	System.out.println("Could not run Unix command");
            throw e;
            
        } finally {
        	processVO.setOutput(sb.toString());
        	try {
            	buff.close();
            } catch (Exception e) {
            	System.out.println("Could not close the shell");
            }
        }
        System.out.println("Output on executing command " + unixCommand +" >>> \n "+processVO.getOutput());

        return processVO;
    }
}
