package com.scottyab.rootbeer;

/**
 * Created by mat on 19/06/15.
 */
public final class Const {

    // "This class is not for instantiation"
    public static final String MSG_COMST = "VGhpcyBjbGFzcyBpcyBub3QgZm9yIGluc3RhbnRpYXRpb24=";

    private Const() throws InstantiationException {
        throw new InstantiationException(MSG_COMST);
    }

    // TODO: Encode all the plain-text
    public static final String COM_NOSHUFOU_ANDROID_SU       = "com.noshufou.android.su";
    public static final String COM_NOSHUFOU_ANDROID_SU_ELITE = "com.noshufou.android.su.elite";
    public static final String EU_CHAINFIRE_SUPERSU          = "eu.chainfire.supersu";
    public static final String COM_KOUSHIKDUTTA_SUPERUSER    = "com.koushikdutta.superuser";
    public static final String COM_THIRDPARTY_SUPERUSER      = "com.thirdparty.superuser";
    public static final String COM_YELLOWES_SU               = "com.yellowes.su";

    public static final String[] knownRootAppsPackages = {
            "com.noshufou.android.su",
            "com.noshufou.android.su.elite",
            "eu.chainfire.supersu",
            "com.koushikdutta.superuser",
            "com.thirdparty.superuser",
            "com.yellowes.su",

    };

    // TODO: Encode all the plain-text
    public static final String[] knownDangerousAppsPackages = {
            "com.koushikdutta.rommanager",
            "com.koushikdutta.rommanager.license",
            "com.dimonvideo.luckypatcher",
            "com.chelpus.lackypatch",
            "com.ramdroid.appquarantine",
            "com.ramdroid.appquarantinepro"
    };

    // TODO: Encode all the plain-text
    public static final String[] knownRootCloakingPackages = {
            "com.devadvance.rootcloak",
            "com.devadvance.rootcloakplus",
            "de.robv.android.xposed.installer",
            "com.saurik.substrate",
            "com.zachspong.temprootremovejb",
            "com.amphoras.hidemyroot",
            "com.amphoras.hidemyrootadfree",
            "com.formyhm.hiderootPremium",
            "com.formyhm.hideroot"
    };

    // TODO: Encode all the plain-text
    public static final String[] suPaths ={
            "/data/local/",
            "/data/local/bin/",
            "/data/local/xbin/",
            "/sbin/",
            "/su/bin/",
            "/system/bin/",
            "/system/bin/.ext/",
            "/system/bin/failsafe/",
            "/system/sd/xbin/",
            "/system/usr/we-need-root/",
            "/system/xbin/"
    };

    // TODO: Encode all the plain-text
    public static final String[] pathsThatShouldNotBeWrtiable = {
            "/system",
            "/system/bin",
            "/system/sbin",
            "/system/xbin",
            "/vendor/bin",
            //"/sys",
            "/sbin",
            "/etc",
            //"/proc",
            //"/dev"
    };



}
