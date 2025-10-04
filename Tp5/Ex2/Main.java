package Tp5.Ex2;

public class Main {
	public static void main(String[] args) {
		MediaLibrary lib = new MediaLibrary();
		
		lib.add(new Audio("Podcast Java", 1800));
        lib.add(new Video("Java JEE", 900, "1080"));
        lib.add(new LiveStream("Live en discord",
                               "https://discord.com"));
        lib.add(new Audio("Musique Classique", 2400));

        lib.playAll();
        System.out.println();
        System.out.println("Duree total en seconds : "
            + lib.totalDuration());
	}
}
