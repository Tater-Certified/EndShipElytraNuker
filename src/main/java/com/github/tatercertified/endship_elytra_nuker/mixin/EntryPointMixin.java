/**
 * Copyright (c) 2026 QPCrummer
 * This project is Licensed under <a href="https://github.com/Tater-Certified/EndShipElytraNuker/blob/main/LICENSE">MIT</a>
 */
package com.github.tatercertified.endship_elytra_nuker.mixin;

import com.github.tatercertified.endship_elytra_nuker.EndshipElytraNuker;
import java.nio.file.Path;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class EntryPointMixin {
    @Inject(method = "<clinit>", at = @At("HEAD"))
    private static void endship_elytra_nuker$init(CallbackInfo ci) {
        Path configFile = Path.of("").resolve("config/endship-elytra-nuker.json");
        EndshipElytraNuker.readConfig(configFile);
    }
}
