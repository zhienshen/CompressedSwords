package shen.swords.item.ToolMaterial;

import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import shen.swords.CompressedSwords;

import static java.lang.Math.pow;

public class CompressedSwordsToolMaterial implements ToolMaterial {
    private static int level;

    public CompressedSwordsToolMaterial(int level) {
        CompressedSwordsToolMaterial.level = level;
    }

    @Override
    public int getDurability() {
        CompressedSwords.LOGGER.info("{}aaa{}", 60 * this.pow(2, level), level);
        return 60 * this.pow(2, level);
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.6F;
    }

    @Override
    public float getAttackDamage() {
        // 先计算为 double 避免整数溢出
        double damage = 4.0 * Math.pow(2, level);

        // 限制最大值，避免浮点数溢出
        if (damage > Float.MAX_VALUE) {
            damage = Float.MAX_VALUE;
        }

        CompressedSwords.LOGGER.info("Attack Damage: {}", damage);
        return (float) 10;
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

    private int pow(int x, int y) {
        for(int i = 1;i < y;i++) {
            x *= x;
        }
        return x;
    }
}
