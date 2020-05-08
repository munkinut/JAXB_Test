package net.munki.jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshal {

    public static void main(String[] args) {

        System.out.println("JAXB_Test Unmarshal...\n");

        try {

            // create JAXB context and initializing Marshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            // specify the location and name of xml file to be read
            File XMLfile = new File("C:\\Users\\Warren\\IdeaProjects\\JAXB_Test\\out\\users.xml");

            // this will create Java object - country from the XML file
            Users users = (Users) jaxbUnmarshaller.unmarshal(XMLfile);

            ArrayList<User> userList = users.getUsers();
            for(User user:userList) {
                System.out.println("User: " + user.getName() + " aged " + user.getAge());
            }

        } catch (JAXBException e) {
            // some exception occured
            e.printStackTrace();
        }
    }

}
