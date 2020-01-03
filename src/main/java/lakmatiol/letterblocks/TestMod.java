package lakmatiol.letterblocks;

import org.sandboxpowered.sandbox.api.SandboxAPI;
import org.sandboxpowered.sandbox.api.addon.Addon;
import org.sandboxpowered.sandbox.api.block.BaseBlock;
import org.sandboxpowered.sandbox.api.block.Block;
import org.sandboxpowered.sandbox.api.block.Material;
import org.sandboxpowered.sandbox.api.item.BaseBlockItem;
import org.sandboxpowered.sandbox.api.item.Item;
import org.sandboxpowered.sandbox.api.util.Identity;

import java.util.HashMap;
import java.util.function.Supplier;

public class TestMod implements Addon {
    public static final String MODID = "testmod";

    private void registerBlock(SandboxAPI api, Identity id, BaseBlock block) {
        api.register(id, block);
        api.register(id, new BaseBlockItem(block, new Item.Settings()));
    }

    @Override
    public void init(SandboxAPI api) {
        Block.Settings common = new Block.Settings(Material.WOOD);
        registerBlock(api,  Identity.of(MODID, "testblock"), new BaseBlock(common));
    }
}
