/*
 *  TV 클래스
 *  	데이터
 *  		채널 - int --> 1 ~ 356
 *  		음량 - int --> 0 ~ 40
 *  		전원 - boolean --> On - true, Off - false
 *  		음소거 - boolean --> On - true, Off - false
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





