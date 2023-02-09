package Day06.Ex03_Interface;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 인터페이스는 객체로 생성 불가
		// 인터페이스 = 구현 객체 생성
		// 인터페이스 타입  객체명 = new 구현클래스();
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();
		
		RemoteControl speakerRc = new Speaker();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(false);
		tvRc.turnOff();
		System.out.println();
	
		RemoteControl.changeBattery();
	}
}
