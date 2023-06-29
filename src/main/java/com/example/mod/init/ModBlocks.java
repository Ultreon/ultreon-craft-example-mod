package com.example.mod.init;

import com.ultreon.craft.block.Block;
import com.ultreon.craft.registry.Registries;
import com.ultreon.libs.registries.v0.DelayedRegister;
import com.ultreon.libs.registries.v0.RegistrySupplier;
import com.example.mod.Main;

public class ModBlocks {
    private static final DelayedRegister<Block> REGISTER = DelayedRegister.create(Main.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> EXAMPLE = REGISTER.register("example", Block::new);

    public static void register() {
        REGISTER.register();
    }
}
