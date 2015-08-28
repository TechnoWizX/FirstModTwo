package com.technowizx.firstmodtwo.proxy;

import com.technowizx.firstmodtwo.init.FirstModTwoItem;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders(){
        FirstModTwoItem.registerRenders();
    }
}
