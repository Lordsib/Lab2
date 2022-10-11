package ExLab2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MVCPatternDemo {
    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
        List<Team> model  = readTeam();

        //Create a view : to write course details on console
        TeamView view = new TeamView();

        for (Team team : model) {
            TeamController controller = new TeamController(team, view);
             controller.updateView();
            System.out.println("\n\n");
        }

    }

    private static List<Team> readTeam(){

        Scanner in = new Scanner(System.in);

        System.out.println("Number of teams: ");
        int num_teams = in.nextInt();
        List<Team> myList = new ArrayList<Team>();
        System.out.println("\n--------------\n");
        while(num_teams > 0)
        {
            myList.add(retriveTeamFromDatabase());
            num_teams--;
        }
        return myList;
    }

    private static Team retriveTeamFromDatabase(){
        Scanner in = new Scanner(System.in);
        Team team = new Team();

        System.out.println("Name of team: ");
        String s1 = in.nextLine();
        team.setName(s1);

        System.out.println("ID of team: ");
        String s2 = in.nextLine();
        team.setId(s2);

        System.out.println("Sport of team: ");
        String s3 = in.nextLine();
        team.setSport(s3);

        System.out.println("\n--------------\n");
        return team;
    }
}