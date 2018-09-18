package com.lee.learn.dp.behavioralpattern.command;

public class TeamLeader implements Leader {

    private Requirement requirement;

    public TeamLeader(Requirement requirement) {
        this.requirement = requirement;
    }

    @Override
    public void dispatch(Requirement requirement) {
        requirement.develop();
    }
}
