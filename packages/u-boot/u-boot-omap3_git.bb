require u-boot.inc

FILESDIR = "${@os.path.dirname(bb.data.getVar('FILE',d,1))}/u-boot-omap3-git/${MACHINE}"

SRCREV = "d0d5a7de9813b662415fd599b55b0ff4f0400a54"

PV = "2008.10+${PR}+git${SRCREV}"
PR="r4"

SRC_URI = "git://www.sakoman.net/git/u-boot-omap3.git;branch=omap3;protocol=git \
          "

UBOOT_MACHINE_beagleboard = "omap3_beagle_config"
UBOOT_MACHINE_omap3evm = "omap3_evm_config"
UBOOT_MACHINE_overo = "omap3_overo_config"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
