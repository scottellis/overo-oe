require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "160b30a7f315ea2c7d76dd19250d723eedb283ee"

PV = "2008.10-rc3+${PR}+git${SRCREV}"
PR="r0"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=overo;protocol=git \
          "

UBOOT_MACHINE_beagleboard = "omap3_beagle_config"
UBOOT_MACHINE_omap3evm = "omap3_evm_config"
UBOOT_MACHINE_overo = "omap3_overo_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
