

public class Project {
    private String name;
    private String description;
    private Double initialCost;

    public String elevatorPitch() {
        return name + "(" + initialCost + ") : " + description;
    }
    
    public Project() {}

    public Project(String  name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(Double initialCost) {
        this.initialCost = initialCost;
    }
}
