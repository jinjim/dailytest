package com.chen.lombok.bean;

/**
 * @author liang.chen
 * @date 2017-01-16
 */
public class BuilderBean2 {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BuilderBean2Builder builder(){
        return new BuilderBean2Builder();
    }

    private static class BuilderBean2Builder {
        private String name;
        private String address;

        public BuilderBean2Builder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderBean2Builder address(String address) {
            this.address = address;
            return this;
        }

        public BuilderBean2 build(){
            BuilderBean2 builderBean2 = new BuilderBean2();
            builderBean2.setAddress(this.address);
            builderBean2.setName(this.name);
            return builderBean2;
        }

    }

}
