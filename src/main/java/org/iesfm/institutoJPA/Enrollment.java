package org.iesfm.institutoJPA;

import java.util.Objects;

public class Enrollment {

    private int enrollmentId;
    private String nif;
    private int enrollmentYear;
    private int titleId;
    private int groupId;
    private String enrollmentStatus;

    public Enrollment(int enrollmentId, String nif, int enrollmentYear, int titleId, int groupId, String enrollmentStatus) {
        this.enrollmentId = enrollmentId;
        this.nif = nif;
        this.enrollmentYear = enrollmentYear;
        this.titleId = titleId;
        this.groupId = groupId;
        this.enrollmentStatus = enrollmentStatus;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enrollment that = (Enrollment) o;
        return enrollmentId == that.enrollmentId && enrollmentYear == that.enrollmentYear && titleId == that.titleId && groupId == that.groupId && Objects.equals(nif, that.nif) && Objects.equals(enrollmentStatus, that.enrollmentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enrollmentId, nif, enrollmentYear, titleId, groupId, enrollmentStatus);
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId=" + enrollmentId +
                ", nif='" + nif + '\'' +
                ", enrollmentYear=" + enrollmentYear +
                ", titleId=" + titleId +
                ", groupId=" + groupId +
                ", enrollmentStatus='" + enrollmentStatus + '\'' +
                '}';
    }
}
