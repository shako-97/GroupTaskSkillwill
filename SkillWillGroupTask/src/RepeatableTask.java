import java.time.LocalDateTime;

public class RepeatableTask extends Task {
    private LocalDateTime timeToExecute;
    private int executionLimit;
    public RepeatableTask(String createdBy, String name, String description,
                          LocalDateTime timeToExecute, int executionLimit)
    {
        super(createdBy,name,description);
        this.timeToExecute = timeToExecute;
        this.executionLimit = executionLimit;
    }

    public int getExecutionLimit() {
        return executionLimit;
    }

    public void setExecutionLimit(int executionLimit) {
        this.executionLimit = executionLimit;
    }

    public LocalDateTime getTimeToExecute() {
        return timeToExecute;
    }

    public void setTimeToCreate(LocalDateTime timeToExecute) {
        this.timeToExecute = timeToExecute;
    }
}
