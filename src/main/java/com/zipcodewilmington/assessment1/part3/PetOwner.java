package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     *
     */
    private String name;

    private PetOwner petOwner;
    private List<Pet> pets;


    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = new ArrayList<>();

        if(pets != null) {
            for (Pet pet : pets) {
                this.pets.add(pet);
                pet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {


        pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {


        pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {


        return pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int age= pets.get(0).getAge();
        for(Pet pet : pets ){
            //if this pet is younger update value of age
            if(pet.getAge() < age){
                age = pet.getAge();
            }
        }

        return age;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        int age= pets.get(0).getAge();
        for(Pet pet : pets ){
            //if this pet is younger update value of age
            if(pet.getAge() > age){
                age = pet.getAge();
            }
        }

        return age;


    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {

        int sum = 0;

        for(Pet pet : pets){
            sum += pet.getAge();
        }

        return (float) sum/pets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return pets.toArray(new Pet[pets.size()+1]);
    }
}
