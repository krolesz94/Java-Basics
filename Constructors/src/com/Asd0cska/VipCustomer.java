package com.Asd0cska;

public class VipCustomer {

    private String vipName;
    private int creditLimit;
    private String vipEmail;

    public String getVipName() {
        return vipName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getVipEmail() {
        return vipEmail;
    }

    public VipCustomer() {
        this("Kecske", Integer.MAX_VALUE, "IamVIP@vip.vp");
    }

    public VipCustomer(String vipName, int creditLimit, String vipEmail) {
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.vipEmail = vipEmail;
    }

    public VipCustomer(String vipName, int creditLimit) {
        this(vipName, creditLimit, "IamStillVIP@vip.vp");
    }

}
