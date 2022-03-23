package kr.ac.kopo.day10.inter;

public class UserMain {

	public static void main(String[] args) {
		TV tv = new LGTV();
		tv.powerOn();
		tv.channelDown();
		tv.volumeUp();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	}
}
