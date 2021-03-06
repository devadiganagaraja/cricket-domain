package com.cricketfoursix.cricketdomain.aggregate;

import com.cricketfoursix.cricketdomain.common.bbb.InningCommentarySummary;
import com.cricketfoursix.cricketdomain.domain.bbb.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bbbs")
public class BBBAggregate {
    @Id
    private String ballId;

    private long batsmanId;
    private long bowlerId;

    private BallSummary ballSummary;
    private BatsmanSummary batsmanSummary;
    private BatsmanSummary otherBatsmanSummary;
    private BowlerSummary bowlerSummary;
    private OverSummary overSummary;
    private InningCommentarySummary inningCommentarySummary;
    private Dismissal dismissalSummary;


    public String getBallId() {
        return ballId;
    }

    public void setBallId(String ballId) {
        this.ballId = ballId;
    }

    public long getBatsmanId() {
        return batsmanId;
    }

    public void setBatsmanId(long batsmanId) {
        this.batsmanId = batsmanId;
    }

    public long getBowlerId() {
        return bowlerId;
    }

    public void setBowlerId(long bowlerId) {
        this.bowlerId = bowlerId;
    }

    public BallSummary getBallSummary() {
        return ballSummary;
    }

    public void setBallSummary(BallSummary ballSummary) {
        this.ballSummary = ballSummary;
    }

    public BatsmanSummary getBatsmanSummary() {
        return batsmanSummary;
    }

    public void setBatsmanSummary(BatsmanSummary batsmanSummary) {
        this.batsmanSummary = batsmanSummary;
    }

    public BatsmanSummary getOtherBatsmanSummary() {
        return otherBatsmanSummary;
    }

    public void setOtherBatsmanSummary(BatsmanSummary otherBatsmanSummary) {
        this.otherBatsmanSummary = otherBatsmanSummary;
    }

    public BowlerSummary getBowlerSummary() {
        return bowlerSummary;
    }

    public void setBowlerSummary(BowlerSummary bowlerSummary) {
        this.bowlerSummary = bowlerSummary;
    }

    public OverSummary getOverSummary() {
        return overSummary;
    }

    public void setOverSummary(OverSummary overSummary) {
        this.overSummary = overSummary;
    }

    public InningCommentarySummary getInningCommentarySummary() {
        return inningCommentarySummary;
    }

    public void setInningCommentarySummary(InningCommentarySummary inningCommentarySummary) {
        this.inningCommentarySummary = inningCommentarySummary;
    }

    public Dismissal getDismissalSummary() {
        return dismissalSummary;
    }

    public void setDismissalSummary(Dismissal dismissalSummary) {
        this.dismissalSummary = dismissalSummary;
    }
}
