package hackerrank;
//
//import hackerearth.string_question;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Scanner;
//
public class FraudPrevention {
//	
//	public  class Order{
//		int orderid;
//		int Dealid;
//		String Emailaddress;
//		String Streetaddress;
//		String City;
//		String State;
//		String ZipCode;
//		String CreditCard;
//		
//		public int getOrderid() {
//			return orderid;
//		}
//		public void setOrderid(int orderid) {
//			this.orderid = orderid;
//		}
//		public int getDealid() {
//			return Dealid;
//		}
//		public void setDealid(int dealid) {
//			Dealid = dealid;
//		}
//		public String getEmailaddress() {
//			return Emailaddress;
//		}
//		public void setEmailaddress(String emailaddress) {
//			Emailaddress = emailaddress;
//		}
//		public String getStreetaddress() {
//			return Streetaddress;
//		}
//		public void setStreetaddress(String streetaddress) {
//			Streetaddress = streetaddress;
//		}
//		public String getCity() {
//			return City;
//		}
//		public void setCity(String city) {
//			City = city;
//		}
//		public String getState() {
//			return State;
//		}
//		public void setState(String state) {
//			State = state;
//		}
//		public String getZipCode() {
//			return ZipCode;
//		}
//		public void setZipCode(String zipCode) {
//			ZipCode = zipCode;
//		}
//		public String getCreditCard() {
//			return CreditCard;
//		}
//		public void setCreditCard(String creditCard) {
//			CreditCard = creditCard;
//		}
//		
//	}
//	
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int noOfTC = in.nextInt();
//        Map<Integer,HashMap<Integer, List<String>>> orderDealMap = new HashMap<Integer, HashMap<Integer,List<String>>>();
//        Map<Integer,Order> orderMap = new HashMap<Integer, Order>();
//        List<Order> orderList = new ArrayList<FraudPrevention.Order>();
//        for(int i = 0; i < noOfTC; i++){
//        	String order = in.next();
//        	String[] orderArr = order.split(",");
//        	
//        	Order orderItems =  null;
//            for (int j = 1; j < orderArr.length; j++) {
//            	orderItems = new Order();
//            	String street = "";
//            	orderItems.setOrderid(Integer.parseInt(orderArr[0]));
//            	orderItems.setDealid(Integer.parseInt(orderArr[1]));
//            	
//            	String[] emails = orderArr[2].toLowerCase().split("@");
//            	if(emails[0].contains(".")){
//            		emails[0].replaceAll(".", "");
//            	}
//            	if(emails[0].contains("+")){
//            		emails[0].subSequence(0,emails[0].indexOf("+"));
//            	}
//            	orderItems.setEmailaddress(emails[0]+emails[1]);
//            	
//            	if(orderArr[3].contains("St.")){
//            		orderItems.setStreetaddress(orderArr[3].replace("St.", "Street"));
//            	}else if(orderArr[3].contains("Rd.")){
//            		orderItems.setStreetaddress(orderArr[3].replace("Rd.", "Road"));
//            	}else{
//            		orderItems.setStreetaddress(orderArr[3]);
//            	}
//            	orderItems.setCity(orderArr[4]);
//            	
//            	if(orderArr[5].contains("IL")){
//            		orderItems.setState(orderArr[5].replace("IL", "Illinios"));
//            	}else if(orderArr[5].contains("CA")){
//            		orderItems.setStreetaddress(orderArr[5].replace("CA", "California"));
//            	}else if(orderArr[5].contains("NY")){
//            		orderItems.setStreetaddress(orderArr[5].replace("NY", "New York"));
//            	}else{
//            		orderItems.setStreetaddress(orderArr[5]);
//            	}
//            	
//            	if(orderArr[6].contains("-")){
//            		orderItems.setZipCode(orderArr[6].replace("-", ""));
//            	}else{
//            		orderItems.setZipCode(orderArr[6]);
//            	}
//            	
//            	orderItems.setCreditCard(orderArr[7]);
//			}
//            orderList.add(orderItems);
//        }
//        Map<Integer,List<Order>> orderMapSame = new HashMap<Integer, List<Order>>();
//        for (Order string : orderList) {
//			
//		}
//    }
}
