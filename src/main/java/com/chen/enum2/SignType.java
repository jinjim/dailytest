package com.chen.enum2;

public enum SignType{
   UNKNOW(0),
   WLQQ(1),    //物流QQ
   HCB(2),     //货车帮
   OTHER(3),   //其他域
   ;
   private int val;

   public int getVal() {
       return val;
   }

   public void setVal(int val) {
       this.val = val;
   }

   SignType(int val) {
       this.val = val;
   }
}
