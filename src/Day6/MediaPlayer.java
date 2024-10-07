package Day6;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    public void playMyList(List<? extends Media> medialist) {
        for(Media m : medialist) {
            m.play();
        }
    }

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(3214,"dabca"));
        songs.add(new Song(3478618,"bxocbst"));
        songs.add(new Song(13425,"jmsfbca"));

        player.playMyList(songs);
    }
}
