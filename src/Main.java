import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	    ProcessBuilder ficheroPrueba = new ProcessBuilder();
        ficheroPrueba.command("../Hola.txt");

        ProcessBuilder[] builders = {
                new ProcessBuilder("cat","../Hola"),
                new ProcessBuilder("wc"),};


        try {
            ficheroPrueba.start();
            List<Process> processes = ProcessBuilder.startPipeline(Arrays.asList(builders));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
