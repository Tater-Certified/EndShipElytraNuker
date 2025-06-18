package com.github.tatercertified.endship_elytra_nuker.mixin;

import com.github.tatercertified.endship_elytra_nuker.EndshipElytraNuker;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.structures.EndCityPieces;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EndCityPieces.EndCityPiece.class)
public class EndShipMixin {
    @Inject(method = "handleDataMarker", at = @At(value = "INVOKE", target = "Ljava/lang/String;startsWith(Ljava/lang/String;)Z", ordinal = 2, shift = At.Shift.AFTER), cancellable = true)
    private void cancelElytraPlacement(String string, BlockPos blockPos, ServerLevelAccessor serverLevelAccessor, RandomSource randomSource, BoundingBox boundingBox, CallbackInfo ci) {
        if (EndshipElytraNuker.shipItem.isEmpty()) {
            ci.cancel();
        }
    }

    @ModifyArg(method = "handleDataMarker", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/decoration/ItemFrame;setItem(Lnet/minecraft/world/item/ItemStack;Z)V"), index = 0)
    private ItemStack modifyItemStack(ItemStack itemStack) {
        return EndshipElytraNuker.shipItem;
    }
}
