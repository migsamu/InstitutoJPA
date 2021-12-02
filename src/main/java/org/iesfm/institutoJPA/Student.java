package org.iesfm.institutoJPA;

import java.util.Objects;

public class Student {
    private String nif;
    private String studentName;
    private String studentSurname;
    private int zipcode;
    private String address;
    private String email;

    public Student(String nif, String studentName, String studentSurname, int zipcode, String address, String email) {
        this.nif = nif;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.zipcode = zipcode;
        this.address = address;
        this.email = email;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return zipcode == student.zipcode && Objects.equals(nif, student.nif) && Objects.equals(studentName, student.studentName) && Objects.equals(studentSurname, student.studentSurname) && Objects.equals(address, student.address) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, studentName, studentSurname, zipcode, address, email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nif='" + nif + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", zipcode=" + zipcode +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
