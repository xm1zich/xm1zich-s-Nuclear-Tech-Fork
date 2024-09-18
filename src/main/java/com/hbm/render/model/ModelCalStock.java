// Date: 24.10.2018 10:23:38
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.hbm.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCalStock extends ModelBase {
	// fields
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;
	ModelRenderer Shape22;

	public ModelCalStock() {
		textureWidth = 64;
		textureHeight = 32;

		Shape8 = new ModelRenderer(this, 0, 0);
		Shape8.addBox(0F, 0F, 0F, 15, 6, 3);
		Shape8.setRotationPoint(0F, 1F, -1.5F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 0, 9);
		Shape9.addBox(0F, 0F, 0F, 6, 1, 2);
		Shape9.setRotationPoint(7F, 7F, -1F);
		Shape9.setTextureSize(64, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 0, 12);
		Shape10.addBox(0F, 0F, 0F, 2, 5, 2);
		Shape10.setRotationPoint(10F, 8F, -1F);
		Shape10.setTextureSize(64, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, -0.2617994F);
		Shape11 = new ModelRenderer(this, 0, 26);
		Shape11.addBox(0F, 0F, 0F, 3, 4, 2);
		Shape11.setRotationPoint(19F, 3F, -1F);
		Shape11.setTextureSize(64, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 22);
		Shape12.addBox(-4F, 0F, 0F, 4, 2, 2);
		Shape12.setRotationPoint(19F, 3F, -1F);
		Shape12.setTextureSize(64, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, -0.1115358F);
		Shape13 = new ModelRenderer(this, 10, 28);
		Shape13.addBox(-5F, -2F, 0F, 5, 2, 2);
		Shape13.setRotationPoint(19F, 7F, -1F);
		Shape13.setTextureSize(64, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0.2617994F);
		Shape14 = new ModelRenderer(this, 12, 23);
		Shape14.addBox(0F, 0F, 0F, 1, 3, 2);
		Shape14.setRotationPoint(22F, 3F, -1F);
		Shape14.setTextureSize(64, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0.3490659F);
		Shape15 = new ModelRenderer(this, 42, 0);
		Shape15.addBox(0F, 0F, 0F, 3, 5, 8);
		Shape15.setRotationPoint(3F, 4F, -9.5F);
		Shape15.setTextureSize(64, 32);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 36, 0);
		Shape16.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape16.setRotationPoint(3.5F, 3.5F, -4F);
		Shape16.setTextureSize(64, 32);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 36, 0);
		Shape17.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape17.setRotationPoint(3.5F, 2.7F, -3.5F);
		Shape17.setTextureSize(64, 32);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 36, 0);
		Shape18.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape18.setRotationPoint(3.5F, 2.2F, -2.8F);
		Shape18.setTextureSize(64, 32);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 36, 0);
		Shape19.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape19.setRotationPoint(3.5F, 1.8F, -2F);
		Shape19.setTextureSize(64, 32);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		Shape20 = new ModelRenderer(this, 16, 9);
		Shape20.addBox(0F, 0F, 0F, 6, 1, 4);
		Shape20.setRotationPoint(7F, 4F, -2F);
		Shape20.setTextureSize(64, 32);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 8, 12);
		Shape21.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape21.setRotationPoint(11F, 0F, 0F);
		Shape21.setTextureSize(64, 32);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape22 = new ModelRenderer(this, 8, 14);
		Shape22.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape22.setRotationPoint(11F, -1F, 0F);
		Shape22.setTextureSize(64, 32);
		Shape22.mirror = true;
		setRotation(Shape22, -0.3490659F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape20.render(f5);
		Shape21.render(f5);
		Shape22.render(f5);
	}

	public void renderAll(float f5) {
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape20.render(f5);
		Shape21.render(f5);
		Shape22.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
