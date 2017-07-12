package com.chen.xmlstream;

import org.apache.commons.lang3.StringEscapeUtils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class XstreamUtil {

	public static String toXml(Object obj){
        XStream xstream=new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
        xstream.processAnnotations(obj.getClass());
        xstream.aliasSystemAttribute(null, "class");
        return StringEscapeUtils.unescapeXml(xstream.toXML(obj));
    }
	
	public static <T> T toBean(String xmlStr, Class<T> clazz){
        XStream xstream=new XStream();
        xstream.processAnnotations(clazz);
        @SuppressWarnings("unchecked")
		T obj= (T) xstream.fromXML(xmlStr);
        return obj;         
    } 
}
