package com.technowizx.firstmod.proxy;

import com.technowizx.firstmod.init.FirstModTwoItem;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders(){
        FirstModTwoItem.registerRenders();
    }
}
