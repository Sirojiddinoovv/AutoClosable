package uz.nodir.autoclosabledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.Printer;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

@SpringBootApplication
public class AutoClosableDemoApplication {

    public static void main(String[] args) {


        SpringApplication.run(AutoClosableDemoApplication.class, args);
    }

}
