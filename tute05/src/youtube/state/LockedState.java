package youtube.state;

import youtube.Viewing;

public class LockedState extends ViewingState {
    public LockedState(Viewing viewing) {
        super(viewing);
        viewing.setPlaying(false);
    }

    @Override
    public String onLock() {
        // TODO
        return "";
    }

    @Override
    public String onPlay() {
        // TODO
        return "";
    }

    @Override
    public String onNext() {
        // TODO
        return "";
    }
}