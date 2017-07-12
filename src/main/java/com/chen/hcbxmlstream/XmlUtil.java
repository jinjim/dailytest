package com.chen.hcbxmlstream;

import com.thoughtworks.xstream.XStream;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by dorid on 2016/10/12.
 */
public class XmlUtil {

    public static final int INDEX_NOT_FOUND = -1;
    public static final String OPEN_HEAD_LABLE    = "<Head>";
    public static final String CLOSE_HEAD_LABLE   = "</Head>";
    public static final String OPEN_BODY_LABLE    = "<Body>";
    public static final String CLOSE_BODY_LABLE   = "</Body>";

    public static class MyXstram extends XStream{

        public static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";

        public String toXML(Object obj) {
            return XML_HEADER + super.toXML(obj);
        }
    }

    public static String toXml(Object obj) {
        XStream xstream = new MyXstram();
        xstream.processAnnotations(obj.getClass());
        xstream.aliasSystemAttribute(null, "class");

        return StringEscapeUtils.unescapeXml(xstream.toXML(obj));
    }

    public static <T> T toBean(String xmlStr, Class<T> clazz) {
        XStream xstream = new MyXstram();
        xstream.processAnnotations(clazz);
        @SuppressWarnings("unchecked")
        T obj = (T) xstream.fromXML(xmlStr);
        return obj;
    }

    // public staticproxy NyLoanReqBean toNyLoanBean(String xmlStr, Class bodyClzz) {
    //     final String openLbale  = "<Body>";
    //     final String closeLable = "</Body>";
    //     NyLoanReqBean nyLoanRequest = toNyLoanBeanBewteenLoable(xmlStr, bodyClzz, openLbale, closeLable);
    //     return nyLoanRequest;
    // }

    /**
     * 信贷信息响应
     *
     * @param xmlStr
     * @param bodyClzz
     * @return
     */
    public static NyLoanRepBean toNyLoanBean(String xmlStr, Class bodyClzz) {
        String bodyXml = substringBetween(xmlStr, OPEN_BODY_LABLE, CLOSE_BODY_LABLE);
        NyLoanRepBean nyLoanRepBean = toNyLoanReqBean(xmlStr, NyLoanRepBean.class, bodyXml);
        if(StringUtils.isNotBlank(bodyXml)){
            NyLoanBody nyLoanReqBody = (NyLoanBody) toBean(bodyXml, bodyClzz);
            nyLoanRepBean.setBody(nyLoanReqBody);
        }

        return nyLoanRepBean;
    }

    /**
     * 信贷信息响应
     *
     * @param xmlStr
     * @return
     */
    public static NyLoanRepBean toNyLoanBeanWithoutBody(String xmlStr) {
        String bodyXml = substringBetween(xmlStr, OPEN_BODY_LABLE, CLOSE_BODY_LABLE);
        NyLoanRepBean nyLoanRepBean = toNyLoanReqBean(xmlStr, NyLoanRepBean.class, bodyXml);
        return nyLoanRepBean;
    }

    /**
     * 转成南粤信贷系统所需要的bean对象
     *
     * @param xml
     * @param clazz
     * @param bodyXml
     * @return
     */
    public static <T> T toNyLoanReqBean(String xml, Class<T> clazz, String bodyXml) {
        String content = StringUtils.isBlank(bodyXml) ? xml : xml.replace(bodyXml, StringUtils.EMPTY);
        XStream xstream = new MyXstram();
        xstream.processAnnotations(clazz);
        T targetBeawn = toBean(content, clazz);
        return targetBeawn;
    }

    /**
     * 截取指定标签中间的字串
     *
     * @param content
     * @param open
     * @param close
     * @return
     */
    public static String substringBetween(final String content, final String open, final String close) {
        if (content == null || open == null || close == null) {
            return null;
        }
        final int start = content.indexOf(open);
        if (INDEX_NOT_FOUND != start) {
            final int end = content.indexOf(close) + close.length();
            if (INDEX_NOT_FOUND != end){
                return content.substring(start, end);
            }
        }
        return null;
    }
}
