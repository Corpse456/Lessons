package lesson47.artifact47;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;

public class MainExample {

    public static void main (String[] args) throws IOException, InterruptedException {
        emptyLines();
        System.out.println("                        GOOOOOD!");

        InputStream input = MainExample.class.getClassLoader().getResourceAsStream("artifact47/test.xml");
        List<String> lines = IOUtils.readLines(input, "UTF-8");

        // File file = new File("./pom.xml");
        // List<String> lines = FileUtils.readLines(file, "UTF-8");

        System.out.println(lines.get(2));

        emptyLines();
        Thread.sleep(10000);
    }

    private static void emptyLines () {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}
