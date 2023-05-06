package com.xing.inheritanceandpolymorphism.a6;

public class Pho extends Noodle {
    Pho() {
        super(30.0, 0.64, "flat", "rice flour");
    }

    @Override
    public String getCookPrep() {
        return "Soak pho for 1 hour, then boil for 1 minute in borth. Then garnish with cilantro and jalapeno.";
    }
}
