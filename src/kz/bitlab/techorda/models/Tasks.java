package kz.bitlab.techorda.models;

public class Tasks {
    private Long id;
    private String name;
    private String description;
    private String deadlineDate;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Tasks() {
    }
    public Tasks(Long id, String name, String description, String deadlineDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
    }

    public Tasks(Long id, String name, String description, String deadlineDate, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
        this.status = status;
    }

    public Tasks(String name, String description, String deadlineDate, String status) {
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }
}
