package score1;
import score2.ScoreData;
import score2.ScoreManager;

public class ScoreProject {
	public static void main(String[] args) {
//		ScoreData sd = new ScoreData();
//		sd.setName("ȫ�浿");
		
		ScoreManager mgr = new ScoreManager();
		mgr.append();
		mgr.process();
		mgr.output();
	}

}
