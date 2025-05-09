package shen.swords.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
//import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import shen.swords.CompressedSwords;
import shen.swords.item.ToolMaterial.CompressedSwordsToolMaterial;

public class ModItems {


    public static final Item test = registerItems("test_item", new Item(new Item.Settings()));

    public static final Item compressed_sword_lvl1 = registerItems("compressed_sword1", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(1), new Item.Settings()));

    public static final Item compressed_sword_lvl2 = registerItems("compressed_sword2", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(2), new Item.Settings()));

    public static final Item compressed_sword_lvl3 = registerItems("compressed_sword3", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(3), new Item.Settings()));

    public static final Item compressed_sword_lvl4 = registerItems("compressed_sword4", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(4), new Item.Settings()));

    public static final Item compressed_sword_lvl5 = registerItems("compressed_sword5", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(5), new Item.Settings()));

    public static final Item compressed_sword_lvl6 = registerItems("compressed_sword6", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(6), new Item.Settings()));

    public static final Item compressed_sword_lvl7 = registerItems("compressed_sword7", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(7), new Item.Settings()));

    public static final Item compressed_sword_lvl8 = registerItems("compressed_sword8", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(8), new Item.Settings()));

    public static final Item compressed_sword_lvl9 = registerItems("compressed_sword9", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(9), new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl1 = registerItems("crazy_compressed_sword1", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(10), new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl2 = registerItems("crazy_compressed_sword2", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(11), new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl3 = registerItems("crazy_compressed_sword3", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(12), new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl4 = registerItems("crazy_compressed_sword4", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(13), new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl5 = registerItems("crazy_compressed_sword5", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(14), new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl6 = registerItems("crazy_compressed_sword6", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(15), new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl7 = registerItems("crazy_compressed_sword7", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(16), new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl8 = registerItems("crazy_compressed_sword8", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(17), new Item.Settings()));

    public static final Item crazy_compressed_sword_lvl9 = registerItems("crazy_compressed_sword9", new shen.swords.item.CompressedSwords(new CompressedSwordsToolMaterial(18), new Item.Settings()));



    private static Item registerItems(String id, Item item) {
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(CompressedSwords.MOD_ID, id)), item);
        // 使用 Identifier.of() 创建标识符
        Identifier identifier = Identifier.of(CompressedSwords.NAMESPACE, id);

        // 注册物品到物品注册表
        Item registeredItem = Registry.register(Registries.ITEM, identifier, item);

        // 将注册的物品添加到战斗物品组
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(registeredItem);
        });

        return registeredItem;
    }

    private static Item registerItem(String id, SwordItem item) {
        // return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(CompressedSwords.MOD_ID, id)), item);
        // 创建标识符并验证
        Identifier identifier = Identifier.tryParse(CompressedSwords.NAMESPACE + ":" + id);
        if (identifier == null) {
            throw new IllegalArgumentException("无效的物品标识符: " + CompressedSwords.NAMESPACE + ":" + id);
        }

        // 注册物品
        Item registeredItem = Registry.register(Registries.ITEM, identifier, item);

        // 添加到物品组（修正：添加已注册的剑而不是新创建的物品）
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(registeredItem);
        });

        return registeredItem;
    }

    public static void registerItems() {
        CompressedSwords.LOGGER.info("Registering Mod Items");
    }
}
