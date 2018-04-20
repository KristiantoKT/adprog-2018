package tutorial.javari;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tutorial.javari.animal.Animal;
import tutorial.javari.animal.Condition;
import tutorial.javari.animal.Gender;

import java.util.ArrayList;

@RestController
public class JavariController {
    private static ArrayList<Animal> animalArrayList = new ArrayList<>();
    private static final String COMMA = ",";

    @RequestMapping(value = "/animal", method = RequestMethod.GET)
    public ArrayList<Animal> animals(){
        animalArrayList.add(new Animal(2,"Lion","nala",Gender.MALE,
                150,130,Condition.HEALTHY));
        return animalArrayList;
    }
}
