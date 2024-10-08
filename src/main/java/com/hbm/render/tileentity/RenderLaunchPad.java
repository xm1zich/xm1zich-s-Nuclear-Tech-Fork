package com.hbm.render.tileentity;

import java.util.function.Consumer;

import org.lwjgl.opengl.GL11;

import com.hbm.blocks.BlockDummyable;
import com.hbm.inventory.RecipesCommon.ComparableStack;
import com.hbm.main.ResourceManager;
import com.hbm.render.item.ItemRenderMissileGeneric;
import com.hbm.tileentity.bomb.TileEntityLaunchPad;

import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class RenderLaunchPad extends TileEntitySpecialRenderer {

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5D, y, z + 0.5D);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_CULL_FACE);

		switch(tileEntity.getBlockMetadata() - BlockDummyable.offset) {
		case 2: GL11.glRotatef(90, 0F, 1F, 0F); break;
		case 4: GL11.glRotatef(180, 0F, 1F, 0F); break;
		case 3: GL11.glRotatef(270, 0F, 1F, 0F); break;
		case 5: GL11.glRotatef(0, 0F, 1F, 0F); break;
		}

		bindTexture(ResourceManager.missile_pad_tex);
		ResourceManager.missile_pad.renderAll();

		if(tileEntity instanceof TileEntityLaunchPad) {
			ItemStack toRender = ((TileEntityLaunchPad) tileEntity).toRender;
			
			if(toRender != null) {
				GL11.glTranslated(0, 1, 0);
				Consumer<TextureManager> renderer = ItemRenderMissileGeneric.renderers.get(new ComparableStack(toRender).makeSingular());
				if(renderer != null) renderer.accept(this.field_147501_a.field_147553_e);
			}
		}

		GL11.glEnable(GL11.GL_CULL_FACE);

		GL11.glPopMatrix();
	}

}
