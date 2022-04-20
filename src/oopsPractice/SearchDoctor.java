package oopsPractice;

import java.util.List;
import java.util.Set;

public class SearchDoctor {
}
class Doctor{
    private String name;
    private String speciality;
    private int experience;

    public Doctor(String name, String speciality, int experience) {
        this.name = name;
        this.speciality = speciality;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
}

class DoctorService{
    private List<Doctor> doctorRepository;
    public DoctorService(List<Doctor> doctorRepository){
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getExperiencedDoctors(int input){
        
        return null;
    }
    public Set<Doctor> getSpecialityDoctor(String input){

        return null;
    }

}
class SearchDoctorApp{

}
