package pl.p.lodz.zzpj.adapter;

public class AdapterWrapperTrial
{
    public static void main(String args[]) {

        MediaPlayer mp3 = new Mp3Player();
        MediaPlayer mp4 = new FormatAdapter(new Mp4Player());
        MediaPlayer vlc = new FormatAdapter(new VlcPlayer());
        mp3.play("song");
        mp4.play("song");
        vlc.play("song");

    }
}

interface MediaPlayer{
    void play(String filename);
}

class Mp3Player implements MediaPlayer {
    public void play(String filename) {
        System.out.println("i am playing mp3 " + filename);
    }
}

interface MediaPackage{
    void playFile(String filename);
}

class Mp4Player implements MediaPackage {
    public void playFile(String filename) {
        System.out.println("i am playing mp4 " + filename);
    }
}

class VlcPlayer implements MediaPackage {
    public void playFile(String filename) {
        System.out.println("i am playing vlc " + filename);
    }
}

class FormatAdapter implements MediaPlayer {

    private final MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String filename){
        mediaPackage.playFile(filename);
    }
}