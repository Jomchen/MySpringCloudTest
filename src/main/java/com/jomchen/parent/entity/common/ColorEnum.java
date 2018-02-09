package com.jomchen.parent.entity.common;

import java.util.EnumSet;

/**
 * create by Jomchen on 2018/2/9
 */
public enum ColorEnum {

    BLACK("黑色", -1),
    WHITE("白色", 0),
    RED("红色", 1),
    GREEN("绿色", 2),
    BLUE("蓝色", 3),
    YELLOW("黄色", 4),
    PINK("粉色", 5),
    BROWN("褐色", 6),
    SILLVER("银色", 7),

    ;


    String colorName;
    Integer colorCode;

    ColorEnum(String colorName, Integer colorCode) {
        this.colorName = colorName;
        this.colorCode = colorCode;
    }

    public static ColorEnum getColorEnumByAttribute(Integer colorCode) {
        if (null == colorCode) return null;
        EnumSet<ColorEnum> enumSet = EnumSet.allOf(ColorEnum.class);
        for (ColorEnum colorEnum : enumSet) {
            if (colorEnum.colorCode.intValue() == colorCode) {
                return colorEnum;
            }
        }
        return null;
    }
    public static ColorEnum getColorEnumByAttribute(String colorName) {
        if (null == colorName) return null;
        EnumSet<ColorEnum> enumSet = EnumSet.allOf(ColorEnum.class);
        for (ColorEnum colorEnum : enumSet) {
            if (colorEnum.colorName.equals(colorName)) {
                return colorEnum;
            }
        }
        return null;
    }


}
