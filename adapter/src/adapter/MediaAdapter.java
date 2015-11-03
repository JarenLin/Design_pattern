package adapter;

public class MediaAdapter implements MediaPlayer {

	@Override
	public void play(String type, String filename) {
		// TODO Auto-generated method stub
		new VedioPlayer().play(type, filename);
	}

}
