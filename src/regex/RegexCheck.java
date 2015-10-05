package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

   
public class RegexCheck {
   public static void main(String[] args) {
	  // String body = "deleted:false,sharing_token:AwBWCAESEJqDmoDZKjcpNMJrdFPEpXMaKod60HehUEiDFPccG09kPbIIkI2H7FgDwaLiOBY2XZ_uzu1rx7YSbLesUAMCUCAQEEIEbiungx-PhW41XKTANkC9CT-NKdMiSM7-9vpp2CUbaL,sharing_info: {";
	  String body = "00000000-0000-3000-0001-0000000051E9";
	   //String input = "OneOne:two:three:four";
      //String regexe = "(.+):(two):(three):(.+)"; // pattern to be matched
     // String regexe = "(.*)(\"sharing_token\")(?:.*?)(\n|&)";
     // String regexe = "(.*)(sharing_token?)(?:.*?)(\n|&)";
	 //  String regexe = "(0-9)*";
     // String replacement = "$1$2 [FILTERED]";    // replacement pattern with back references
   
      // Step 1: Allocate a Pattern object to compile a regexe
      System.out.println(!Pattern.matches("(0-9)*",body));
   
      // Step 2: Allocate a Matcher object from the Pattern, and provide the input
     // Matcher matcher = pattern.matcher(body);
      // Step 3: Perform the matching and process the matching result
     // String output = matcher.replaceAll(replacement);     // all matches
     // String output = matcher.replaceFirst(replacement); // first match only
//      String body = "\"deleted\" : false, sharing_token : false \n" +
//  	   		"\"deleted\" : false \n" +
//  	   		"\"sharing_token\" : \"AwBWCAESEJqDmoDZKjcpNMJrdFPEpXMaKod60HehUEiDFPccG09kPbIIkI2H7FgDwaLiOBY2XZ_uzu1rx7YSbLesUAMCUCAQEEIEbiungx-PhW41XKTANkC9CT-NKdMiSM7-9vpp2CUbaL\",";
     //String body = "fgdhdfgdfogh";
      //String output =  ((body != null) ?  body.replaceAll(regexe, "$1$2 [FILTERED] $3") : body);
      //System.out.println(output);
      
      
      
   }
}


//
//String responseData = \"response data = [ { \\"status\\" : { \\"status_code \\" : 0,\"error_message\" : \"OK\"
//	  },
//	  \"document_id\" : \"00000000-0000-3000-0001-00000000010F\",
//	  \"etag\" : \"1y::1x\",
//	  \"parent_id\" : \"documents\",
//	  \"name\" : \"Visual Report.pages\",
//	  \"type\" : \"PACKAGE\",
//	  \"deleted\" : false,
//	  \"sharing_token\" : \"AwBWCAESEJqDmoDZKjcpNMJrdFPEpXMaKod60HehUEiDFPccG09kPbIIkI2H7FgDwaLiOBY2XZ_uzu1rx7YSbLesUAMCUCAQEEIEbiungx-PhW41XKTANkC9CT-NKdMiSM7-9vpp2CUbaL\",
//	  \"sharing_info\" : {
//	    \"shared\" : false,
//	    \"read_only\" : false
//	  },\"mtime\" : 1410561417000,
//	  \"thumbnail\" : {
//	    \"signature\" : \"AV5nDG1isGfzzDa16jzHYDqjKmRf\",
//	    \"owner\" : \"8024362929\",
//	    \"size\" : 147546,
//	    \"reference_signature\" : \"AYCNhFGoGx/96Cd6P8irhe0VQlGb\",
//	    \"wrapping_key\" : \"uuB9alSqTcpbbl2A19iGGA==\",
//	    \"pcsInfo\" : \"gSA0HHord1rc9q7FwNZ+fqPdHEwrurVt\"
//	  },
//	  \"losers\" : [ ],
//	  \"last_editor\" : \"_2\",
//	  \"package_folders\" : [ {
//	    \"starting_document_id\" : \"root\",
//	    \"path\" : \"Data\"
//	  }, {
//	    \"starting_document_id\" : \"root\",
//	    \"path\" : \"Metadata\"
//	  } ],\";