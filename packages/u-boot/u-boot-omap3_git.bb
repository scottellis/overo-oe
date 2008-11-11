require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "d9f7a117b1a5007f114ee784294f39e0ce55e382"

PV = "2008.10+${PR}+git${SRCREV}"
PR="r2"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=evmmux;protocol=git \
          "

UBOOT_MACHINE_beagleboard = "omap3_beagle_config"
UBOOT_MACHINE_omap3evm = "omap3_evm_config"
UBOOT_MACHINE_overo = "omap3_overo_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
