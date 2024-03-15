package net.conductor.reaping.item;

import net.conductor.reaping.Reaping;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item VOID_CLAW = registerItem("void_claw", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(VOID_CLAW);
    }

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reaping.MOD_ID, name), item);
}

    public static void registerModItems() {
        Reaping.LOGGER.info("Registering Mod Items for " + Reaping.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
