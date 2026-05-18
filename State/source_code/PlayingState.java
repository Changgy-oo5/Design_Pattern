package pattern;

public class PlayingState implements State{
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Đã phát");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Dừng phát");
        player.setState(new PausedState());
        player.setIcon("Play Icon");
    }
}