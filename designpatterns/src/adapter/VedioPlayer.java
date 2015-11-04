package adapter;

import java.util.Arrays;
import java.util.List;

public class VedioPlayer implements AdvancedMediaPlayer {

	String[] fucs = {"vlc","mp4"};
	List<String> mFucsList = Arrays.asList(fucs);
	@Override
	public void play(String type, String filename) {
		// TODO Auto-generated method stub
		if(mFucsList.contains(type)){
			System.out.println(type+"playing"+filename);
		}
		else{
			System.out.println("Not suppurt format!");
		}
	}

}
