package org.niki3.ddu.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.niki3.ddu.Ddu;

public class addItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ddu.MODID);

    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("ddu_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(addItems.CRYSTAL_CUTTER.get());
        }
    };

    public static final RegistryObject<Item> CRYSTAL_CUTTER = ITEMS.register("crystal_cutter",
            () -> new crystal_cutter(Tiers.STONE,4,-1.6F,new Item.Properties().tab(CREATIVE_TAB).durability(500)));
    public static final RegistryObject<Item> ECHO_LOCATOR = ITEMS.register("echo_locator",
            () -> new EchoLocatorItem(new Item.Properties().tab(CREATIVE_TAB)));
    public static final RegistryObject<Item> WOOL_BOOTS = ITEMS.register("wool_boots",
            () -> new wool_boots(armors.WOOL, EquipmentSlot.FEET,new Item.Properties().tab(CREATIVE_TAB)));
}
