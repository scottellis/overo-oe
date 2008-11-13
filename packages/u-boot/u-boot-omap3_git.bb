require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "b023699a1530a76804dc0212e7db5ec6bfb38f92"

PV = "2008.10+${PR}+git${SRCREV}"
PR="r5"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=omap3;protocol=git \
          "

UBOOT_MACHINE_beagleboard = "omap3_beagle_config"
UBOOT_MACHINE_omap3evm = "omap3_evm_config"
UBOOT_MACHINE_overo = "omap3_overo_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
