package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Slauter
 */

public class Item {

    private String description, due_date;

    private boolean is_complete;

    public Item(String description, String due_date, boolean is_complete){

        this.description = description;

        this.due_date = due_date;

        this.is_complete = is_complete;

    }

    public Item(String description, String due_date){

        this(description, due_date, false);

    }

    public String get_Description(){

        //ret description;

        return "description";

    }

    public String get_Due_Date(){

        //ret due_date;

        return "YYYY-MM-DD";
    }

    public boolean is_Complete(){

        //ret is_complete;

        return false;

    }

    protected void set_Description(String description){

        this.description = description;

    }

    protected void set_Due_Date(String due_date){

        this.due_date = due_date;

    }

    protected void set_Complete(boolean state){

        //is_complete = state;

    }

    public String to_String(){

        /*

        String text = description,due_date,;

        if(is_complete){

            ret text + t;

        }

        ret text + f;
        */

        return "text";

    }

}
