package com.tangpj.order.pojo;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Menu {

    public Map<String,Boolean> menus;

    @Inject
    public Menu( Map<String,Boolean> menus){
        this.menus = menus;
    }

    Map<String,Boolean> getMenus(){
        return menus;
    }

}
