package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		
		
		Song Real=new Song();
		Song Always=new Song();
		Song BuskerBusker=new Song();
		
		Real.setAlbum("Real");
		Real.setArtist("아이유");
		Real.setComposer("이민수");
		Real.setTitle("좋은날");
		Real.setTrack(3);
		Real.setYear(2010);
		
		Always.setAlbum("Always");
		Always.setArtist("BIGBANG");
		Always.setComposer("G-DRAGON");
		Always.setTitle("거짓말");
		Always.setTrack(2);
		Always.setYear(2007);
		
		BuskerBusker.setAlbum("버스커버스커1집");
		BuskerBusker.setArtist("버스커버스커");
		BuskerBusker.setComposer("장범준");
		BuskerBusker.setTitle("벚꽃엔딩");
		BuskerBusker.setTrack(4);
		BuskerBusker.setYear(2012);
		
		Real.showInfo();
		Always.showInfo();
		BuskerBusker.showInfo();
	}

}
