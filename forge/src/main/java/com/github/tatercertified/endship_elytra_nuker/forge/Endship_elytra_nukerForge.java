package com.github.tatercertified.endship_elytra_nuker.forge;

import com.github.tatercertified.endship_elytra_nuker.Endship_elytra_nuker;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLConfig;

import java.nio.file.Path;

@Mod(Endship_elytra_nuker.MOD_ID)
public final class Endship_elytra_nukerForge {
    public Endship_elytra_nukerForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(Endship_elytra_nuker.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        Endship_elytra_nuker.init();

        Endship_elytra_nuker.readConfig(Path.of(FMLConfig.defaultConfigPath()).resolve("endship-elytra-nuker.json"));
    }
}
