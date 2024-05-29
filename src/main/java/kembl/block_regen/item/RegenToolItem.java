package kembl.block_regen.item;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class RegenToolItem extends Item {
    public RegenToolItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide())
        {
            BlockPos bPos = pContext.getClickedPos();
            pContext.getPlayer().sendSystemMessage(Component.literal(
                    "block clicked at (" +
                            bPos.getX() + ", " +
                            bPos.getY() + ", " +
                            bPos.getZ() + ")"));
        }
        return InteractionResult.SUCCESS;
    }
}
