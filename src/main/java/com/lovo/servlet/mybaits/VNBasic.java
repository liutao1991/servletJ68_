package com.lovo.servlet.mybaits;

public class VNBasic implements  HeroBuilder{

    Hero h = new Hero();

    @Override
    public void buildPymbol() {
        h.setPymbol("菜鸡符文");
    }

    @Override
    public void buildKill() {
        h.setKill("只会挨打");
    }

    @Override
    public void buildKien() {
        h.setKien("唐阿海");
    }
}
