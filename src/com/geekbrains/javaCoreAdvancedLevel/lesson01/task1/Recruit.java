package com.geekbrains.javaCoreAdvancedLevel.lesson01.task1;

public class Recruit implements Running, Jumping{
    private String name;
    private int maxJump;
    private int maxDist;
    private boolean flagLoser;

    public boolean isFlagLoser() {
        return flagLoser;
    }

    public Recruit(String name, int maxJump, int maxDist) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxDist = maxDist;
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() > this.maxJump) {
            System.out.println(getNameClassAndNameObject() + " did not jumped over wall "
                    + wall.getHeight() + " meters high and got off");
            this.flagLoser = true;
        }
        else {
            System.out.println(getNameClassAndNameObject() + " jumped over wall "
                    + wall.getHeight() + " meters high");
        }
    }

    @Override
    public void run(RunningTrack track) {
        if (track.getLength() > this.maxDist) {
            System.out.println(getNameClassAndNameObject() + " did not ran a distance of "
                    + track.getLength() + " meters and got off");
            this.flagLoser = true;
        }
        else {
            System.out.println(getNameClassAndNameObject() + " ran a distance of "
                    + track.getLength() + " meters");
        }
    }

    private String getNameClassAndNameObject() {
        return this.getClass().getSimpleName() + " " + this.name;
    }
}
