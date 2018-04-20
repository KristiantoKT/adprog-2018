package tutorial.javari;

import org.simpleflatmapper.csv.CsvParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tutorial.javari.animal.Animal;
import tutorial.javari.animal.Condition;
import tutorial.javari.animal.Gender;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class JavariController {
    private static ArrayList<Animal> animalArrayList = new ArrayList<>();
    private File file;

    public JavariController() throws IOException {
        file = new File("./tutorial-9/src/main/java/tutorial/javari/animal_record.csv");
        //CsvParser.forEach(file, row -> System.out.println(Arrays.toString(row)));
        CsvParser.mapTo(Animal.class).forEach(file, animalArrayList::add);
    }

    @RequestMapping(value = "/javari", method = RequestMethod.GET)
    public ArrayList<Animal> animals() {
        return animalArrayList;
    }
}
