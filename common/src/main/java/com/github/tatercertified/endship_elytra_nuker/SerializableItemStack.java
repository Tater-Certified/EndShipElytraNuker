package com.github.tatercertified.endship_elytra_nuker;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class SerializableItemStack {
    public final String identifier;
    public SerializableItemStack(String identifier) {
        this.identifier = identifier;
    }

    public ItemStack serialize() {
        if (this.identifier.isEmpty()) {
            return ItemStack.EMPTY;
        }
        ResourceLocation location = ResourceLocation.tryParse(this.identifier);
        return new ItemStack(BuiltInRegistries.ITEM.get(location), 1);
    }

    public static SerializableItemStack deserialize(ItemStack stack) {
        if (stack.isEmpty()) {
            return defaultStack();
        } else {
            return  new SerializableItemStack(stack.getItem().toString());
        }
    }

    public static SerializableItemStack defaultStack() {
        return new SerializableItemStack("");
    }
}
