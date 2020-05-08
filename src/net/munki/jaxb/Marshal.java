package net.munki.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;

public class Marshal {

    public static void main(String[] args) {

        System.out.println("Hello from JAXB_Test.");

        Users users = new Users();
        users.setUser("munki");

        try {

            // create JAXB context and initializing Marshal
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // for getting nice formatted output
            jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //specify the location and name of xml file to be created
            File XMLfile = new File("C:\\Users\\Warren\\IdeaProjects\\JAXB_Test\\out\\users.xml");

            // Writing to XML file
            jaxbMarshaller.marshal(users, XMLfile);
            // Writing to console
            jaxbMarshaller.marshal(users, System.out);

        } catch (JAXBException e) {
            // some exception occured
            e.printStackTrace();
        }

    }
}
