package shen.swords.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import shen.swords.CompressedSwords;

public class ModBlocks {

    public static void registerBlockItem(String id, Block block, RegistryKey<ItemGroup> GROUP) {
        BlockItem blockItem = Registry.register(Registries.ITEM, Identifier.of(CompressedSwords.NAMESPACE, id), new BlockItem(block, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(GROUP).register(content -> {
            content.add(blockItem);
        });
    }

    public static Block register(String id, Block block, RegistryKey<ItemGroup> GROUP) {
        ModBlocks.registerBlockItem(id, block, GROUP);
        return Registry.register(Registries.BLOCK, Identifier.of(CompressedSwords.NAMESPACE, id), block);
    }
}
