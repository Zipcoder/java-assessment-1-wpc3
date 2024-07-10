package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {


    /**
     * @param name name of this Cat
     * @param age age of this Cat
     *
     */

    private String name;
    private int age;
    private PetOwner owner;

    public Cat(String name, Integer age) {
        this.name = name;

        this.age = age;

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.name = "Cat name";
        this.age = age;

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {

        this.name = name;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this.name = "Cat name";
        this.age = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {

        return "Meow";
    }



    @Override
    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = 0;
//    }

    @Override
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//
//        this.name = "Cat name";
//    }
}
