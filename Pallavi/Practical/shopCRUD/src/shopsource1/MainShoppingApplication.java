package shopsource1;

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

class MainShoppingApplication 
{
 public static void main(String[] args)
 {
     try
     {
         List<Item> items = FileUtil.loadItems();

         Scanner scanner = new Scanner(System.in);
         boolean running = true;

         while(running)
         {
             System.out.println("Choose an operation: create , read , update , delete , exit ");
             String operation = scanner.nextLine();

             switch(operation.toLowerCase())
             {
                 case "create":
                     Create.createItem(scanner , items);
                     break;

                 case "read":
                	 
                     Read.readItems(items);
                     break;

                 case "update":
                     Update.updateItems(scanner , items);
                     break;

                 case "delete":
                     Delete.deleteItem(scanner , items);
                     break;

                 case "exit":
                     running = false;
                     break;
                 default:
                     System.out.println("Invalid Operation");
             }
             FileUtil.saveItems(items);
         }
     }
     catch(IOException | ClassNotFoundException e)
     {
         System.err.println("Error: "+e.getMessage());
     }
 }
}