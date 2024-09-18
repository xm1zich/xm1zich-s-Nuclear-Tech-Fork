package com.hbm.items.food;

import java.util.List;

import com.hbm.config.VersatileConfig;
import com.hbm.explosion.ExplosionLarge;
import com.hbm.extprop.HbmLivingProps;
import com.hbm.interfaces.Spaghetti;
import com.hbm.items.ModItems;
import com.hbm.main.MainRegistry;
import com.hbm.util.ContaminationUtil;
import com.hbm.util.ContaminationUtil.ContaminationType;
import com.hbm.util.ContaminationUtil.HazardType;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;

public class ItemAlcohol extends Item {

	private Item container = null;
	private boolean requiresOpener = false;

	public ItemAlcohol() {
		this.setCreativeTab(MainRegistry.consumableTab);
	}

	public ItemAlcohol makeGlass(Item glass, boolean opener) {
		this.container = glass;
		this.requiresOpener = opener;
		this.setContainerItem(this.container);
		this.setCreativeTab(MainRegistry.consumableTab);
		return this;
	}

	@Override
	public ItemStack onEaten(ItemStack stack, World world, EntityPlayer player) {

		if(!player.capabilities.isCreativeMode) {
			--stack.stackSize;
		}

		if(!world.isRemote) {

			if(player instanceof FakePlayer) {
				world.newExplosion(player, player.posX, player.posY, player.posZ, 5F, true, true);
				return super.onEaten(stack, world, player);
			}

			VersatileConfig.applyPotionSickness(player, 5);

			if(this == ModItems.glass_ethanol) {
				player.heal(2F);
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30 * 20, 1));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 30 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 30 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 30 * 20, 2));
			}

			if(this == ModItems.glass_vodka) {
				player.heal(4F);
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 5 * 20, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 30 * 20, 2));
			}

			if(!player.capabilities.isCreativeMode) {
				
				if(this.container != null) {
					if(stack.stackSize <= 0) {
						return new ItemStack(this.container);
					}
					player.inventory.addItemStackToInventory(new ItemStack(this.container));
				}
			}

			player.inventoryContainer.detectAndSendChanges();
		}

		return stack;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 32;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack p_77661_1_) {
		return EnumAction.drink;
	}

	@Spaghetti("cover yourself in oil")
	@Override
	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {

		if(VersatileConfig.hasPotionSickness(p_77659_3_))
			return p_77659_1_;
		
			if(this.requiresOpener && !p_77659_3_.inventory.hasItem(ModItems.bottle_opener))
				return p_77659_1_;

		p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));

		return p_77659_1_;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List list, boolean p_77624_4_) {
		if(this == ModItems.glass_ethanol) {
			list.add("Pure Alcohol!");
		}
		if(this == ModItems.glass_vodka) {
			list.add("Fine Russian Vodka");
			list.add("[Requires bottle opener]");
		}
	}
}