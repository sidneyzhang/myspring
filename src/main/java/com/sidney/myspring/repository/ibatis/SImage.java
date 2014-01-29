package com.sidney.myspring.repository.ibatis;

public class SImage {
    private Integer id;

    private String format;

    private String useFilename;

    private String filename;

    private byte[] image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}