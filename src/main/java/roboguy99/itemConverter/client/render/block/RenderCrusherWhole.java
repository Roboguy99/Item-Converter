package roboguy99.itemConverter.client.render.block;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import roboguy99.itemConverter.client.model.ModelCrusher;
import roboguy99.itemConverter.util.ResourceManager;

public class RenderCrusherWhole extends TileEntitySpecialRenderer
{
	private final ResourceLocation texture = ResourceManager.CRUSHER_CONTROLS; //TODO Update texture
	private final ModelCrusher model;
	
	public RenderCrusherWhole()
	{
		this.model = new ModelCrusher();
	}
	
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float scale) 
	{
	    GL11.glPushMatrix();
	        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
	        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
	        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
	        this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
	}
}
