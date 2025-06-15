import java.time.LocalDateTime;

public class LimitedTimeTask extends Task{
    private LocalDateTime dedlineDateTime;

    public LimitedTimeTask(String createdBy,String name,String description, LocalDateTime dedlineDateTime)
    {
        super(createdBy,name,description);
        this.dedlineDateTime = dedlineDateTime;
    }

    public LocalDateTime getDedLineDateTime() {
        return dedlineDateTime;
    }

    public void setDedlineDateTime(LocalDateTime dedlineDateTime) {
        this.dedlineDateTime = dedlineDateTime;
    }
}
