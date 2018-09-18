package com.lee.learn.dp.behavioralpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Checker manager = new AssetManager();

        Checker zhangsan = new AssetOwner("Zhangsan");
        Checker lisi = new AssetOwner("Lisi");

        Asset computerBelongToZhangsan = new Computer(11L, "zhangsan");
        Asset computerBelongsToLisi = new Computer(12L, "Lisi");

        Asset phoneBelongsToZhangsan = new Phone(21L, "Zhangsan");
        Asset phoneBelongsToLisi = new Phone(22L, "Lisi");

        List<Asset> assets = new ArrayList<>();
        assets.add(computerBelongToZhangsan);
        assets.add(computerBelongsToLisi);
        assets.add(phoneBelongsToZhangsan);
        assets.add(phoneBelongsToLisi);

        for (Asset asset : assets) {
            asset.accept(manager);
            asset.accept(zhangsan);
            asset.accept(lisi);
        }
    }
}
