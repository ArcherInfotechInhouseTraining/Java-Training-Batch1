package shopcrudapp1;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Date;


class Cart 
{
	static List<Cart> cartItems = new ArrayList<>();
	
	public void addItem(Bill bill)
	{
		cartItems.add(this);
	}

	public static void cartItem() 
	{
		System.out.println(cartItems);
	}
}
