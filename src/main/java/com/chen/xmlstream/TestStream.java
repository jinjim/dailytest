package com.chen.xmlstream;

import org.apache.commons.lang3.StringEscapeUtils;

import com.alibaba.fastjson.JSON;
import com.thoughtworks.xstream.XStream;

public class TestStream {
	public static void main(String[] args) {  
        String res=toXML();  
        
        System.out.println("---------------------------------------------");
        
        toEntity(res);  
    }  
      
    public static void toEntity(String inputXML){  
        XStream xs = new XStream();  
//        这句和@XStreamAlias("person")等效  
//        xs.alias("person",Person.class);  
//        xs.alias("address",Address.class);  
        xs.setMode(XStream.NO_REFERENCES);  
//      这句和@XStreamImplicit()等效  
//        xs.addImplicitCollection(Person.class,"addresses");  
//        这句和@XStreamAsAttribute()  
//        xs.useAttributeFor(Person.class, "name");  
        //注册使用了注解的VO  
        
//        xs.processAnnotations(new Class[]{Person.class, Address.class, Student.class});  // 返射解析需要制定类型
//        Person person = (Person)xs.fromXML(inputXML);  
        
//        Class[] clazzs = new Class[] {Person.class, Address.class, Student.class};
        
        Person person = XstreamUtil.toBean(inputXML, Person.class);
        
        System.out.println(JSON.toJSONString(person, true));  
    }  
      
    public static String toXML(){  
        XStream xStream = new XStream(); 
        
        Address address1 = new Address();  
        address1.setHouseNo(888);  
        address1.setStreet("newyork");  
        Address address2 = new Address();  
        address2.setHouseNo(76767);  
        address2.setStreet("toyo");
        Address address3 = new Address();  
        address2.setHouseNo(123);  
        address2.setStreet("CC");
        
        Student student = new Student();
        student.setId("123");
        student.setScore(200);
        
        Person person = new Person();  
        person.setName("test");  
        person.setPhoneNuber(999);
        person.setAddress(address3);
        person.getAddresses().add(address1);  
        person.getAddresses().add(address2);
        person.setStudent(student);

        
//        xStream.alias("person", Person.class);  
//        xStream.alias("address",Address.class);  
        xStream.setMode(XStream.NO_REFERENCES);  
//        xStream.addImplicitCollection(Person.class, "addresses");  
//        xStream.useAttributeFor(Person.class,"name");  
        //注册使用了注解的VO  
//        xStream.processAnnotations(person.getClass());  // bean的转化
//        xStream.processAnnotations(new Class[]{Person.class, Address.class, Student.class});  // bean的转化
//        String xml = xStream.toXML(person);  
//        Class[] clazzs = new Class[] {Person.class, Address.class, Student.class};
        String xml = XstreamUtil.toXml(person);
        
        System.out.println(StringEscapeUtils.unescapeXml(xml));  
        return xml;  
    }  
}
