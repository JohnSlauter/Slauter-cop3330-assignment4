package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Slauter
 */

import java.util.ArrayList;

public class To_Do_List {

  private String title;

  private ArrayList<Item> items;

  private String file_address;

  public To_Do_List(String title){

      //this.title = title;

      //items = new ArrayList<Item>();

  }

  public String get_Title(){

      //ret title;

      return "title";

  }

  public ArrayList<Item> get_Items(){

      //ret items;

      return null;

  }

  public String get_File_Address(){

    //ret file_address

    return "";

  }

  protected void add_Item(Item i){

      //items.add(i);

  }

  protected void set_Title(String title){

      //this.title = title;

  }

  protected void set_File_Address(String file_address){

    //this.file_address = file_address;

  }

  public String to_String(){

    /*
    String text = "";

    for(Item i : items){

      text.append(i.to_String+"
      \n");

    }
    */

    return "string";

  }

}
