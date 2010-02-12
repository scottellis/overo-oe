require x-load.inc

DEFAULT_PREFERENCE_am3517-evm = "-1"
DEFAULT_PREFERENCE_omap3-pandora = "-1"

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/x-load-git/${MACHINE}"

SRCREV = "5eae9fb96b90370c7e11b757e6de3ac0df4dfd51"

PV = "1.43+${PR}+gitr${SRCREV}"
PR ="r8"
PE = "1"

SRC_URI = " \
           git://gitorious.org/x-load-omap3/mainline.git;branch=master;protocol=git \
          "

SRC_URI_append_beagleboard = " \
                              file://name.patch;patch=1 \
                             "

SRC_URI_append_omap3-touchbook = " \
                              file://name.patch;patch=1 \
                              file://screen-off.patch;patch=1 \
                             "


SRC_URI_append_am3517-evm = " \
                                 file://xload-shiva.diff;patch=1 \
"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
