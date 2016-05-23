package org.whl.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Java2XML {

    /**
     * @param args
     * @throws JAXBException
     */
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(People.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "gb2312");// 编码格式
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// 是否格式化生成的xml串
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);// 是否省略xml头信息（<?xml version="1.0"
                                                                // encoding="gb2312"
                                                                // standalone="yes"?>）

        People people = new People();
        marshaller.marshal(people, System.out);
    }
}
