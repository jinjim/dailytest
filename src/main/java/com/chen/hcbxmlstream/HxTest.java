package com.chen.hcbxmlstream;

import com.alibaba.fastjson.JSON;

/**
 * @author liang.chen
 * @create 2016-10-13
 */
public class HxTest {
    public static void main(String[] args) {
        String mxl =  toXmlTest();
        System.out.println("-----------------------------------------------------");
        toBeanTest(mxl);
    }

    private static String toXmlTest(){
        // NyLoanReqBean nyLoanReqBean = new NyLoanReqBean();
        // NyLoanReqApplyBody nyLoanRequestApplyBody = new NyLoanReqApplyBody();
        //
        // // 设置头
        // nyLoanReqBean.getHead().setTransCode("123");
        // nyLoanReqBean.getHead().setTransDate("20161012");
        // nyLoanReqBean.getHead().setTransTime("121212");
        // nyLoanReqBean.getHead().setEntrNo("123456789");
        // nyLoanReqBean.getHead().setBusiDate("20161012");
        // nyLoanReqBean.getHead().setSeqNo("004466");
        // nyLoanReqBean.getHead().setVersionId("1.0");
        // nyLoanReqBean.getHead().setBusiType("10086");
        //
        // // 设置body信息
        // Student student = new Student();
        // student.setId("123");
        // student.setScore(100);
        // nyLoanRequestApplyBody.setStudent(student);
        //
        // nyLoanRequestApplyBody.setAddress("chengdu");
        // nyLoanRequestApplyBody.setName("testName");

        // nyLoanReqBean.setBody(nyLoanRequestApplyBody);

        // String xml = XmlUtil.toXml(nyLoanReqBean);

        NyLoanRepBean nyLoanRepBean = new NyLoanRepBean();
        nyLoanRepBean.getHead().setOrgBusiDate("20161013");
        nyLoanRepBean.getHead().setOrgSeqNo("1234567890");
        nyLoanRepBean.getHead().setRespCode("000000");
        nyLoanRepBean.getHead().setRespMsg("hiehie");

        // 设置body信息
        // NyLoanRepApplyBody nyLoanRepApplyBody = new NyLoanRepApplyBody();
        // Student student = new Student();
        // student.setId("123");
        // student.setScore(100);
        // nyLoanRepApplyBody.setStudent(student);
        //
        // nyLoanRepApplyBody.setAddress("chengdu");
        // nyLoanRepApplyBody.setName("testName");
        //
        // nyLoanRepBean.setBody(nyLoanRepApplyBody);
        String xml = XmlUtil.toXml(nyLoanRepBean);
        // 打印信息
        System.out.println(xml);
        return xml;
    }

    public static void toBeanTest(String xml){
        NyLoanRepBean nyLoanRepBean = XmlUtil.toNyLoanBean(xml, NyLoanRepApplyBody.class);
        // NyLoanRepBean nyLoanRepBean = XmlUtil.toNyLoanBeanWithoutBody(xml);
        if(nyLoanRepBean.getBody() != null) {
            NyLoanRepApplyBody nyLoanRepApplyBody = (NyLoanRepApplyBody)nyLoanRepBean.getBody();
            System.out.println(nyLoanRepApplyBody.getAddress() + "," + nyLoanRepApplyBody.getName() + ", " + JSON.toJSONString(nyLoanRepApplyBody.getStudent()));
        }else {
            System.out.println("body is null");
        }
        System.out.println(JSON.toJSONString(nyLoanRepBean, true));
    }


}
