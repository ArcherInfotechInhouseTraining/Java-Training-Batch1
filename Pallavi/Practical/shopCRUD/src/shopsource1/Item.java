package shopsource1;

import java.io.Serializable;

public class Item implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int code;
	private int price;
	private String name;
	private int mrp;
	private int count;

 public Item(int code , String name , int price , int mrp , int count )
 {
     this.code = code;
     this.name = name;
     this.price = price;
     this.mrp = mrp;
     this.count = count;
     
 }

 public String getName()
 {
     return name;
 }

 public int getCode()
 {
     return code;
 }

 public int getCount()
 {
	 return count;
 }
 
 public int getPrice()
 {
	 return price;
 }
 
 public int getMrp()
 {
	 return mrp;
 }
 
 public void setName(String name)
 {
     this.name = name;
 }

 public void setCode(int code)
 {
     this.code = code;
 }
 
 public void setMrp(int mrp)
 {
	 this.mrp = mrp;
 }
 
 public void setPrice(int price)
 {
	 this.price = price;
 }
 
 public void setCount(int count)
 {
	 this.count = count;
 }

 public String toString()
 {
     return "Item{" +
     "code=" + code +
     ", name='" + name + '\'' + "price= "+price+'\''+
     '}';
 }
}