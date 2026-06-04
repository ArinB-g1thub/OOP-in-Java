class Team{
    String teamName;
    int teamSize;
}
class Player{
    int playerNum;
    String playerName;
    String playerPosition;
    Team team;
}
class Score{
    Team team;
    int goals;
}
class Match{
    String matchName;
    Team team1;
    Team team2;
    Score score1;
    Score score2;
}
class Schedule{
    Match match;
    String time;
    int duration;
    String location;
    float ticketPrice;
}