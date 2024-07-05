package src.Adapter;

import src.Entity.Mp4Player;

public class AdapterVideo implements VideoAdapter{

    public Mp4Player mp4Player;

    public AdapterVideo(Mp4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String videoType) {
        // chuyen doi video AVI -> mp4
        System.out.println("Convert AVI to MP4...");
        if (videoType.equals("AVI")){
            videoType = "mp4";
        }

        mp4Player.play(videoType);

    }
}
