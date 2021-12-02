package org.iesfm.institutoJPA;


import java.util.Objects;

public class Title {

    private int titleId;
    private String titleName;
    private String titleLevel;
    private String family;
    private String titleDescription;

    public Title(int titleId, String titleName, String titleLevel, String family, String titleDescription) {
        this.titleId = titleId;
        this.titleName = titleName;
        this.titleLevel = titleLevel;
        this.family = family;
        this.titleDescription = titleDescription;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleLevel() {
        return titleLevel;
    }

    public void setTitleLevel(String titleLevel) {
        this.titleLevel = titleLevel;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return titleId == title.titleId && Objects.equals(titleName, title.titleName) && Objects.equals(titleLevel, title.titleLevel) && Objects.equals(family, title.family) && Objects.equals(titleDescription, title.titleDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleId, titleName, titleLevel, family, titleDescription);
    }

    @Override
    public String toString() {
        return "Title{" +
                "titleId=" + titleId +
                ", titleName='" + titleName + '\'' +
                ", titleLevel='" + titleLevel + '\'' +
                ", family='" + family + '\'' +
                ", titleDescription='" + titleDescription + '\'' +
                '}';
    }
}
