package com.javaex.ex08;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	
	public Tv(int channel,int volume,boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public Tv() {
		
	}

	//메소드 g/s

	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	
	public void power(boolean on) {
		this.power=on;
	}
	
	public void chennal(int channel) {
		this.channel=channel;
		if(this.channel>255) {
			this.channel=1;
		}
		else if(this.channel<1){
			this.channel=255;
		}
	}
	public void channel(boolean channel) {
		if(channel==true) {
			if(this.channel>255) {
				this.channel=0;
			}
			this.channel++;
		}
		else {
			this.channel--;
		}
	}
	public void volume(int volume) {
		this.volume=volume;
		if(this.volume<0) {
			this.volume=0;
		}
		else if(this.volume>100) {
			this.volume=100;
		}
	}
	
	public void volume(boolean volume) {
		if(volume==true) {
			this.volume++;
		}
		else {
			this.volume--;
		}
	}
	
	
	public void status(){
		System.out.print("채널은 "+channel+"번 볼륨은 "+volume);
		if(power==true) {
			System.out.println("  전원은 켜졌습니다");
		}
		else {
			System.out.println("  전원은 꺼졌습니다.");
		}
	}
	

}
