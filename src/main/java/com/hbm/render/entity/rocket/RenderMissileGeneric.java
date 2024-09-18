package com.hbm.render.entity.rocket;

import org.lwjgl.opengl.GL11;

import com.hbm.entity.missile.EntityMissileAntiBallistic;
import com.hbm.entity.missile.EntityMissileBaseNT;
import com.hbm.entity.missile.EntityMissileStealth;
import com.hbm.entity.missile.EntityMissileTier1.*;
import com.hbm.main.ResourceManager;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMissileGeneric extends Render {

	public RenderMissileGeneric() {
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float p_76986_8_, float interp) {

		GL11.glPushMatrix();
		GL11.glTranslatef((float) x, (float) y, (float) z);
		GL11.glRotatef(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * interp - 90.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * interp, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * interp - 90.0F, 0.0F, -1.0F, 0.0F);

		if(entity instanceof EntityMissileBaseNT) switch(entity.getDataWatcher().getWatchableObjectByte(3)) {
		case 2: GL11.glRotatef(90, 0F, 1F, 0F); break;
		case 4: GL11.glRotatef(180, 0F, 1F, 0F); break;
		case 3: GL11.glRotatef(270, 0F, 1F, 0F); break;
		case 5: GL11.glRotatef(0, 0F, 1F, 0F); break;
		}

		if(entity instanceof EntityMissileAntiBallistic) {
			bindTexture(ResourceManager.missileAA_tex);
			GL11.glShadeModel(GL11.GL_SMOOTH);
			ResourceManager.missileABM.renderAll();
			GL11.glShadeModel(GL11.GL_FLAT);
		} else if(entity instanceof EntityMissileStealth) {
			bindTexture(ResourceManager.missileStealth_tex);
			ResourceManager.missileStealth.renderAll();
		} else {

			if(entity instanceof EntityMissileGeneric)
				bindTexture(ResourceManager.missileV2_HE_tex);
			if(entity instanceof EntityMissileIncendiary)
				bindTexture(ResourceManager.missileV2_IN_tex);
			if(entity instanceof EntityMissileCluster)
				bindTexture(ResourceManager.missileV2_CL_tex);
			if(entity instanceof EntityMissileBunkerBuster)
				bindTexture(ResourceManager.missileV2_BU_tex);
			if(entity instanceof EntityMissileDecoy)
				bindTexture(ResourceManager.missileV2_decoy_tex);
			
			GL11.glShadeModel(GL11.GL_SMOOTH);
			ResourceManager.missileV2.renderAll();
			GL11.glShadeModel(GL11.GL_FLAT);
		}
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return ResourceManager.missileV2_HE_tex;
	}

}
