package io;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FileFilterTests {
    @Test
    public void listAllFiles() {
        File root = new File(".");
        File[] files = root.listFiles();

        for (File f : files) {
            System.out.println(f);
        }

        assertEquals(9, files.length);
    }

    @Test
    public void listDirectoriesInRoot_anonInnerClass() {
        File root = new File(".");
        File[] directories = root.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });

        for (File f : directories) {
            System.out.println(f);
        }
        assertEquals(5, directories.length);
    }

    @Test
    public void listDirectoriesInRoot_lambda() {
        File root = new File(".");
        File[] directories = root.listFiles(name -> name.isDirectory());

        for (File f : directories) {
            System.out.println(f);
        }
        assertEquals(5, directories.length);
    }

    @Test
    public void listDirectoriesInRoot_methodReference() {
        File root = new File(".");
        File[] directories = root.listFiles(File::isDirectory);

        for (File f : directories) {
            System.out.println(f);
        }
        assertEquals(5, directories.length);
    }

    @Test
    public void printValues() {
        List<Integer> integers = Arrays.asList(3, 1, 4, 1, 5, 9);
        integers.forEach(n -> System.out.println("The value of n is " + n));
    }
}
