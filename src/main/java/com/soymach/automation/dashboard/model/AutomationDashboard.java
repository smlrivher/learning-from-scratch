package com.soymach.automation.dashboard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("automationDashboard")
public class AutomationDashboard {
    @Id
    private String id;
    private String name;
    private String lastResult;
    private String lastPassed;
    private String bugs;
    private String status;
    private String result;
    private String assignee;
    private String comments;

    public AutomationDashboard(String id, String name, String lastresult, String lastpassed, String bugs, String status,
                               String result, String assignee, String comments) {
        super();
        this.id = id;
        this.name = name;
        this.lastResult = lastresult;
        this.lastPassed = lastpassed;
        this.bugs = bugs;
        this.status = status;
        this.result = result;
        this.assignee = assignee;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastResult() {
        return lastResult;
    }

    public void setLastResult(String lastResult) {
        this.lastResult = lastResult;
    }

    public String getLastPassed() {
        return lastPassed;
    }

    public void setLastPassed(String lastPassed) {
        this.lastPassed = lastPassed;
    }

    public String getBugs() {
        return bugs;
    }

    public void setBugs(String bugs) {
        this.bugs = bugs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
