package codingTest.ct.week01;

public class Radio implements RemoteControl{
	int volume = 0;
	@Override//재사용 overload 같은 메소드명 다른 매개변수
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume = volume;
	}


}
