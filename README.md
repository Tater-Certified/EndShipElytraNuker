# End Ship Elytra Nuker
A not so destructive single-Mixin mod to allow replacing the end ship item... that's it

The config is located at `config/endship-elytra-nuker.json`:
```json
{
  "identifier": ""
}
```

Replace the `""` to an item identifier to use that item.
Example:
```json
{
  "identifier": "minecraft:diamond_block"
}
```

If left empty (`""`), the mod will remove the item and the item frame inside the ship.

# Supported Platforms (As of v1.2.0)
- Fabric/Quilt (1.20 - 26.1.2)
- Forge (26.1.2)
- NeoForge (1.21.6 - 26.1.2)
- PaperMC/Spigot/Folia (26.1.2)
- Sponge (26.1.2)

# Installation
## Fabric, Quilt, Forge, NeoForge
Simply put the mod in the mods folder
## Sponge
Simply put the plugin in the plugins folder
## Spigot/PaperMC
1. Install the [Ignite](https://github.com/vectrix-space/ignite) Mixin loader
2. Run the ignite jar alongside the paper/spigot jar
3. Put the mod in the mods folder and restart
## Folia
1. Install the [Ignite](https://github.com/vectrix-space/ignite) Mixin loader
2. Rename the Folia jar to "paper.jar". Alternatively, you can launch the game with the following JVM args: `-Dignite.locator=paper -Dignite.jar=./folia.jar`
3. Run the ignite jar alongside the folia jar
4. Put the mod in the mods folder and restart
