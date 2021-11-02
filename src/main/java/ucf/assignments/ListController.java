package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Slauter
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListController implements Initializable {

    private Parent lists, create_item, create_list, delete_item, delete_list;

    //ArrayList<To_Do_List> lists;

    //int current_list_index

    @FXML TableColumn complete, description, due_date;


    public void initialize(URL location, ResourceBundle resources) {}

    //for junit tests
    protected ArrayList<To_Do_List> get_Lists(){

        //ret lists

        return null;

    }

    //for junit tests
    protected int get_Current_Index(){

        //ret current_index

        return 0;

    }

    //for junit tests
    protected TableColumn get_Complete_Column(){

        //ret complete

        return null;

    }

    //for junit tests
    protected TableColumn get_Description_Column(){

        //ret description

        return null;

    }

    //for junit tests
    protected TableColumn get_Due_Date_Column(){

        //ret due_date

        return null;

    }

    @FXML
    public void load_list(ActionEvent e){

        /*

        open filechooser fc

        filefilter filter = ".list"

        apply filter to fc

        user selects file(s) with fc

        put selected files in an ArrayList

        translate_files(ArrayList)

        */

    }

    protected void translate_lists(ArrayList<File> files){

        /*

        for(file f : ArrayList){

            read the file with a scanner and store in a string

            create new To_Do_List(s) based on the string (format: description, due date, completion status)

            add the list(s) to the ArrayList of files

         }

         */

    }

    @FXML
    public void create_list(ActionEvent e){

        /*

        prompt user for title

        create new list with that title

        add it to the ArrayList

         */

    }

    @FXML
    public void open_list(ActionEvent e){

        /*

        use setCellValueFactory to put each item in the list in the table

        complete column gets item complete status

        description column gets item descriptions

        due_date column gets item due dates

        */

    }

    @FXML
    public void remove_list(ActionEvent e){

        /*

        Search the ArrayList of Lists for the user specified title

        Create a file object with To_Do_List's file address

        file.delete();

        remove it from the ArrayList

        Use open_list() to update the table

        */

    }

    @FXML
    public void rename_list(ActionEvent e){

        /*

          search ArrayList for the list with old name

          list.set_Title(new_name)

         */

    }

    
    public void add_item(ActionEvent e){

        /*

        Open prompt

        Get description and due date

        create new item(description, due date) and add to current list

        */

    }

    @FXML
    public void get_item_input(ActionEvent e){

        //store item description and due date submitted by user

    }

    @FXML
    public void remove_item(ActionEvent e){

        /*

        Search current list for the item to remove

        Remove the item

        Use open_list() to update table

        */

    }

    @FXML
    public void edit_item(ActionEvent e){

        /*

        Get the item's description and due date from the ActionEvent source

        Search current list for the item to edit

        Open prompt for user to make edits

        Set the initial values in the prompt to be the current values of the item

        Apply what the user submits for description and due date to the item

        open_list() to update table

         */

    }

    @FXML
    public void update_item_completion(ActionEvent e){

        /*

        Get the item's description and due date from the ActionEvent source

        search current list for item

        set the specified item's completion status to be reflective of the state of the associated check_box

         */

    }

    @FXML
    public void display_complete_items(ActionEvent e){

        /*

        ArrayList<Item> temp

        for(Item i in current list){

            if(i.is_Complete){

                add i to temp

            }

        }

        open_list(temp)

         */

    }

    @FXML
    public void display_incomplete_items(ActionEvent e){

        /*

        ArrayList<Item> temp

        for(Item i in current list){

            if(!i.is_Complete){

                add i to temp

            }

        }

        open_list(temp)

         */

    }

    @FXML
    public void save_as(ActionEvent e){

        /*

            get list name from ActionEvent source

            search for list in ArrayList

            open file selector

            let user choose file location and name

            save list with file extension .list

            set the address of the list being saved to the specified address

            save(list)

         */

    }

    @FXML
    public void save(ActionEvent e){

        /*

        get list name from ActionEvent source

        search ArrayList for the list

        if(list file_address is invalid){
            save_as()
        }

        open new file writer that will write to the address of the specified list

        use the writer to write the To_Do_List.to_String() text to the file

        close the writer

         */

    }

    @FXML
    public void save_all(ActionEvent e){

        /*

        for(To_Do_List list in lists){
            save(list)
        }
         */

    }

}
