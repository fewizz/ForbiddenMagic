package com.spiteful.forbidden.enchantments;

import com.spiteful.forbidden.*;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemStack;

public class EnchantmentEducational extends Enchantment
{
	public EnchantmentEducational(int id)
	{
		super(id, 0, EnumEnchantmentType.weapon);
		setName("educational");
	}
	
	@Override
	/**
	 * Returns the maximum level that the enchantment can have.
	 */
	public int getMaxLevel()
	{
		return 5;
	}
	
	@Override
	/**
	 * Determines if the enchantment passed can be applyied together with this enchantment.
	 */
	public boolean canApplyTogether(Enchantment ench)
	{
		return super.canApplyTogether(ench) && ench.effectId != Enchantment.looting.effectId && ench.effectId != DarkEnchantments.greedy.effectId;
	}
	
	@Override
	/**
	 * This applies specifically to applying at the enchanting table. The other method {@link #canApply(ItemStack)}
	 * applies for <i>all possible</i> enchantments.
	 * @param stack
	 * @return
	 */
	public boolean canApplyAtEnchantingTable(ItemStack stack)
	{
		return false;
	}
	
	
}