public class Task {
    protected String createdBy;
    protected String name;
    protected String description;

    public Task(String createdBy, String name, String description)
    {
        this.createdBy = createdBy;
        this.name = name;
        this.description = description;
    }

    public String getCreatedBy()
    {
        return this.createdBy;
    }

    public void setCreatedBy(int id)
    {
        this.createdBy = createdBy;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
