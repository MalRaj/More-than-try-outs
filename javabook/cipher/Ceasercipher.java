package cipher;

public class Ceasercipher {
	
	public static final int ALPHASIZE = 26;
	public static final char[] alpha = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
	
	protected char[] encrypt = new char[ALPHASIZE];
	protected char[] decrypt = new char[ALPHASIZE];
	
	public Ceasercipher(){
		for (int i = 0; i < ALPHASIZE; i++) {
			encrypt[i] = alpha[(i+3)%ALPHASIZE];
		}
		for (int i = 0; i < ALPHASIZE; i++) {
			decrypt[encrypt[i] - 'A'] = alpha[i];
		}
	}
	
	public String encrypt(String secret){
		char[] mess = secret.toCharArray();
		for (int i = 0; i < mess.length; i++) {
			if(Character.isUpperCase(mess[i])){
				mess[i] =  encrypt[mess[i] - 'A'];
			}
		}
		return new String(mess);
	}
	
	
	public String decrypt(String secret){
		char[] mess = secret.toCharArray();
		for (int i = 0; i < mess.length; i++) {
			if(Character.isUpperCase(mess[i])){
				mess[i] =  decrypt[mess[i] - 'A'];
			}
		}
		return new String(mess);
	}
	
	public static void main(String args[]){
		Ceasercipher cc = new Ceasercipher();
		String secret = "THE EAGLE IS IN PLAY; MEET AT JOE'S";
		secret = cc.encrypt(secret);
		System.out.println(secret);
		secret = cc.decrypt(secret);
		System.out.println(secret);
	}
}
