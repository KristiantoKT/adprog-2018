package tutorial.javari;

import org.simpleflatmapper.csv.CsvParser;
import org.springframework.web.bind.annotation.*;
import tutorial.javari.animal.Animal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class JavariController {
    private static ArrayList<Animal> animalList = new ArrayList<>();
    private File file;

    public JavariController() throws IOException {
        file = new File("./tutorial-9/src/main/java/tutorial/javari/animal_record.csv");
        CsvParser.mapTo(Animal.class).forEach(file, animalList::add);
    }

    @RequestMapping(value = "/javari", method = RequestMethod.GET)
    public ArrayList<Animal> getAllAnimals() {
        return animalList;
    }


    @RequestMapping(value = "/javari/{id}", method = RequestMethod.GET)
    public List<Animal> getAnimalById(@PathVariable("id") int id){
        Stream<Animal> getResult = animalList.stream().filter(animal -> animal.getId() == id);
        return getResult.collect(Collectors.toList());
    }

    @RequestMapping(value = "/javari/{id}", method = RequestMethod.DELETE)
    public List<Animal> deleteAnimalById(@PathVariable("id") int id){
        Stream<Animal> deleteResult = animalList.stream().filter(animal -> animal.getId() == id);
        List<Animal> deletedAnimal = deleteResult.collect(Collectors.toList());
        animalList.removeIf(animal -> animal.getId() == id);
        return deletedAnimal;
    }

}
