package Edocument.edoc.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity //Базада таблица яратади
@Table(name = "Roles") // таблицани хусусиятларини аниклайди
@Getter
@Setter
public class People {

    public People() {

    }

    public People(String fullName, Integer age, Double salary, String work) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
        this.work = work;
    }

    @Id //Первичный ключ
    @GeneratedValue(strategy = GenerationType.AUTO) // Усиш тоифасини аниклайди
    private Integer id;
    @Column(length = 255,nullable = false, unique = true) // Устун хусусиятларини аниклайди
    private String fullName;

    private Integer age;
    private Double salary;
    private String work;

    @Transient //Майдонни базадаги устунини яратмайди
    private String something;


//    @OneToMany(mappedBy = "person")
//    private List<Work> works;
//
//    @ManyToMany(mappedBy = "people")
//    private List<RoleEntity> roles;


}
