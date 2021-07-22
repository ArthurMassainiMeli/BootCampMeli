package br.com.meli.consultorioapijpa.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dentists")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentist")
    @JsonAlias("id_dentist")
    private Integer idDestist;

    private String name;

    @Column(name = "last_name")
    @JsonAlias("last_name")
    private String lastName;

    private String address;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "birth_date")
    @JsonAlias("birth_date")
    private LocalDate birthDate;

    private String phone;

    private String email;

    @OneToMany(targetEntity = Diary.class, mappedBy = "dentist", cascade = CascadeType.ALL)
    private List<Diary> diarys = new ArrayList<>();

    // constructors

    public Dentist(String name, String lastName, String address, LocalDate birthDate, String phone, String email, List<Diary> diarys) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.diarys = diarys;
    }

    public Dentist() {
    }

    // getters and setters

    public Integer getIdDestist() {
        return idDestist;
    }

    public void setIdDestist(Integer idDestist) {
        this.idDestist = idDestist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Diary> getDiarys() {
        return diarys;
    }

    public void setDiarys(List<Diary> diarys) {
        this.diarys = diarys;
    }
}
