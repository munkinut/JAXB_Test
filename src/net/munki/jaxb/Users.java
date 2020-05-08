package net.munki.jaxb;

import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlType;

@XmlRootElement
public class Users {

    private String user;

    public Users() {
        user = "";
    }

    public String getUser() {
        return this.user;
    }

    @XmlElement
    public void setUser(String user) {
        this.user = user;
    }

}
