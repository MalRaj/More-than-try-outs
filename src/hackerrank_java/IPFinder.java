package hackerrank_java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPFinder {

	 
	    private static final String IPADDRESS_PATTERN = 
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	 
	   /**
	    * Validate ip address with regular expression
	    * @param ip ip address for validation
	    * @return true valid ip address, false invalid ip address
	    */
	    public boolean pattern(final String ip){		
	    	 Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);  
	    	  Matcher  matcher = pattern.matcher(ip);
		  return matcher.matches();	    	    
	    }
}
