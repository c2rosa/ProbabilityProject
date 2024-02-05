package org.example;

public class Card {

    private boolean blackDotEachSide = false;
    private boolean redDotEachSide = false;
    private boolean blackDotRedDotEachSide = false;

    public Card(boolean blackDotEachSide_input, boolean redDotEachSide_input, boolean blackDotRedDotEachSide_input) {
        this.blackDotEachSide = blackDotEachSide_input;
        this.redDotEachSide = redDotEachSide_input;
        this.blackDotRedDotEachSide = blackDotRedDotEachSide_input;
    }

    public boolean isBlackDotEachSide() {
        return blackDotEachSide;
    }

    public boolean isRedDotEachSide() {
        return redDotEachSide;
    }

    public boolean isBlackDotRedDotEachSide() {
        return blackDotRedDotEachSide;
    }

    public boolean hasRedDotOnASide() {
        return blackDotRedDotEachSide || redDotEachSide;
    }

}
