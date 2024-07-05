import src.Entity.Mp4Player;
import src.Adapter.AdapterVideo;
import src.Adapter.VideoAdapter;

public class App2 {
    public static void main(String[] args) {
        Mp4Player mp4Player = new Mp4Player();
        VideoAdapter videoAdapter = new AdapterVideo(mp4Player);
        videoAdapter.play("AVI"); // chuyen doi video AVI -> mp4
    }
}
