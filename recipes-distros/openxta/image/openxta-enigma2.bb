DESCRIPTION = "Merge machine and distro options to create a enigma2 machine task/package"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"
ALLOW_EMPTY_${PN} = "1"

PV = "1.0"
PR = "r28"

inherit packagegroup

#RCONFLICTS_${PN} = "enigma2-plugin-extensions-permanenttimeshift enigma2-plugin-systemplugins-skinselector"
#RREPLACES_${PN} = "enigma2-plugin-extensions-permanenttimeshift enigma2-plugin-systemplugins-skinselector"

DEPENDS = "enigma2-pliplugins openxta-feeds"

RRECOMMENDS_${PN} = "\
    openxta-version-info \
    enigma2-plugin-drivers-usbserial \
    enigma2-plugin-pli-softcamsetup \
    enigma2-plugin-extensions-graphmultiepg \
    enigma2-plugin-extensions-mediaplayer \
    enigma2-plugin-extensions-cutlisteditor \
    enigma2-plugin-extensions-extraspanel \
    enigma2-plugin-extensions-dvdplayer \
    enigma2-plugin-extensions-et-portal \
    enigma2-plugin-extensions-openxtareader \
    enigma2-plugin-systemplugins-videomode \
    enigma2-plugin-systemplugins-hotplug \
    enigma2-plugin-systemplugins-autoresolution \
    enigma2-plugin-systemplugins-videotune \
    enigma2-plugin-systemplugins-softwaremanager \
    enigma2-plugin-systemplugins-skinselector \
    enigma2-plugin-skins-technihd \
    enigma2-plugin-skins-xta2 \
    enigma2-plugin-skins-magnum32 \
    ${@base_contains("MACHINE_FEATURES", "3dtv", "enigma2-plugin-systemplugins-osd3dsetup" , "", d)} \
    "

RRECOMMENDS_${PN}_append_et4x00 = " enigma2-plugin-extensions-et-webbrowser"
RRECOMMENDS_${PN}_append_et6x00 = " enigma2-plugin-extensions-et-webbrowser"
RRECOMMENDS_${PN}_append_et9x00 = " enigma2-plugin-extensions-et-webbrowser"
