package com.chen.xmlstream;

import com.alibaba.fastjson.JSON;
import com.thoughtworks.xstream.XStream;
import org.apache.commons.lang3.StringEscapeUtils;

class FunderExtTest {
    public static void main(String[] args) {

        NyLoanRequetVO<NyLoanRequetBodyVO> nyLoanRequetVO =  new NyLoanRequetVO<>();
        NyLoanRequetHeadVO nyLoanRequetHeadVO  = new NyLoanRequetHeadVO();
        NyLoanRequetBodyVO nyLoanRequetBodyVO = new NyLoanRequetBodyVO();
        // nyLoanRequetVO.setHead(nyLoanRequetHeadVO);

        nyLoanRequetHeadVO.setTransCode("123");
        nyLoanRequetHeadVO.setTransDate("20161012");
        nyLoanRequetHeadVO.setTransTime("121212");
        nyLoanRequetHeadVO.setEntrNo("123456789");
        nyLoanRequetHeadVO.setBusiDate("20161012");
        nyLoanRequetHeadVO.setSeqNo("004466");
        nyLoanRequetHeadVO.setVersionId("1.0");
        nyLoanRequetHeadVO.setBusiType("10086");

        Student student = new Student();
        student.setId("1");
        student.setScore(123);
        nyLoanRequetVO.setBody(nyLoanRequetBodyVO);
        nyLoanRequetBodyVO.setName("chenlaing");
        nyLoanRequetBodyVO.setStudent(student);

        // nyLoanRequetVO.setBody(XstreamUtil.toXml(nyLoanRequetBodyVO));

        String xml = XstreamUtil.toXml(nyLoanRequetVO);

        System.out.println(StringEscapeUtils.unescapeXml(xml));

        System.out.println("-------------------------------------------------------");

        Class[] clazzs = new Class[] {NyLoanRequetVO.class, NyLoanRequetBodyVO.class};

        // NyLoanRequetVO person = XstreamUtil.toBean(xml, NyLoanRequetVO.class);

        XStream xstream = new XStream();
        xstream.processAnnotations(clazzs);
        NyLoanRequetVO  tt =  (NyLoanRequetVO)xstream.fromXML(xml);

        System.out.println(JSON.toJSONString(tt, true));

    }
}