package minerforstone.debugstick.item;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class DebugStick extends Item {
	public DebugStick(String name, int id) {
		super(name, id);
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		world.setBlockMetadataWithNotify(blockX, blockY, blockZ, world.getBlockMetadata(blockX, blockY, blockZ) + (entityplayer.isSneaking() ? -1 : 1));
		return true;
	}
}
