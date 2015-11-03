package adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VedioPlayer().play("mp3", "baby.mp3");
		new VedioPlayer().play("mp4", "baby.mp4");
		new AudioPlayer().play("mp3", "baby.mp3");
		new AudioPlayer().play("mp4", "love.mp4");
	}

}
