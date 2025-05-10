package shen.swords.item.ToolMaterial;

import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import org.apache.logging.log4j.util.Lazy;
import shen.swords.CompressedSwords;

import java.util.function.Supplier;

import static java.lang.Math.pow;

public class CompressedSwordsToolMaterial implements ToolMaterial {
    private static int level;

    public CompressedSwordsToolMaterial(int level) {

        CompressedSwordsToolMaterial.level = level;
    }

    @Override
    public int getDurability() {
        CompressedSwords.LOGGER.info("Durability:{}", 60 * Math.pow(3, level));
        return (int) (60 * Math.pow(3, level));
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.0F;
    }

    @Override
    public float getAttackDamage() {
        // 先计算为 double 避免整数溢出
        double damage = 4.0 * Math.pow(3, level);

        // 限制最大值，避免浮点数溢出
        if (damage > Float.MAX_VALUE) {
            damage = Float.MAX_VALUE;
        }

        CompressedSwords.LOGGER.info("Attack Damage: {}", damage);
        return (float) damage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.fromTag(ItemTags.PLANKS);
    }

    private static int pow(int x, int y) {
        for(int i = 1;i < y;i++) {
            x *= x;
        }
        return x;
    }

    public static int getDamage(int level) {
        return 4 * pow(2, level);
    }
}
