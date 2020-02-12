package com.module;

import javax.xml.bind.*;
import java.io.StringWriter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
class Message{
    @XmlElement
    public String message = "Hello world in XML";

}

public class HelloWorldXml {

    public static void main(String args[]) throws JAXBException{

        /*JAXBContext jaxb = JAXBContext.newInstance(Message.class);
        Marshaller marshaller = jaxb.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        StringWriter writer = new StringWriter();
        marshaller.marshal(new Message(), writer);
        System.out.println(writer.toString());*/
        System.out.println("Hello");


    }

}
