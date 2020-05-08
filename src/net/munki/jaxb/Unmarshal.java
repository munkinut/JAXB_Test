package net.munki.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshal {

    public static void main(String[] args) {

        System.out.println("Hello from JAXB_Test.");

        try {

            // create JAXB context and initializing Marshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            // specify the location and name of xml file to be read
            File XMLfile = new File("C:\\Users\\Warren\\IdeaProjects\\JAXB_Test\\out\\users.xml");

            // this will create Java object - country from the XML file
            Users users = (Users) jaxbUnmarshaller.unmarshal(XMLfile);

            System.out.println("User Name: " + users.getUser());


        } catch (JAXBException e) {
            // some exception occured
            e.printStackTrace();
        }
    }

}
