package com.task2.april23;

public class MultimediaSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media img = new Image("the Boyz",2,"Hdr");
		img.getDetails();
		
		Media video = new Video("Iron man",3,"Dolby Vision");
		video.getDetails();
	}

}
