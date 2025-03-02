package com.jspider.program.src.oops;

public class Browser {
    String name;
    int size;
    String version;
    // Here Name ,size and Version is the states of the class

    public void reload(){
        System.out.println("Reload the Browser");
    }
    public void search(){
        System.out.println("Search in the Browser");
    }
    public void download(){
        System.out.println("Download from the Browser");

        // Here reload(),search(),download() is the behaviour the browser class

    }
}
