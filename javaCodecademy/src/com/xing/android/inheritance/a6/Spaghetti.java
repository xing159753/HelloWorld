package com.xing.android.inheritance.a6;

public class Spaghetti extends Noodle {
    Spaghetti() {
        super(30.0, 0.2, "round", "semolina flour");
    }

    @Override
    public String getCookPrep() {
        return "Boil spaghetti for 8 - 12 minutes and sauce, cheese, or oil and garlic.";
    }

}
