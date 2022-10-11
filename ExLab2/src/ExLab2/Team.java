package ExLab2;

public class Team {
    private String TeamName;
    private String TeamId;
    private String TeamSport;

    public String getId() {
        return TeamId;
    }

    public void setId(String id) {
        this.TeamId = id;
    }

    public String getName() {
        return TeamName;
    }

    public void setName(String name) {
        this.TeamName = name;
    }

    public String getSport() {
        return TeamSport;
    }

    public void setSport(String category) {
        this.TeamSport = category;
    }

}