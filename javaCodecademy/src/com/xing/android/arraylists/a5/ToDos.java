package com.xing.android.arraylists.a5;

import java.util.ArrayList;

public class ToDos {

    public static void main(String[] args) {

        // Sherlock
        ArrayList<String> sherlockToDos = new ArrayList<String>();

        sherlockToDos.add("visit the crime scene");
        sherlockToDos.add("play violin");
        sherlockToDos.add("interview suspects");
        sherlockToDos.add("solve the case");
        sherlockToDos.add("apprehend the criminal");

        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // Set each to-do below:
        sherlockToDos.set(1, "listen to Dr.Watson for amusement");
        poirotsToDos.set(3, "listen to Captain Hasting for amusement");

        System.out.println("Sherlock's to-do list:");
        System.out.println(sherlockToDos.toString() + "\n");
        System.out.println("Poirot's to-do list:");
        System.out.println(poirotsToDos.toString());
    }
}
