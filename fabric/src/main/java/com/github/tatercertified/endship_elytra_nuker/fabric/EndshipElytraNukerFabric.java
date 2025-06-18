package com.github.tatercertified.endship_elytra_nuker.fabric;

import com.github.tatercertified.endship_elytra_nuker.EndshipElytraNuker;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.FabricLoaderImpl;

public final class EndshipElytraNukerFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        EndshipElytraNuker.init();
        EndshipElytraNuker.readConfig(FabricLoaderImpl.INSTANCE.getConfigDir().resolve("endship-elytra-nuker.json"));
    }
}
