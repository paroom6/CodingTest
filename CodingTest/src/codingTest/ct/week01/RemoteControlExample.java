package codingTest.ct.week01;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			RemoteControl rc = null;
			rc = new Television();
			rc.turnOn();
			rc = new Radio();
			rc.turnOff();
	}

}
