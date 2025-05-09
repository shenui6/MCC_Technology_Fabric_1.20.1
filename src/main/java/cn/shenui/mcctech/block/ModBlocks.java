package cn.shenui.mcctech.block;

import cn.shenui.mcctech.MCCTechnology;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static Block register(String id, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MCCTechnology.MOD_ID, id), block);
    }
}
