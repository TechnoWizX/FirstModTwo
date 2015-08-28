package com.technowizx.firstmod.init;

import com.technowizx.firstmod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstModTwoItem {
    public static Item maple_leaf;

    public static void init(){
        maple_leaf = new Item().setUnlocalizedName("maple_leaf");
    }

    public static void register(){
        GameRegistry.registerItem(maple_leaf, maple_leaf.getUnlocalizedName().substring(5));
    }

    public static void registerRenders(){
        registerRender(maple_leaf);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5)));
    }
}
