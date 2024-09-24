package day.gopi.jef;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = JustEnoughFlowcharts.MODID, name = JustEnoughFlowcharts.NAME, version = JustEnoughFlowcharts.VERSION)
public class JustEnoughFlowcharts
{
    public static final String MODID = "jef";
    public static final String NAME = "Just Enough Flowcharts";
    public static final String VERSION = "1.12-0.0.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
