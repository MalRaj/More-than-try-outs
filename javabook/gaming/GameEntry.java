package gaming;

public class GameEntry {
	
	protected String name;
	protected int score;
	
	public GameEntry(String n,int s){
		name = n;
		score = s;
	}

	public String getName() {
		return name;
	}


	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "GameEntry [name=" + name + ", score=" + score + "]";
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	

//	public void setScore(int score) {
//		this.score = score;
//	}
	
	

	
}
