package com.nileshrajproject.ResearchBlog.Entity;

public class ResearchEntry {
    private Long id;
    private String topicName;
    private String report;
    private String description;
    private String summary;
    private String author;

    public ResearchEntry(Long id, String topicName, String report, String description, String summary, String author) {
        this.id = id;
        this.topicName = topicName;
        this.report = report;
        this.description = description;
        this.summary = summary;
        this.author = author;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
