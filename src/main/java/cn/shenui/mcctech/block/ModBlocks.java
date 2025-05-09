package cn.shenui.mcctech.block;

import cn.shenui.mcctech.MCCTechnology;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block AC_RAIN_KR1 = register("ac_rain_kr1", new Block(AbstractBlock.Settings.create().strength(1.5F, 6.0F)));

    public static Block register(String id, Block block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCCTechnology.MOD_ID, id), block);
    }

    public static void registerBlockItem(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(MCCTechnology.MOD_ID, id),
        new BlockItem(block, new Item.Settings()));

    }

    public static final RegistryKey<ItemGroup> MCC_AC_GROUP = register("mcc_ac_group");
    private static RegistryKey<ItemGroup> register(String id) {
            return  RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MCCTechnology.MOD_ID, id));
    }

    public static void  registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                MCC_AC_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.mcc_ac_group"))
                        .icon(() -> new ItemStack(ModBlocks.AC_RAIN_KR1))
                        .entries(((displayContext, entries) -> {
                            entries.add(ModBlocks.AC_RAIN_KR1);
                        })).build());
    }

    private static void addItemToItemGroup(FabricItemGroupEntries entries) {
        entries.add(AC_RAIN_KR1);
    }

    public static void registerModBlocks(){

    }
}
