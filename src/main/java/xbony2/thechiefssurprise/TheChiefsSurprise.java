package xbony2.thechiefssurprise;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = TheChiefsSurprise.MODID, version = TheChiefsSurprise.VERSION)
public class TheChiefsSurprise{
	public static final String MODID = "thechiefssurprise";
	public static final String VERSION = "1.0";
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		// some example code
		System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
	}
}
