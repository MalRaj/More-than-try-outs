package regex;

public class RC_Copy {
	public static void main(String[] args) {
		String regexe = "(.*)(sharing_token|\"secret\")(?:.*?)(\n|&|$)";
		String body = "\"deleted\" : false, sharing_token : false \n"
				+ "\"deleted\" : false \n"
				+ "\"sharing_token\" : \"AwBWCAESEJqDmoDZKjcpNMJrdFPEpXMaKod60HehUEiDFPccG09kPbIIkI2H7FgDwaLiOBY2XZ_uzu1rx7YSbLesUAMCUCAQEEIEbiungx-PhW41XKTANkC9CT-NKdMiSM7-9vpp2CUbaL\",";
		String output = ((body != null) ? body.replaceAll(regexe,
				"$1$2 [FILTERED] $3") : body);
		System.out.println(output);
	}
}
