package tutorial.javari;

import org.simpleflatmapper.csv.CsvParser;
import org.simpleflatmapper.csv.CsvWriter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tutorial.javari.animal.Animal;

import javax.servlet.http.HttpServletRequest;
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
    CsvWriter.CsvWriterDSL<Animal> writerDSL = CsvWriter.from(Animal.class).columns("id", "type", "name", "body", "condition");

    public JavariController() throws IOException {
        file = new File("./tutorial-9/src/main/java/tutorial/javari/animal_record.csv");
        CsvParser.mapTo(Animal.class).forEach(file, animalList::add);
    }

    @RequestMapping(value = "/javari", method = RequestMethod.GET)
    public List<Animal> getAllAnimals() {
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

    @RequestMapping(value = "/javari", method = RequestMethod.POST)
    public void addedAnimal(@RequestBody Animal animal){
        
        animalList.add(animal);
    }

}
