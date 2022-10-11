package ExLab2;

public class TeamController {
    private Team model;
    private TeamView view;

    public TeamController(Team model, TeamView view){
        this.model = model;
        this.view = view;
    }

    public void setTeamName(String name){
        model.setName(name);
    }

    public String getTeamName(){
        return model.getName();
    }

    public void setTeamId(String id){
        model.setId(id);
    }

    public String getTeamId(){
        return model.getId();
    }

    public void setTeamCategory(String category){
        model.setSport(category);
    }

    public String getTeamCategory(){
        return model.getSport();
    }
    public void updateView(){
        view.printTeamDetails(model.getName(), model.getId(), model.getSport());
    }
}