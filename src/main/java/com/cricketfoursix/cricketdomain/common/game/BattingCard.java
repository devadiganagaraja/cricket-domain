package com.cricketfoursix.cricketdomain.common.game;

import java.util.Set;

public class BattingCard {
    private Set<BatsmanCard> batsmanCardSet;

    public Set<BatsmanCard> getBatsmanCardSet() {
        return batsmanCardSet;
    }

    public void setBatsmanCardSet(Set<BatsmanCard> batsmanCardSet) {
        this.batsmanCardSet = batsmanCardSet;
    }
}
