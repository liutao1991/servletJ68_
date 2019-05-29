package com.lovo.servlet.mybaits;

public class VNVip implements  HeroBuilder {

    Hero h = new Hero();

    @Override
    public void buildPymbol() {
        h.setPymbol("大神符文");
    }

    @Override
    public void buildKill() {
        h.setKill("主动出击");
    }

    @Override
    public void buildKien() {
        h.setKien("周刚");
    }
}
