package tutorial.javari;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.simpleflatmapper.csv.CsvParser;
import org.simpleflatmapper.csv.CsvWriter;
import org.simpleflatmapper.util.CheckedConsumer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tutorial.javari.animal.Animal;

@RestController
public class JavariController {
    private static ArrayList<Animal> animalList = new ArrayList<>();
    private File file;

    public JavariController() throws IOException {
        file = new File("./tutorial-9/src/main/java/tutorial/javari/animal_record.csv");
        CsvParser.mapTo(Animal.class).forEach(file, animalList::add);
    }

    @RequestMapping(value = "/javari", method = RequestMethod.GET)
    public List<Animal> getAllAnimals() {
        return animalList;
    }


    @RequestMapping(value = "/javari/{id}", method = RequestMethod.GET)
    public List<Animal> getAnimalById(@PathVariable("id") int id) {
        Stream<Animal> getResult = animalList.stream().filter(animal -> animal.getId() == id);
        return getResult.collect(Collectors.toList());
    }

    @RequestMapping(value = "/javari/{id}", method = RequestMethod.DELETE)
    public List<Animal> deleteAnimalById(@PathVariable("id") int id) {
        Stream<Animal> deleteResult = animalList.stream().filter(animal -> animal.getId() == id);
        List<Animal> deletedAnimal = deleteResult.collect(Collectors.toList());
        animalList.removeIf(animal -> animal.getId() == id);
        return deletedAnimal;
    }

    @RequestMapping(value = "/javari", method = RequestMethod.POST)
    public void addedAnimal(@RequestBody Animal animal) {
        animalList.add(animal);
    }

}
