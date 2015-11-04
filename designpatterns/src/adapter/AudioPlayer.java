package adapter;

import java.util.Arrays;
import java.util.List;

public class AudioPlayer implements MediaPlayer {

	String[] fucs = {"mp3"};
	List<String> mFucsList = Arrays.asList(fucs);
	@Override
	public void play(String type, String filename) {
		// TODO Auto-generated method stub
		if(mFucsList.contains(type)){
			System.out.println(type+"playing"+filename);
		}
		else{
//			System.out.println("Not suppurt format!");
			new MediaAdapter().play(type, filename);//with adapter, it can play more than mp3
		}
	}

}
