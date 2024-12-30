package com.github.tatercertified.endship_elytra_nuker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.world.item.ItemStack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public final class Endship_elytra_nuker {
    public static final String MOD_ID = "endship_elytra_nuker";
    public static ItemStack shipItem;

    public static void init() {
    }

    public static void readConfig(Path path) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String defaultVal = gson.toJson(SerializableItemStack.defaultStack());
            try {
                Files.writeString(path, defaultVal, StandardOpenOption.WRITE);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            String jsonContent = Files.readString(path);
            SerializableItemStack stack = gson.fromJson(jsonContent, SerializableItemStack.class);
            shipItem = stack.serialize();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // TODO Implement command maybe?
    public static void saveConfig(Path path) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        SerializableItemStack stack = SerializableItemStack.deserialize(shipItem);
        String val = gson.toJson(stack);
        try {
            Files.writeString(path, val, StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
