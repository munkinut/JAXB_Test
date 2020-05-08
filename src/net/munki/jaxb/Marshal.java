package net.munki.jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;

public class Marshal {

    public static void main(String[] args) {

        System.out.println("JAXB_Test Marshal...\n");

        Users users = new Users();

        ArrayList<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setName("munki");
        user1.setAge(50);
        userList.add(user1);

        User user2 = new User();
        user2.setName("javamunk");
        user2.setAge(35);
        userList.add(user2);

        users.setUsers(userList);

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
