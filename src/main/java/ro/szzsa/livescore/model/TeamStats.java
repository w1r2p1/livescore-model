package ro.szzsa.livescore.model;

public class TeamStats extends Model {

  private long teamId;

  private long standingsId;

  private int points;

  private int gamesPlayed;

  private int wins;

  private int losses;

  private int overtimeWins;

  private int overtimeLosses;

  private int goalsFor;

  private int goalsAgainst;

  private int place;

  public long getTeamId() {
    return teamId;
  }

  public void setTeamId(long teamId) {
    this.teamId = teamId;
  }

  public long getStandingsId() {
    return standingsId;
  }

  public void setStandingsId(long standingsId) {
    this.standingsId = standingsId;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public int getGamesPlayed() {
    return gamesPlayed;
  }

  public void setGamesPlayed(int gamesPlayed) {
    this.gamesPlayed = gamesPlayed;
  }

  public int getWins() {
    return wins;
  }

  public void setWins(int wins) {
    this.wins = wins;
  }

  public int getLosses() {
    return losses;
  }

  public void setLosses(int losses) {
    this.losses = losses;
  }

  public int getOvertimeWins() {
    return overtimeWins;
  }

  public void setOvertimeWins(int overtimeWins) {
    this.overtimeWins = overtimeWins;
  }

  public int getOvertimeLosses() {
    return overtimeLosses;
  }

  public void setOvertimeLosses(int overtimeLosses) {
    this.overtimeLosses = overtimeLosses;
  }

  public int getGoalsFor() {
    return goalsFor;
  }

  public void setGoalsFor(int goalsFor) {
    this.goalsFor = goalsFor;
  }

  public int getGoalsAgainst() {
    return goalsAgainst;
  }

  public void setGoalsAgainst(int goalsAgainst) {
    this.goalsAgainst = goalsAgainst;
  }

  public int getPlace() {
    return place;
  }

  public void setPlace(int place) {
    this.place = place;
  }
}
