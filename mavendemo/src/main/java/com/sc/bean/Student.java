package com.sc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * desc
 *
 * @author sc135
 * @date 2020-07-25 15:33  星期六
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    /**
     * id : 1
     * name : tt
     * age : 45
     * shcool : sdfsd
     * Person : [{"id":1,"name":"u"},{"id":1,"name":"u"}]
     * teacher : {"id":2,"name":"hh"}
     */

    private int id;
    private String name;
    private int age;
    private String shcool;
    private Teacher teacher;
    private List<Person> Person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getShcool() {
        return shcool;
    }

    public void setShcool(String shcool) {
        this.shcool = shcool;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Person> getPerson() {
        return Person;
    }

    public void setPerson(List<Person> Person) {
        this.Person = Person;
    }

    public static class Teacher {
        /**
         * id : 2
         * name : hh
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Person {
        /**
         * id : 1
         * name : u
         */

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
