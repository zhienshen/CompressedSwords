package shen.swords.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.lang.reflect.Field;

import static java.lang.Math.pow;

public class CompressedSwords extends SwordItem {

    public CompressedSwords(ToolMaterial toolMaterial, Item.Settings settings) {

        super(toolMaterial, settings);

    }
}
