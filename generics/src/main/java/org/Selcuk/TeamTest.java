package org.Selcuk;

public class TeamTest {
    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //TeamClass liverpool = new TeamClass("LiverPool");
        TeamClass<SoccerPlayer> liverpool = new TeamClass<>("Liverpool");
        //TeamClass<String> brokenTeam = new TeamClass<>("This won't work");
//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayer());
    }

}
