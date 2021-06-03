package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {

		Song Real=new Song();
		
		Real.setAlbum("Real");
		Real.setArtist("아이유");
		Real.setComposer("이민수");
		Real.setTitle("좋은날");
		Real.setTrack(3);
		Real.setYear(2010);
		
		
		Song Always=new Song("거짓말","BIGBANG","Always","G-Dragon",2007,2);
		
		Song BuskerBusker=new Song(2012,4);
		
		BuskerBusker.setAlbum("버스커버스커1집");
		BuskerBusker.setArtist("버스커버스커");
		BuskerBusker.setComposer("장범준");
		BuskerBusker.setTitle("벚꽃엔딩");
		
		
		Real.showInfo();
		Always.showInfo();
		BuskerBusker.showInfo();

	}

}
