package me.falsehonesty.guitesting.gui;

import net.minecraft.util.EnumChatFormatting;

import java.awt.*;

/**
 * Copyright 2017 (c) FalseHonesty
 */

public class LogoItem extends GuiItem {

    @Override
    public void drawItem(int mouseX, int mouseY) {
        fr.renderStringWithShadow(EnumChatFormatting.WHITE + "PODCRASH" + EnumChatFormatting.GOLD + "+",
                5, 5, Color.WHITE.getRGB());
    }

    @Override
    public void mouseClick(int mouseX, int mouseY) { }
}
