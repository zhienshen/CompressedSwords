package shen.swords.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
//import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import shen.swords.CompressedSwords;

public class ModItems {

    public static final Item test = registerItems("test_item", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl1 = registerItems("compressed_sword1", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl2 = registerItems("compressed_sword2", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl3 = registerItems("compressed_sword3", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl4 = registerItems("compressed_sword4", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl5 = registerItems("compressed_sword5", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl6 = registerItems("compressed_sword6", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl7 = registerItems("compressed_sword7", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl8 = registerItems("compressed_sword8", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl9 = registerItems("compressed_sword9", new Item(new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl1 = registerItems("crazy_compressed_sword1", new Item(new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl2 = registerItems("crazy_compressed_sword2", new Item(new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl3 = registerItems("crazy_compressed_sword3", new Item(new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl4 = registerItems("crazy_compressed_sword4", new Item(new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl5 = registerItems("crazy_compressed_sword5", new Item(new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl6 = registerItems("crazy_compressed_sword6", new Item(new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl7 = registerItems("crazy_compressed_sword7", new Item(new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl8 = registerItems("crazy_compressed_sword8", new Item(new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl9 = registerItems("crazy_compressed_sword9", new Item(new Item.Settings()));



    private static Item registerItems(String id, Item item) {
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(CompressedSwords.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(CompressedSwords.MOD_ID, id), item);


    }

    private static void addItemToGroup(FabricItemGroupEntries group) {
        group.add(test);
        group.add(compressed_sword_lvl1);
        group.add(compressed_sword_lvl2);
        group.add(compressed_sword_lvl3);
        group.add(compressed_sword_lvl4);
        group.add(compressed_sword_lvl5);
        group.add(compressed_sword_lvl6);
        group.add(compressed_sword_lvl7);
        group.add(compressed_sword_lvl8);
        group.add(compressed_sword_lvl9);
        group.add(crazy_compressed_sword_lvl1);
        group.add(crazy_compressed_sword_lvl2);
        group.add(crazy_compressed_sword_lvl3);
        group.add(crazy_compressed_sword_lvl4);
        group.add(crazy_compressed_sword_lvl5);
        group.add(crazy_compressed_sword_lvl6);
        group.add(crazy_compressed_sword_lvl7);
        group.add(crazy_compressed_sword_lvl8);
        group.add(crazy_compressed_sword_lvl9);

    }

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemToGroup);
        CompressedSwords.LOGGER.info("Registering Mod Items");
    }
}
