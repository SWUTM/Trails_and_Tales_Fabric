package net.swutm.various_update.entity;

import net.minecraft.util.SignType;
import net.swutm.various_update.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType BAMBOO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("bamboo"));
    public static final SignType STRIPPED_BAMBOO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("stripped_bamboo"));
    public static final SignType CHISELED_STRIPPED_BAMBOO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("chiseled_stripped_bamboo"));
    public static final SignType COOLED_CHERRY =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cooled_cherry"));
}
