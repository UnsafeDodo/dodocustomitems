package unsafedodo.dodocustomitems;

import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
import eu.pb4.polymer.core.impl.networking.packets.PolymerItemGroupContent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import unsafedodo.dodocustomitems.item.FlanClaimPaper;

public class DodoCustomItems implements ModInitializer{

	public static final String MOD_ID = "dodocustomitems";
    public static final Logger LOGGER = LoggerFactory.getLogger("dodocustomitems");
	public static final FlanClaimPaper flanClaimPaper = new FlanClaimPaper(new FabricItemSettings().maxCount(64).rarity(Rarity.RARE), Items.PAPER);
	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier(DodoCustomItems.MOD_ID, "flanclaimpaper"), flanClaimPaper);
		LOGGER.info("Registering custom items by UnsafeDodo");

	}
}