package com.array.real;

import java.util.Scanner;

public class ItemDemo {
	static Item[] item;
	public static void main(String args[])
	{
		item=new Item[5];
		int itemId;
		String itemName;
		double itemPrice;
		double itemDiscount;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter the Item id");
		itemId=sc.nextInt();sc.nextLine();
		System.out.println("Enter the Item Name");
		itemName=sc.nextLine();
		System.out.println("Enter the Item Price");
		itemPrice=sc.nextDouble();
		System.out.println("Enter the Item Discount");
		itemDiscount=sc.nextDouble();
		
		item[i]=new Item(itemId,itemName,itemPrice,itemDiscount);

		
		}	
		Item obj=getLeastPriceItem(item);
		System.out.println();
		System.out.println(obj.getItemName());
		}
	
	public static Item getLeastPriceItem(Item[] item)
	{
		String itemName = "";
		double price[]=new double[5];
		for(int i=0;i<item.length;i++)
		{
		double discount = item[i].getItemPrice()*item[i].getItemDiscount()/100;
		price[i]=item[i].getItemPrice()-discount;
		}
		double x=price[0];
		int j=0;
		for(int i=1;i<5;i++)
		{
			if(price[i]<x)
			{
			x=price[i];
			j=i;
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(price[i]+"  ");
		}
		return item[j];
	}
}
