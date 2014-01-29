package com.sidney.myspring.repository.ibatis;

public class SLongtext {
    private Integer id;

    private String useFilename;

    private String filename;

    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseFilename() {
        return useFilename;
    }

    public void setUseFilename(String useFilename) {
        this.useFilename = useFilename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}