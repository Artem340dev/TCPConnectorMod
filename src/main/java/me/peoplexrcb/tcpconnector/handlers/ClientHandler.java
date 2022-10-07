package me.peoplexrcb.tcpconnector.handlers;

import me.peoplexrcb.tcpconnector.TCPConnectorMod;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = TCPConnectorMod.MOD_ID)
public class ClientHandler {
    @SubscribeEvent
    public static void onJump(LivingEvent.LivingJumpEvent event) {
        event.getEntityLiving().sendMessage(new TextComponentString(""));
    }
}