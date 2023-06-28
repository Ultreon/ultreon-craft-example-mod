package me.qboi.craft;

import com.ultreon.craft.GamePlatform;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Main implements ModInitializer {
    public static final Logger LOGGER = GamePlatform.instance.getLogger("ExampleMod");

    @Override
    public void onInitialize() {
        LOGGER.info("Mod got initialized!");
    }
}
