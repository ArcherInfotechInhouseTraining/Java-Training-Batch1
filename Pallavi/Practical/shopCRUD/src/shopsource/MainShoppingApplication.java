
//11/06/24
// created basic templete

package shopsource;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.io.ObjectInputStream;
//import java.io.Serializable;
import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

class Item implements Serializable
{
 private static final long serialVersionUID = 1L;
 private int id;
 private String name;

 public Item(int id , String name)
 {
     this.name = name;
     this.id = id; 
 }

 public String getName()
 {
     return name;
 }

 public int getId()
 {
     return id;
 }

 public void setName(String name)
 {
     this.name = name;
 }

 public void setId(int id)
 {
     this.id = id;
 }

 public String toString()
 {
     return "Item{" +
     "id=" + id +
     ", name='" + name + '\'' +
     '}';

 }
}

 class FileUtil
{
 private static final String File_Name = "items.txt";

 public static void saveItems(List<Item> items) throws IOException
 {
     try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name)))
     {
         oos.writeObject(items);
     }
 }

 public static List<Item> loadItems() throws ClassNotFoundException , IOException
 {
     File file = new File(File_Name);

     if(!file.exists())
     {
         return new ArrayList<>();
     }

     try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name)))
     {
         return(List<Item>) ois.readObject();
     }
 }
}

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
                     createItem(scanner , items);
                     break;

                 case "read":
                     readItems(items);
                     break;

                 case "update":
                     updateItems(scanner , items);
                     break;

                 case "delete":
                     deleteItem(scanner , items);
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

 private static void createItem(Scanner scanner , List<Item> items)
 {
     System.out.println("Enter item id: ");
     int id = Integer.parseInt(scanner.nextLine());

     System.out.println("Enter item name: ");
     String name = scanner.nextLine();

     items.add( new Item(id, name));
     System.out.println("Item created.");
 }

 private static void readItems(List<Item> items)
 {
     if(items.isEmpty())
     {
         System.out.println("No item found.");
     }
     else
     {
         for(Item item : items)
         {
             System.out.println(item);
         }
     }
 }

 private static void updateItems(Scanner scanner , List<Item> items)
 {
     System.out.println("Enter item id to update: ");
     int id = Integer.parseInt(scanner.nextLine());

     for(Item item : items)
     {
         if(item.getId() == id)
         {
             System.out.println("Enter new item name: ");
             String newName = scanner.nextLine();
             item.setName(newName);

             System.out.println("Item updated.");

             return;
         }
     }
     System.out.println("Item not found");
 }
 private static void  deleteItem(Scanner scanner , List<Item> items)
 {
     System.out.println("Enter item id to delete : ");
     int id = Integer.parseInt(scanner.nextLine());

     items.removeIf(item -> item.getId() == id );

     System.out.println("Item is deleted.");
 }
}