/*
 *  TV 클래스
 *  	필드
 *  		채널 - int --> 1 ~ 356
 *  		음량 - int --> 0 ~ 40
 *  		전원 - boolean --> On - true, Off - false
 *  		음소거 - boolean --> On - true, Off - false
 *  	메서드
 *  		채널Up : 채널값 1씩 증가
 *  		채널Down : 채널값을 1씩 감소
 *  		전원OnOff : true 전원 On, false 전원 Off
 *  		음량Up : 음량 1씩 증가 -> 최대값
 *  		음량Down : 음량 1씩 감소 -> 최소값 
 */
public class TV {
	private int ch;
	private final int MAX_CH = 356;
	private final int MIN_CH = 1;
	private int vol;
	private final int MAX_VOL = 40;
	private final int MIN_VOL = 0;
	private boolean power;
	private boolean mute;

	public TV() {
		ch = 9;
		vol = 15;
		power = false;
		mute = false;
	}

	public void chUp() {
		if(!power) return; //메서드를 강제로 종료
		ch++;//채널이 최대값? 
		if(ch > MAX_CH)
			ch = MIN_CH;
		System.out.println("현재 채널 : "+ch);
	}
	
	public void chDown() {
		if(!power) return; //메서드를 강제로 종료
		ch--;//채널이 최소값?
		if(ch < MIN_CH)
			ch = MAX_CH;
		System.out.println("현재 채널 : "+ch);
	}
	
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
	}
	
	public void volUp() {
		if(!power) return; //메서드를 강제로 종료
		if(vol < MAX_VOL)
			vol++;
		System.out.println("현재 음량 : "+vol);
	}
	public void volDown() {
		if(!power) return; //메서드를 강제로 종료
		if(vol > MIN_VOL)
			vol--;
		System.out.println("현재 음량 : "+vol);
	}
	
	public void mute() {
		if(!power) return; //메서드를 강제로 종료
		mute = !mute;
		if(mute) 
			System.out.println("음소거가 활성화 되었습니다.");
		else
			System.out.println("음소거가 비활성화 되었습니다.");
	}
	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public boolean isMute() {
		return mute;
	}

	public void setMute(boolean mute) {
		this.mute = mute;
	}
	
	
	
	
	
}





