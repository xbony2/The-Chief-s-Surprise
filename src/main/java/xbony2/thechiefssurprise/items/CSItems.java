package xbony2.thechiefssurprise.items;

import net.minecraft.item.Item;

public class CSItems {
	public static Item maize;
	
	public static void registerItems(){
		maize = new CSFood("maize", 2);
	}
}
