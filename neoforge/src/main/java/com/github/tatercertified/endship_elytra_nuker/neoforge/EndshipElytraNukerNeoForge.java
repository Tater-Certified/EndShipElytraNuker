package com.github.tatercertified.endship_elytra_nuker.neoforge;

import com.github.tatercertified.endship_elytra_nuker.EndshipElytraNuker;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLConfig;

import java.nio.file.Path;

@Mod(EndshipElytraNuker.MOD_ID)
public final class EndshipElytraNukerNeoForge {
    public EndshipElytraNukerNeoForge(IEventBus eventBus) {
        // Submit our event bus to let Architectury API register our content on the right time.
        //EventBuses.registerModEventBus(EndshipElytraNuker.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        EndshipElytraNuker.init();

        EndshipElytraNuker.readConfig(Path.of(FMLConfig.defaultConfigPath()).resolve("endship-elytra-nuker.json"));
    }
}
