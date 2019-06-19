package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ById extends MainParameters implements TramInfo  {


    public List<String> getIDs() {
        List<String> IDs = new ArrayList<>();
        MainParameters properties = new MainParameters();

        for (Tram t : properties.getAllTramProperties()) {
            IDs.add(t.getId());

        }
        return IDs;
    }

    public String getIDsAsString() {
        StringBuilder builder = new StringBuilder();
        List<String> idsAsList = getIDs();
        for (String id : idsAsList) {
            builder.append(id + "\n");
        }

        return builder.toString();
    }

    public void createIDsFile() {

        File file = new File("IdTramList.txt");
        try (FileWriter fileWriter = new FileWriter(file, false)) {
            fileWriter.write(getIDsAsString());
        } catch (IOException e) {
            System.out.println("plik nie istnieje!");
            e.printStackTrace();
        }
        System.out.println("dodano:" + getIDs().size() + " linijek");


    }

    @Override
    public void getLocation(List<Tram> t) {

    }

    @Override
    public void getDescription(List<Tram> t) {

    }
}
