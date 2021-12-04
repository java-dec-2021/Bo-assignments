

public class ProjectTest {
    public static void main(String[] args) {
        Project p = new Project();
        p.setName("Bo");
        p.setDescription("Foosball Champ");
        p.setInitialCost(15.5);
        System.out.println(p.elevatorPitch());
    }
}
