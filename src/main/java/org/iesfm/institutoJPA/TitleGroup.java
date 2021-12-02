package org.iesfm.institutoJPA;

import java.util.Objects;

public class TitleGroup {

    private int groupId;
    private String course;
    private String letter;
    private String title;
    private int groupYear;

    public TitleGroup(int groupId, String course, String letter, String title, int groupYear) {
        this.groupId = groupId;
        this.course = course;
        this.letter = letter;
        this.title = title;
        this.groupYear = groupYear;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGroupYear() {
        return groupYear;
    }

    public void setGroupYear(int groupYear) {
        this.groupYear = groupYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleGroup that = (TitleGroup) o;
        return groupId == that.groupId && groupYear == that.groupYear && Objects.equals(course, that.course) && Objects.equals(letter, that.letter) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, course, letter, title, groupYear);
    }

    @Override
    public String toString() {
        return "TitleGroup{" +
                "groupId=" + groupId +
                ", course='" + course + '\'' +
                ", letter='" + letter + '\'' +
                ", title='" + title + '\'' +
                ", groupYear=" + groupYear +
                '}';
    }
}
