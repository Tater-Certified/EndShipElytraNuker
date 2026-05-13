/**
 * Copyright (c) 2026 QPCrummer
 * This project is Licensed under <a href="https://github.com/Tater-Certified/EndShipElytraNuker/blob/main/LICENSE">MIT</a>
 */
package com.github.tatercertified.endship_elytra_nuker;

import java.util.Optional;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public record SerializableItemStack(String identifier) {

    public ItemStack serialize() {
        if (this.identifier.isEmpty()) {
            return ItemStack.EMPTY;
        }
        Identifier location = Identifier.tryParse(this.identifier);
        Optional<Holder.Reference<Item>> itemStackReference = BuiltInRegistries.ITEM.get(location);
        return itemStackReference.map(itemReference -> new ItemStack(itemReference, 1)).orElse(ItemStack.EMPTY);
    }

    public static SerializableItemStack deserialize(ItemStack stack) {
        if (stack.isEmpty()) {
            return defaultStack();
        } else {
            return new SerializableItemStack(stack.getItem().toString());
        }
    }

    public static SerializableItemStack defaultStack() {
        return new SerializableItemStack("");
    }
}
