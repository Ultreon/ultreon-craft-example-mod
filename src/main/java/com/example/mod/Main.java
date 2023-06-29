package com.example.mod;

import com.example.mod.init.ModBlocks;
import com.ultreon.craft.BlockModelRegistry;
import com.ultreon.craft.GamePlatform;
import com.ultreon.craft.UltreonCraft;
import com.ultreon.craft.entity.Player;
import com.ultreon.craft.events.LifecycleEvents;
import com.ultreon.libs.collections.v0.util.ArrayUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

import java.util.Arrays;

public class Main implements ModInitializer {
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = GamePlatform.instance.getLogger("ExampleMod");

    @Override
    public void onInitialize() {
        LOGGER.info("Mod got initialized!");

        ModBlocks.register();

        BlockModelRegistry.registerDefault(ModBlocks.EXAMPLE);

        LifecycleEvents.GAME_LOADED.listen(this::onGameLoaded);
    }

    public void onGameLoaded(UltreonCraft game) {
        Player.allowed = ArrayUtils.add(Player.allowed, ModBlocks.EXAMPLE.get());
    }
}
