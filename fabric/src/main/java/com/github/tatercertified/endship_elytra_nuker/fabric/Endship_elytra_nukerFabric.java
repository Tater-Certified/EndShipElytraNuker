package com.github.tatercertified.endship_elytra_nuker.fabric;

import com.github.tatercertified.endship_elytra_nuker.Endship_elytra_nuker;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public final class Endship_elytra_nukerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Endship_elytra_nuker.init();
        Endship_elytra_nuker.readConfig(FabricLoaderImpl.INSTANCE.getConfigDir().resolve("endship-elytra-nuker.json"));
    }
}
