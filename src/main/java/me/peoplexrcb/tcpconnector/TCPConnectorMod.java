package me.peoplexrcb.tcpconnector;

import me.peoplexrcb.tcpconnector.tcp.Client;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = TCPConnectorMod.MOD_ID,
        name = TCPConnectorMod.MOD_NAME,
        version = TCPConnectorMod.VERSION
)
public class TCPConnectorMod {
    private static final String ADDRESS = "localhost";
    private static final int PORT = 8080;

    public static final String MOD_ID = "tcpconnector";
    public static final String MOD_NAME = "TCPConnector";
    public static final String VERSION = "1.0-SNAPSHOT";

    /** This is the instance of your mod as created by Forge. It will never be null. */
    @Mod.Instance(MOD_ID)
    public static TCPConnectorMod INSTANCE;

    private Client client;
    private String phrase;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        this.phrase = "";
        this.client = new Client(ADDRESS, PORT);
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public Client getClient() {
        return client;
    }
}
